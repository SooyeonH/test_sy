package com.javalec.team.dto;

import java.sql.Timestamp;

public class ServiceCenter1vs1_dto {
	
	int iNum;
	String iCode;
	String user_uId;
	String iTitle;
	String iContent;
	Timestamp iDate;
	String iReply;
	
	public ServiceCenter1vs1_dto() {
		
	}

	public ServiceCenter1vs1_dto(int iNum, String iCode, String user_uId, String iTitle, String iContent,
			Timestamp iDate, String iReply) {
		super();
		this.iNum = iNum;
		this.iCode = iCode;
		this.user_uId = user_uId;
		this.iTitle = iTitle;
		this.iContent = iContent;
		this.iDate = iDate;
		this.iReply = iReply;
	}

	public int getiNum() {
		return iNum;
	}

	public void setiNum(int iNum) {
		this.iNum = iNum;
	}

	public String getiCode() {
		return iCode;
	}

	public void setiCode(String iCode) {
		this.iCode = iCode;
	}

	public String getUser_uId() {
		return user_uId;
	}

	public void setUser_uId(String user_uId) {
		this.user_uId = user_uId;
	}

	public String getiTitle() {
		return iTitle;
	}

	public void setiTitle(String iTitle) {
		this.iTitle = iTitle;
	}

	public String getiContent() {
		return iContent;
	}

	public void setiContent(String iContent) {
		this.iContent = iContent;
	}

	public Timestamp getiDate() {
		return iDate;
	}

	public void setiDate(Timestamp iDate) {
		this.iDate = iDate;
	}

	public String getiReply() {
		return iReply;
	}

	public void setiReply(String iReply) {
		this.iReply = iReply;
	}

	
}
