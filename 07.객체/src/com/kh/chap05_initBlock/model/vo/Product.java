package com.kh.chap05_initBlock.model.vo;

public class Product {

	//인스턴스변수
	//1. 아무 초기화없이 Product객체를 생성하여 출력시 JVM이 정한 기본값으로 초기화되어있음	
/*	
	private String pName;
	private int price;
	private static String brand;
*/	
	
	//2.필드에 명시적 초기화한 후 객체 생성하여 출력
	private String pName = "갤럭시";
	private int price = 1000000;
	private static String brand = "삼성";
	
	//3.static블럭 -> 클래스변수를 초기화시키는 블럭으로 프로그램 시작시 단한번만 초기화되고, 이것을 클래스 초기화
	static {
//		pName = "갤럭시1";  -> static블럭에서는 인스턴스 변수를 초기화하지 못함
//		price = 1000000;
		
		brand = "엘지";
	}
	
	//4.인스턴스 블록 - 인스턴스 변수를 초기화 시키는 블럭으로 객체 생성시마다 초기하된다. 생성자보다 먼저 실행됨
	{
		pName = "갤럭시9"; 
		price = 900000;
		
		//brand = "애플"; --> 인스턴스 블럭에서는 static필드도 초기화할 수 있지만 static 초기화 블럭은 
							//프로그램 시작시에 초기화된 것이므로 객체 생성이후 값을 초기화하는 인스턴스 초기화 블럭의 값으로 덮어쓰게된다.
	}
	
	public Product() {
	}
	
	public void setPname(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		Product.brand = brand;
	}
	
	public String getPname() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public static String getBrand() {
		return brand;
	}
	
	public String information() {
		return pName+" "+price+" "+brand;
	}
	
}
