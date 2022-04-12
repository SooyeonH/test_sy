package com.javalec.team.dto;

public class ProductReview_dto {


	
	String pCode;
	String pCategoryname;
	String pName;
	String pImg_main;
	String pQuantity;
	String pPrice;
	int pClick;
	
	//Constructor
	public ProductReview_dto() {
		
	}

	public ProductReview_dto(String pCode, String pCategoryname, String pName, String pImg_main, String pQuantity,
			String pPrice, int pClick) {
		super();
		this.pCode = pCode;
		this.pCategoryname = pCategoryname;
		this.pName = pName;
		this.pImg_main = pImg_main;
		this.pQuantity = pQuantity;
		this.pPrice = pPrice;
		this.pClick = pClick;
	}

	
	
	
	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpCategoryname() {
		return pCategoryname;
	}

	public void setpCategoryname(String pCategoryname) {
		this.pCategoryname = pCategoryname;
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

	public int getpClick() {
		return pClick;
	}

	public void setpClick(int pClick) {
		this.pClick = pClick;
	}
	
	
	
	
	

	
	
}