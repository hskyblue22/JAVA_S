package com.hw1.model.vo;

public class Guests {

	private String name;
	private int age;
	private char gender;
	private double heigth;
	
	public Guests() {
		// TODO Auto-generated constructor stub
	}

	public Guests(String name, int age, char gender, double heigth) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.heigth = heigth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
}
