package com.javalec.team.dto;

import java.sql.Timestamp;

public class Wishlist_dto {
	//Field
	
	String pName;
	String pImg_main;
	int cQuantity;
	Timestamp cDate;
	String pCode;
	int pPrice;
	//Constructor
	
	
	public Wishlist_dto() {
		
	}


	public Wishlist_dto(String pName, String pImg_main, int cQuantity, Timestamp cDate, String pCode, int pPrice) {
		super();
		this.pName = pName;
		this.pImg_main = pImg_main;
		this.cQuantity = cQuantity;
		this.cDate = cDate;
		this.pCode = pCode;
		this.pPrice = pPrice;
	}


	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	public String getpImg_main() {
		return pImg_main;
	}


	public void setpImg_main(String pImg_main) {
		this.pImg_main = pImg_main;
	}


	public int getcQuantity() {
		return cQuantity;
	}


	public void setcQuantity(int cQuantity) {
		this.cQuantity = cQuantity;
	}


	public Timestamp getcDate() {
		return cDate;
	}


	public void setcDate(Timestamp cDate) {
		this.cDate = cDate;
	}


	public String getpCode() {
		return pCode;
	}


	public void setpCode(String pCode) {
		this.pCode = pCode;
	}


	public int getpPrice() {
		return pPrice;
	}


	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	
	
	
	



	
}