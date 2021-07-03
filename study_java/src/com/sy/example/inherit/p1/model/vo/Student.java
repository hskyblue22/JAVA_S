package com.sy.example.inherit.p1.model.vo;

public class Student extends Person{

	private int grade;
	private String major;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, double height, double weight,int grade, String major) {
		super(age, height, weight);
		super.name = name;
		this.grade = grade;
		this.major = major;
	}

	@Override
	public String information() {
		// TODO Auto-generated method stub
		return super.information() +" "+ grade +" "+ major;
	}
	
	
}
