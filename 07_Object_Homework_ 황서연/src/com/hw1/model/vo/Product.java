package com.hw1.model.vo;

public class Product {

	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(String productId, String productName, String productArea, int price, double tax) {
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;	
	}
	
	public String information() {
		return productId+"\t"+productName+"\t"+productArea+"\t"+price+"\t"+tax;
	}
	
	
	public void setproductId(String productId) {
		this.productId = productId;
	}
	public void setproductName(String productName) {
		this.productName = productName;
	}
	public void setproductArea(String productArea) {
		this.productArea = productArea;
	}
	public void setprice(int price) {
		this.price = price;
	}
	public void settax(double tax) {
		this.tax = tax;
	}
	
	public String getproductId() {
		return productId;
	}
	public String getproductName() {
		return productName;
	}
	public String getproductArea() {
		return productArea;
	}
	public int getprice() {
		return price;
	}
	public double gettax() {
		return tax;
	}
	
}
