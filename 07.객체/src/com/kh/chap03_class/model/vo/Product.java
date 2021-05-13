package com.kh.chap03_class.model.vo;

public class Product {

	private String pName;
	private int price;
	private String brand;
	
	//기본생성자 -> 없어도 알아서 생성됨
//	public Product() {
//		// TODO Auto-generated constructor stub
//	}
	
	public void setPname(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getPname() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	
	public String information() {
		return pName+" "+price+" "+brand;
	}
	
	
//	DftProduct d = new DftProduct();  가능 but 이런식으로는 잘 사용하지 않음

}

class DftProduct{ //default 접근제어자
	private String dName;
	
	public void setDname(String dName) {
		this.dName = dName;
	}
	
	
}
