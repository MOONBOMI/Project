package com.example.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.AdminVO;
import com.example.mapper_oracle.AdminMapper;
import com.example.mapper_oracle.CalendarMapper;
import com.example.mapper_oracle.ProductMapper;
import com.example.service.AdminService;

@Controller
public class LoginController {
	@Autowired
	CalendarMapper cMapper;
	
	@Autowired
    AdminService service;
 @Autowired
 AdminMapper aMapper;
  @Autowired
 ProductMapper mapper;
  
  @RequestMapping("lightBox")
  public void lightBox() {
  }
	
  @RequestMapping("schedule")
  public void schedule() {
  }
  
  @RequestMapping("login")
  public void login(){
  }
  
  @RequestMapping("company")
  public void company(){
  }
  
  @RequestMapping("mainlogin")
  public void mainlogin() {
  }

  @RequestMapping("main")
  public void main(){
  }
  
  
  @RequestMapping(value = "companyInsert", method=RequestMethod.POST)
     public String insertPost(AdminVO vo, @RequestParam("companyType") String companyType, HttpSession session){
        vo.setCompanyType(companyType);
        
        if(vo.getCompanyCode().length() <= 10) {
        	String companyCode = vo.getCompanyCode();
        	String c1 = companyCode.substring(0, 3);
        	String c2 = companyCode.substring(3, 5);
        	String c3 = companyCode.substring(5);
        	companyCode = c1 +"-"+ c2 +"-"+ c3;
        	vo.setCompanyCode(companyCode);
        }
        
        if(vo.getCompanyCorporate() != null) {
        	String companyCorporate = vo.getCompanyCorporate();
        	String cp1 = companyCorporate.substring(0, 6);
        	String cp2 = companyCorporate.substring(6);
        	companyCorporate = cp1 +"-"+ cp2;
        	vo.setCompanyCorporate(companyCorporate);
        }
        
        mapper.insert(vo);
        session.setAttribute("companyCode", vo.getCompanyCode());
        session.setAttribute("companyName", vo.getCompanyName());
        return "redirect:category";
     }
  
  @RequestMapping("pwChk.json")
  @ResponseBody
  public int pwChkJson(HttpSession session, String password) {
	  AdminVO vo = aMapper.read((String) session.getAttribute("adminId"));
	  String pw = vo.getAdminPassword();
	  int cnt = 0;
	  if(pw.equals(password)) {
		  cnt = 0;
	  }
	  if(!pw.equals(password)) {
		  cnt = 1;
	  }
	  return cnt;
	  
  }
  // 鍮꾨�踰덊샇 蹂�寃�
   @RequestMapping("pwUpdate")
   public void pwUpdate() {
   }

   @ResponseBody
   @RequestMapping(value = "pwUpdate", method = RequestMethod.POST)
   public String pwUpdatePost(AdminVO vo, HttpSession session, HttpServletResponse response, String adminPassword)
         throws Exception {
      AdminVO resultVO = aMapper.read(session.getAttribute("adminId").toString());
      // System.out.println(resultVO.toString()+session.getAttribute("adminId").toString());
      if (resultVO.getAdminId().equals(session.getAttribute("adminId"))) {
         // System.out.println("??????????????????????");
         aMapper.pwUpdate(vo.getAdminPassword(), resultVO.getCompanyCode(), resultVO.getAdminId());

      }
      return "redirect:pwUpdate";
   }
//  @RequestMapping(value = "insert", method = RequestMethod.POST)
//  public void insertPost(AdminVO vo) throws Exception {
////     // ���몴�씠誘몄� �븯�굹 �뾽濡쒕뱶
////     MultipartFile file = multi.getFile("file");
////     if (!file.isEmpty()) {
////        UUID uid = UUID.randomUUID();
////        String savedName = uid.toString() + "_" + file.getOriginalFilename();
////        File target = new File(path, savedName);
////        FileCopyUtils.copy(file.getBytes(), target);
////        vo.setLogoImage(savedName);
////
////     }
//     mapper.insert(vo);
//  }

   //  // �씠誘몄�異쒕젰
//  @RequestMapping("display") // display?fileName=6de77153-9004-4322-88dd-4403a01fe987_img24
//  @ResponseBody
//  public ResponseEntity<byte[]> display(String fileName) throws Exception {
//     ResponseEntity<byte[]> result = null;
//     // display fileName�씠 �엳�뒗 寃쎌슦
//     if (!fileName.equals("")) {
//        File file = new File(path + File.separator + fileName);
//        HttpHeaders header = new HttpHeaders();
//        header.add("Content-Type", Files.probeContentType(file.toPath()));
//        result = new ResponseEntity<>(FileCopyUtils.copyToByteArray(file), header, HttpStatus.OK);
//     }
//     return result;
//  }
  
  //�궗�뾽�옄 踰덊샇 ��由щ뒆
//   @RequestMapping("company.json")
//     @ResponseBody
//     public HashMap<String, String> companyJson(String number) throws Exception {
//        HashMap<String, String> array = new HashMap<>();
//        System.setProperty("webdriver.chrome.driver", "d:/spring/chromedriver.exe"); 
//        ChromeOptions options= new ChromeOptions();
//        options.addArguments("headless");
//        WebDriver driver = new ChromeDriver(options);
//        driver.get("https://teht.hometax.go.kr/websquare/websquare.html?w2xPath=/ui/ab/a/a/UTEABAAA13.xml");
//        
//
//        
//        WebElement insert= driver.findElement(By.xpath("//*[@id='bsno']"));
//        insert.sendKeys(number);
//        
//        
//        WebElement btnSearch = driver.findElement(By.xpath("//*[@id='trigger5']"));
//        btnSearch.click();
//        
//        WebDriverWait wait = new WebDriverWait(driver, 6);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='grid2_cell_0_1']")));
//        
//        WebElement result = driver.findElement(By.xpath("//*[@id='grid2_cell_0_1']"));
//        array.put("result", result.getText());
//        System.out.println(result.getText());
//        
//        
//        driver.quit();
//        return array;
//     }
   
 //사업자 번호 셀레니움
   @RequestMapping("company.json")
  @ResponseBody
  public HashMap<String, String> companyJson(String companyCode, AdminVO vo, HttpSession session,HttpServletResponse response) throws Exception {
     
     HashMap<String, String> array = new HashMap<>();
     System.setProperty("webdriver.chrome.driver", "c:/spring/chromedriver.exe"); //  諭� �뵬沃섎챶苡�  �젟 �벥
     ChromeOptions options= new ChromeOptions();
     options.addArguments("headless");
     WebDriver driver = new ChromeDriver(options);
     driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
     driver.get("https://teht.hometax.go.kr/websquare/websquare.html?w2xPath=/ui/ab/a/a/UTEABAAA13.xml");
     

     WebElement insert= driver.findElement(By.xpath("//*[@id='bsno']"));
     insert.sendKeys(companyCode);
     
     WebElement btnSearch = driver.findElement(By.xpath("//*[@id='trigger5']"));
     btnSearch.click();
     
     WebDriverWait wait = new WebDriverWait(driver, 6);
      wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='grid2_cell_0_1']")));
     
     WebElement result = driver.findElement(By.xpath("//*[@id='grid2_cell_0_1']"));
     array.put("companyCode", result.getText());
     System.out.println(result.getText());
     
     return array;
  }
   
   @ResponseBody
   @RequestMapping(value = "idCheck", method = RequestMethod.POST)
   public int idCheck(String adminId) {
      int count = mapper.idCheck(adminId);
      return count;
   }



   @ResponseBody
   @RequestMapping(value = "mainlogin", method = RequestMethod.POST)
   public int loginPost(AdminVO vo, boolean chkLogin, HttpSession session, HttpServletResponse response) {
      AdminVO resultVO = mapper.read(vo.getAdminId());

      if (resultVO != null) {
         if (!resultVO.getAdminPassword().equals(vo.getAdminPassword())) {
            return 2;
            // FAILED PW
         } else {
            session.setAttribute("adminId", resultVO.getAdminId());
            session.setAttribute("companyCode", resultVO.getCompanyCode());
            session.setAttribute("companyName", resultVO.getCompanyName());
            return 1; // SUCCESS
         }
      }
      return 0; // NO ID
   }

   @RequestMapping("logout")
   public String logOut(HttpSession session) {
      session.invalidate();
      return "redirect:login";
   }

   @RequestMapping("idCheck")
   public void idCheck() {
   }
   
   
  

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@RequestMapping("lcategorylist.json")
//	   @ResponseBody
//	   public List<HashMap<String, Object>> lcategorylist(HttpSession session) {
//		String companyCode = (String) session.getAttribute("companyCode");
//	      List<HashMap<String, Object>> array = cMapper.lcategorylist(companyCode);
//	      return array;
//	   }
	
}
