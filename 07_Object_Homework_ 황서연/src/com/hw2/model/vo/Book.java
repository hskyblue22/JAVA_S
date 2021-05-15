package com.hw2.model.vo;

public class Book {

	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(String title, int price, double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	//String형으로 반환하는 메소드
	public String information() {
		return title+" "+price+" "+discountRate+" "+author;
	}
	
	//반환형X 매개변수O 메소드
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//반환형O 매개변수X 메소드
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public String getAuthor() {
		return author;
	}
	
	
	
}
