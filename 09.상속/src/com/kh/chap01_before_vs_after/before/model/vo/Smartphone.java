package com.kh.chap01_before_vs_after.before.model.vo;

public class Smartphone {

	private String brand;  //브랜드
	private String pCode;  //상품번호
	private String pName;  //상품명
	private int price;  //가격
	
	private String mobileAgency;//통신사
	
	public Smartphone() {
		// TODO Auto-generated constructor stub
	}

	public Smartphone(String brand, String pCode, String pName, int price, String mobileAgency) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.mobileAgency = mobileAgency;
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

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	public String information() {
		return "brand : " + brand+" Code : "+pCode+" Name : "+pName+" price : "+price+" mobileAgency : "+mobileAgency;
	}

}