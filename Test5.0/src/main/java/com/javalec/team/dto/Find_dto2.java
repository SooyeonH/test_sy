package com.javalec.team.dto;

public class Find_dto2 {

	String uId;
	String uName;
	String uEmail;
	String uPw;
	
	public Find_dto2(String uId, String uName, String uEmail, String uPw) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.uEmail = uEmail;
		this.uPw = uPw;
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
	
	
	
	
}
