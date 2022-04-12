package com.javalec.team.dto;

import java.sql.Timestamp;

public class ServiceCenter1vs1Detail_dto {
int iNum;
String iCode;
String user_uId;
String user_uEmail;
String iTitle;
String iContent;
Timestamp iDate;
String iReply;
Timestamp iReDate;
String iReContent;
public ServiceCenter1vs1Detail_dto(int iNum, String iCode, String user_uId, String user_uEmail, String iTitle,
		String iContent, Timestamp iDate, String iReply, Timestamp iReDate, String iReContent) {
	super();
	this.iNum = iNum;
	this.iCode = iCode;
	this.user_uId = user_uId;
	this.user_uEmail = user_uEmail;
	this.iTitle = iTitle;
	this.iContent = iContent;
	this.iDate = iDate;
	this.iReply = iReply;
	this.iReDate = iReDate;
	this.iReContent = iReContent;
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
public String getUser_uEmail() {
	return user_uEmail;
}
public void setUser_uEmail(String user_uEmail) {
	this.user_uEmail = user_uEmail;
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
public Timestamp getiReDate() {
	return iReDate;
}
public void setiReDate(Timestamp iReDate) {
	this.iReDate = iReDate;
}
public String getiReContent() {
	return iReContent;
}
public void setiReContent(String iReContent) {
	this.iReContent = iReContent;
}



}
