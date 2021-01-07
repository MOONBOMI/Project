package com.example.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.CategoryVO;
import com.example.domain.CostVO;
import com.example.domain.DepositAccountVO;
import com.example.domain.DepositVO;
import com.example.domain.InvenVO;
import com.example.domain.LoansVO;
import com.example.domain.LoansAccountVO;
import com.example.domain.SalesVO;
import com.example.mapper_oracle.CategoryMapper;
import com.example.mapper_oracle.CostAccountMapper;
import com.example.mapper_oracle.DepositAccountMapper;
import com.example.mapper_oracle.InvenMapper;
import com.example.mapper_oracle.LoansAccountMapper;
import com.example.mapper_oracle.SalesMapper;
import com.example.service.DepositService;

import oracle.sql.DATE;

@Controller
public class CostAccountController {
   
   @Autowired
   CategoryMapper mapper;
   @Autowired
   CostAccountMapper cmapper;
   @Autowired
   DepositAccountMapper dmapper;
   @Autowired
   LoansAccountMapper lmapper;
   @Autowired
   SalesMapper smapper;
   @Autowired
	InvenMapper imapper;
   @Autowired
   DepositService service;
   
   
   //기초설정 대분류 중분류 입력
   @RequestMapping(value="categoryinsert", method=RequestMethod.POST)
   @ResponseBody
   public void categoryinsert(CategoryVO vo, HttpSession session) {
      String companyCode =(String)session.getAttribute("companyCode");
      String companyName =(String)session.getAttribute("companyName");
      String code=companyCode+"/"+vo.getCategorycode();
      String name=companyName+"/"+vo.getCategoryname();
      vo.setCategorycode(code);
      vo.setCategoryname(name);
      mapper.categoryinsert(vo);
   }
   
   //기초설정 중분류 입력시 대분류 호출
   @RequestMapping("categorylist.json")
   @ResponseBody
   public List<HashMap<String, Object>> categorylist(HttpSession session) {
      
      String companyCode =(String)session.getAttribute("companyCode");
      List<HashMap<String, Object>> array = mapper.categorylist(companyCode);
      return array;
   }
   
   //기초설정 예금 계정 추가 시 예금내역에 추가
   @RequestMapping(value="depositaccountinsert", method=RequestMethod.POST)
   @ResponseBody
   public void depositaccountinsert(DepositAccountVO vo, HttpSession session){
 	  dmapper.depositaccountinsert(vo);
       DepositVO dvo=new DepositVO();
       String companyCode=(String)session.getAttribute("companyCode");
       dvo.setDeposit_companyCode(companyCode);
       dvo.setDeposit_day(vo.getDepositAccount_startday());
       dvo.setDeposit_depositAccountCode(vo.getDepositAccountCode());
       dvo.setDepositAccountAmount(0);
       dvo.setDepositBalance(vo.getDepositAccountAmount());
       dvo.setDepositType("입금");
       System.out.println(companyCode+"............."+dvo.toString());
       dmapper.depositinsert(dvo);
       
   }
   
   //기초설정 시 대출 계정 추가시 대출계정에 추가
   @RequestMapping(value="loansaccountinsert", method=RequestMethod.POST)
   @ResponseBody
   public void loansaccountinsert(LoansAccountVO lvo, HttpSession session){
 	  lmapper.loansaccountinsert(lvo);
       LoansVO oldlvo=new LoansVO();
       String companyCode=(String)session.getAttribute("companyCode");
       oldlvo.setLoans_companyCode(companyCode);
       oldlvo.setLoans_loansAccountCode(lvo.getLoansAccountCode());
       oldlvo.setLoans_repaymentDay(lvo.getLoansAccount_startDay());
       oldlvo.setLoansAmount(0);
       oldlvo.setLoansBalance(lvo.getLoansAccountAmount());
       lmapper.loansinsert(oldlvo);
   }
   
   
 //로그인 후 설정 시 중분류 입력할때 대분류 읽기
   @RequestMapping("lcategorylist.json")
   @ResponseBody
   public List<HashMap<String, Object>> lcategorylist(HttpSession session) {
   
      String companyCode=   (String)session.getAttribute("companyCode");
      List<HashMap<String, Object>> array = mapper.lcategorylist(companyCode);
      return array;
   }
   
   //로그인 후 설정 시 대분류 읽기
   @RequestMapping(value="categorylist", method=RequestMethod.POST)
   @ResponseBody
   public void categorylist(CategoryVO vo) {
      mapper.categoryinsert(vo);
   }
   
   
   //로그인 후 대분류 업댓 및 입력
@RequestMapping(value="categoryupdate", method=RequestMethod.POST)
   @ResponseBody
   public List<HashMap<String,Object>> categoryupdate(String categorycode, String categoryname,HttpSession session) {
//      (String)session.getAttribute("companyCode");
      String companyCode=(String)session.getAttribute("companyCode");
      String companyName=(String)session.getAttribute("companyName");
      categorycode=companyCode+"/"+categorycode+"/000";
      categoryname=companyName+"/"+categoryname+"/empty";
      
      CategoryVO vo=mapper.categoryread(categorycode, categoryname);
      CategoryVO newvo=new CategoryVO();
      newvo.setCategorycode(categorycode);
      newvo.setCategoryname(categoryname);
      if(vo==null){
         mapper.categoryinsert(newvo);
         categorycode=categorycode.split("/")[1];
         categorycode=companyCode+"/"+categorycode+"/001";
         newvo.setCategorycode(categorycode);
         categoryname=categoryname.split("/")[1];
         categoryname=companyName+"/"+categoryname+"/";
         newvo.setCategoryname(categoryname);
         mapper.categoryinsert(newvo);
      }
      if(vo!=null){
          if(vo.getCategorycode().equals(categorycode)&&!vo.getCategoryname().equals(categoryname)){
             mapper.categoryupdate(newvo);
          }
       }
      
      List<HashMap<String,Object>> newarray=mapper.lcategorylist(companyCode);//�뾽�뙎 �썑 �뜲�씠�꽣
      
      return newarray;
   }
      
   //로그인 후 중분류 업댓 및 입력
         @RequestMapping(value="mcategoryupdate", method=RequestMethod.POST)
         @ResponseBody
         public List<HashMap<String,Object>> mcategoryupdate(String categorycode, String categoryname,HttpSession session) {
//            (String)session.getAttribute("companyCode");
            String companyCode=(String)session.getAttribute("companyCode");
            String companyName=(String)session.getAttribute("companyName");
            categoryname=companyName+"/"+categoryname;
            System.out.println(categorycode +"/"+ categoryname);
            CategoryVO vo=mapper.categoryread(categorycode, categoryname);
            CategoryVO newvo=new CategoryVO();
            newvo.setCategorycode(categorycode);
            newvo.setCategoryname(categoryname);
            if(vo!=null){
               if(vo.getCategorycode().equals(categorycode)&&!vo.getCategoryname().equals(categoryname)){
                  mapper.categoryupdate(newvo);
               }
            }
            if(vo==null){
               mapper.categoryinsert(newvo);
            }
            
            List<HashMap<String,Object>> newarray=mapper.lcategorylist(companyCode);//�뾽�뙎 �썑 �뜲�씠�꽣
            
            return newarray;
         }
         
         //로그인 후 예금 리스트 출력
         @RequestMapping("depositaccountlist.json")
         @ResponseBody
         public List<HashMap<String, Object>> depositlist(HttpSession session){
            
            String companyCode=(String)session.getAttribute("companyCode");
            List<HashMap<String, Object>> array=dmapper.depositaccountlist(companyCode);
            return array;
         }
   
 //재고 insert
 		@RequestMapping(value="insertinven" , method=RequestMethod.POST)
 		@ResponseBody
 		public void insertinven(InvenVO vo,HttpSession session){
 			String companyCode=(String)session.getAttribute("companyCode");
 			vo.setInven_companyCode(companyCode);
 			String accountCode =companyCode+"/"+vo.getInven_invenAccountCode();
 			vo.setInven_invenAccountCode(accountCode);
 			System.out.println(vo.toString());
 			imapper.insertinven(vo);
 			
 		}
   
     
      
      
   //비용 리스트
   @RequestMapping("costaccount.json")
   @ResponseBody
   public List<HashMap<String, Object>> costaccount(){
      List<HashMap<String, Object>> array=cmapper.costaccountlist();
      return array;
   }
   
   
   //비용입력
   @RequestMapping(value="costinsert", method=RequestMethod.POST)
   @ResponseBody
   public void costinsert(CostVO vo,HttpSession session) {
      if(vo.getDay() != null) {
    	  String companyCode=(String)session.getAttribute("companyCode");
    	  vo.setCompanyCode(companyCode);
    	  System.out.println(vo.toString());
         cmapper.costinsert(vo);
      }
   }
   

   
   //예금입력
      @RequestMapping(value="depositinsert", method=RequestMethod.POST)
      public void depositinsert(DepositVO vo,HttpSession session){
    	  String companyCode=(String)session.getAttribute("companyCode");
    	  vo.setDeposit_companyCode(companyCode);
    	  dmapper.depositinsert(vo);
         dmapper.depositaccountupdate(vo.getDepositBalance(),vo.getDeposit_depositAccountCode());
      }
   
   //��異� 怨꾩젙 insert�떆 由ъ뒪�듃 異쒕젰
   @RequestMapping("loansaccountlist.json")
   @ResponseBody
   public List<HashMap<String, Object>> loanslist(HttpSession session){
	   String companyCode=(String)session.getAttribute("companyCode");
      List<HashMap<String, Object>> array=lmapper.loansaccountlist(companyCode);
      return array;
   }
   
   //��異� �엯�젰 �썑 insert
   @RequestMapping(value="loansinsert", method=RequestMethod.POST)
   public void loansinsert(LoansVO vo,HttpSession session){
	   String companyCode=(String)session.getAttribute("companyCode");
	   vo.setLoans_companyCode(companyCode);
      lmapper.loansinsert(vo);
   }
   
   
   
   //매출 입력
   @RequestMapping(value="salesinsert", method=RequestMethod.POST)
   @ResponseBody
   public void salesinsert(SalesVO vo,HttpSession session){
      String companyCode=(String)session.getAttribute("companyCode");
//      List<SalesVO> array=smapper.saleslist(companyCode);
//      
//      for(int i=0; array.size()>i; i++){
//         ArrayList<String> date=new ArrayList<>();
//         date.add(array.get(i).getDay().substring(2,11));
//         System.out.println(array.get(i).getDay().substring(2,11));
//         System.out.println(date.get(i).toString());
//      }
      vo.setCompanyCode(companyCode);
      System.out.println(vo.toString());   
      smapper.salesinsert(vo);
      
   }
   
   

      
      //濡쒓렇�씤 �썑 �꽕�젙�뿉�꽌 �삁湲� 由ъ뒪�듃 read
      @RequestMapping("depositread.json")
      @ResponseBody
      public List<DepositAccountVO> depositread(HttpSession session) {
         String companyCode=(String)session.getAttribute("companyCode");
         List<DepositAccountVO> array=dmapper.depositread(companyCode);
         for(DepositAccountVO vo : array){
            String date=vo.getDepositAccount_startday().substring(0, 11);
            vo.setDepositAccount_startday(date);
         }
         return array;
      }
      
      //濡쒓렇�씤 �썑 �꽕�젙�뿉�꽌 ��異� 由ъ뒪�듃 read
      @RequestMapping("loansread.json")
      @ResponseBody
      public List<LoansAccountVO> loansread(HttpSession session) {
         String companyCode=  (String)session.getAttribute("companyCode");
         List<LoansAccountVO> larray=lmapper.loansread(companyCode);
         for(LoansAccountVO vo : larray){
            String start=vo.getLoansAccount_startDay().substring(0, 11);
            String end=vo.getLoansAccount_endDay().substring(0, 11);
            vo.setLoansAccount_endDay(end);
            vo.setLoansAccount_startDay(start);
         }
         return larray;
      }
   
   //怨꾩젙湲곗큹�벑濡�
   @RequestMapping("category")
   public void category() {
      
   }
   //濡쒓렇�씤 �썑 �엯�젰
   @RequestMapping("insert")
   public void insert(){
   }
   
   //濡쒓렇�씤 �썑 �꽕�젙
   @RequestMapping("categoryread")
   public void categoryread(){
      
   }
}