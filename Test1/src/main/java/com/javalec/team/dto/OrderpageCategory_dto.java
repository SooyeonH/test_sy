package com.javalec.team.dto;

public class OrderpageCategory_dto {
	String user_uId;
	String pImg_main;
	String pName ;
	String oQuantity ;
	String oPrice ;
	String oDecision ;
	public OrderpageCategory_dto(String user_uId, String pImg_main, String pName, String oQuantity, String oPrice,
			String oDecision) {
		super();
		this.user_uId = user_uId;
		this.pImg_main = pImg_main;
		this.pName = pName;
		this.oQuantity = oQuantity;
		this.oPrice = oPrice;
		this.oDecision = oDecision;
	}
	public String getUser_uId() {
		return user_uId;
	}
	public void setUser_uId(String user_uId) {
		this.user_uId = user_uId;
	}
	public String getpImg_main() {
		return pImg_main;
	}
	public void setpImg_main(String pImg_main) {
		this.pImg_main = pImg_main;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getoQuantity() {
		return oQuantity;
	}
	public void setoQuantity(String oQuantity) {
		this.oQuantity = oQuantity;
	}
	public String getoPrice() {
		return oPrice;
	}
	public void setoPrice(String oPrice) {
		this.oPrice = oPrice;
	}
	public String getoDecision() {
		return oDecision;
	}
	public void setoDecision(String oDecision) {
		this.oDecision = oDecision;
	}
	
	
	
	
}//end
