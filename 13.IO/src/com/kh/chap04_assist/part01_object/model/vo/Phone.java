package com.kh.chap04_assist.part01_object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable{  //객체를 직렬화해주는 인터페이스
	/**
	 * 
	 */
	private static final long serialVersionUID = 2797846286390670200L;
	//직렬화 : 객체를 입출력하고자 한다면 반드시 직렬화 과정이 필수!
	//역직렬화에 UID 필요 -> 명시해줘야 함
	

	private String brand;
	private int price;
	
	
	public Phone() {
		
	}


	public Phone(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Phone [brand = "+ brand + ",price = "+price+"]";
	}
	
	
}
