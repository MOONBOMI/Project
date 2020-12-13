package com.example.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

public class LoansAccountVO {

	private String loansaccountcode;
	private String loansaccountbankname;
	private String loansaccountname;
	private String loansaccountrate;
	private String loansaccountamount;
	private String loansaccount_startday;
	private String loansaccount_endday;
	
	public String getLoansaccountcode() {
		return loansaccountcode;
	}
	public void setLoansaccountcode(String loansaccountcode) {
		this.loansaccountcode = loansaccountcode;
	}
	public String getLoansaccountbankname() {
		return loansaccountbankname;
	}
	public void setLoansaccountbankname(String loansaccountbankname) {
		this.loansaccountbankname = loansaccountbankname;
	}
	public String getLoansaccountname() {
		return loansaccountname;
	}
	public void setLoansaccountname(String loansaccountname) {
		this.loansaccountname = loansaccountname;
	}
	public String getLoansaccountrate() {
		return loansaccountrate;
	}
	public void setLoansaccountrate(String loansaccountrate) {
		this.loansaccountrate = loansaccountrate;
	}
	public String getLoansaccountamount() {
		return loansaccountamount;
	}
	public void setLoansaccountamount(String loansaccountamount) {
		this.loansaccountamount = loansaccountamount;
	}
	public String getLoansaccount_startday() {
		return loansaccount_startday;
	}
	public void setLoansaccount_startday(String loansaccount_startday) {
		this.loansaccount_startday = loansaccount_startday;
	}
	public String getLoansaccount_endday() {
		return loansaccount_endday;
	}
	public void setLoansaccount_endday(String loansaccount_endday) {
		this.loansaccount_endday = loansaccount_endday;
	}
	
	@Override
	public String toString() {
		return "LoansAccountVO [loansaccountcode=" + loansaccountcode + ", loansaccountbankname=" + loansaccountbankname
				+ ", loansaccountname=" + loansaccountname + ", loansaccountrate=" + loansaccountrate
				+ ", loansaccountamount=" + loansaccountamount + ", loansaccount_startday=" + loansaccount_startday
				+ ", loansaccount_endday=" + loansaccount_endday + "]";
	}
	
	
}
