package com.example.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

public class DepositAccountVO {

	private String depositaccountcode;
	private String depositaccountbankname;
	private String depositaccountname;
	private String depositaccountrate;
	private String depositaccount_startday;
	private String depositaccountamount;
	
	
	public String getDepositaccountcode() {
		return depositaccountcode;
	}
	public void setDepositaccountcode(String depositaccountcode) {
		this.depositaccountcode = depositaccountcode;
	}
	public String getDepositaccountbankname() {
		return depositaccountbankname;
	}
	public void setDepositaccountbankname(String depositaccountbankname) {
		this.depositaccountbankname = depositaccountbankname;
	}
	public String getDepositaccountname() {
		return depositaccountname;
	}
	public void setDepositaccountname(String depositaccountname) {
		this.depositaccountname = depositaccountname;
	}
	public String getDepositaccountrate() {
		return depositaccountrate;
	}
	public void setDepositaccountrate(String depositaccountrate) {
		this.depositaccountrate = depositaccountrate;
	}
	public String getDepositaccount_startday() {
		return depositaccount_startday;
	}
	public void setDepositaccount_startday(String depositaccount_startday) {
		this.depositaccount_startday = depositaccount_startday;
	}
	public String getDepositaccountamount() {
		return depositaccountamount;
	}
	public void setDepositaccountamount(String depositaccountamount) {
		this.depositaccountamount = depositaccountamount;
	}
	
	
	@Override
	public String toString() {
		return "DepositAccountVO [depositaccountcode=" + depositaccountcode + ", depositaccountbankname="
				+ depositaccountbankname + ", depositaccountname=" + depositaccountname + ", depositaccountrate="
				+ depositaccountrate + ", depositaccount_startday=" + depositaccount_startday
				+ ", depositaccountamount=" + depositaccountamount + "]";
	}
	
	
	
	
}
