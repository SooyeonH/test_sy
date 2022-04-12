package com.javalec.team.dto;

public class MPinformation_dto {
	
	String uId;
	String uName;
	String uEmail;
	String uPw;
	String uPhone1;
	String uPhone2;
	String uBank;
	String uAccount;
	String uAddress;

public MPinformation_dto(String uId, String uName, String uEmail, String uPw, String uPhone1, String uPhone2,
		String uBank, String uAccount, String uAddress) {
	super();
	this.uId = uId;
	this.uName = uName;
	this.uEmail = uEmail;
	this.uPw = uPw;
	this.uPhone1 = uPhone1;
	this.uPhone2 = uPhone2;
	this.uBank = uBank;
	this.uAccount = uAccount;
	this.uAddress = uAddress;
}

public String getuId() {
	return uId;
}

public void setuId(String uId) {
	this.uId = uId;
}

public String getuName() {
	return uName;
}

public void setuName(String uName) {
	this.uName = uName;
}

public String getuEmail() {
	return uEmail;
}

public void setuEmail(String uEmail) {
	this.uEmail = uEmail;
}

public String getuPw() {
	return uPw;
}

public void setuPw(String uPw) {
	this.uPw = uPw;
}

public String getuPhone1() {
	return uPhone1;
}

public void setuPhone1(String uPhone1) {
	this.uPhone1 = uPhone1;
}

public String getuPhone2() {
	return uPhone2;
}

public void setuPhone2(String uPhone2) {
	this.uPhone2 = uPhone2;
}

public String getuBank() {
	return uBank;
}

public void setuBank(String uBank) {
	this.uBank = uBank;
}

public String getuAccount() {
	return uAccount;
}

public void setuAccount(String uAccount) {
	this.uAccount = uAccount;
}

public String getuAddress() {
	return uAddress;
}

public void setuAddress(String uAddress) {
	this.uAddress = uAddress;
}



}
