package com.javalec.team.dto;

import java.sql.Timestamp;

public class ServiceCenter1vs1_dto {

	int iCode;
	String iTitle;
	String iContent;
	Timestamp iDate;
	String iReply;
	int iViews;
	
	public ServiceCenter1vs1_dto() {
		
	}

	public ServiceCenter1vs1_dto(int iCode, String iTitle, String iContent, Timestamp iDate, String iReply,
			int iViews) {
		super();
		this.iCode = iCode;
		this.iTitle = iTitle;
		this.iContent = iContent;
		this.iDate = iDate;
		this.iReply = iReply;
		this.iViews = iViews;
	}

	public int getiCode() {
		return iCode;
	}

	public void setiCode(int iCode) {
		this.iCode = iCode;
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

	public int getiViews() {
		return iViews;
	}

	public void setiViews(int iViews) {
		this.iViews = iViews;
	}
	
}
