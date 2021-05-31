package com.hw3.model.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Book implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2753138171733043766L;
	private String title;
	private String author;
	private int price;
	private Calendar dates;
	private double discountRate;
	
	
	public Book() {
		// TODO Auto-generated constructor stub
	}


	public Book(String title, String author, int price, Calendar dates, double discountRate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.dates = dates;
		this.discountRate = discountRate;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public Calendar getDates() {
		return dates;
	}


	public void setDates(Calendar dates) {
		this.dates = dates;
	}


	public double getDiscountRate() {
		return discountRate;
	}


	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		Date cal_to_date = dates.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일");
		
		return title+" "+author +" "+ price +" "+ sdf.format(cal_to_date) +" "+ discountRate ;
		//C언어 김씨 10000 2012년 02월 02일 출간 0.1
	}
	
	
	
	
}
