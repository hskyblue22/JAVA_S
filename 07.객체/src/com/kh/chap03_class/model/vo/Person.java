package com.kh.chap03_class.model.vo;

public class Person {

	//필드부
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	
	//생성자부 : ctrl+space - Constructor
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	
	//메소드부
	//set -> 반환X -> void
	public void setId(String id) {
		this.id = id;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	//get -> 반환 -> 자료형
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	
	public String information() {
		return id +" "+pwd+" "+name+" "+age+" "+gender+" "+phone+" "+email;
	}
	
}
