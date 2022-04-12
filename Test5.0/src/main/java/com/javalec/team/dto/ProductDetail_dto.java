package com.javalec.team.dto;

public class ProductDetail_dto {

	String pCode;
	String pImg_detail;
	String pImg_main;
	String pName;
	String pQuantity;
	String pPrice;
	
	
	//c
	
	public ProductDetail_dto() {
		
	}


	public ProductDetail_dto(String pCode, String pImg_detail, String pImg_main, String pName, String pQuantity,
			String pPrice) {
		super();
		this.pCode = pCode;
		this.pImg_detail = pImg_detail;
		this.pImg_main = pImg_main;
		this.pName = pName;
		this.pQuantity = pQuantity;
		this.pPrice = pPrice;
	}


	
	
	
	//m
	
	
	public String getpCode() {
		return pCode;
	}


	public void setpCode(String pCode) {
		this.pCode = pCode;
	}


	public String getpImg_detail() {
		return pImg_detail;
	}


	public void setpImg_detail(String pImg_detail) {
		this.pImg_detail = pImg_detail;
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


	public String getpQuantity() {
		return pQuantity;
	}


	public void setpQuantity(String pQuantity) {
		this.pQuantity = pQuantity;
	}


	public String getpPrice() {
		return pPrice;
	}


	public void setpPrice(String pPrice) {
		this.pPrice = pPrice;
	}



	
	
	
}