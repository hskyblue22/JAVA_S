package com.sy.example.object.m1;

public class Product {

	String productId;
	String productName;
	String productArea;
	int price;
	double tax;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String productId, String productName, String productArea, int price, double tax) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductArea() {
		return productArea;
	}

	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public String information() {
		return productId + " " + productName+ " "  + productArea+ " "  + price+ " "  +tax;
	}
}
