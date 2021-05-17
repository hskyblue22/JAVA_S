package com.kh.chap01_before_vs_after.before.model.vo;

public class Desktop {

	private String brand;  //브랜드
	private String pCode;  //상품번호
	private String pName;  //상품명
	private int price;  //가격
	
	private boolean allInone; //일체 여부

	public Desktop() {
		// TODO Auto-generated constructor stub
	}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInone) {
	super();
	this.brand = brand;
	this.pCode = pCode;
	this.pName = pName;
	this.price = price;
	this.allInone = allInone;

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAllInone() {
		return allInone;
	}

	public void setAllInone(boolean allInone) {
		this.allInone = allInone;
	}
	
	public String information() {
		return "brand : " + brand+" Code : "+pCode+" Name : "+pName+" price : "+price+" allInone : "+allInone;
	}
	
	
}
