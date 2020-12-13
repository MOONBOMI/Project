package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.DepositAccountVO;
import com.example.domain.LoansAccountVO;
import com.example.mapper_oracle.DepositAccountMapper;
import com.example.mapper_oracle.LoansAccountMapper;
import com.example.service.DepositService;

@Controller
public class DepositAccountController {

	@Autowired
	DepositService service;
	
	@RequestMapping(value="depositaccountinsert", method=RequestMethod.POST)
	@ResponseBody
	public void depositaccountinsert(DepositAccountVO vo){
		service.depositaccountinsert(vo);
	}
	
	@RequestMapping(value="loansaccountinsert", method=RequestMethod.POST)
	@ResponseBody
	public void loansaccountinsert(LoansAccountVO lvo){
		service.loansaccountinsert(lvo);
	}
	
	@RequestMapping("depositaccount")
	public void depositaccount(){
		
	}

}
	
