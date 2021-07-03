package com.sy.example.inherit.p1.model.vo;

public class Person {

	protected String name;
	private int age;
	private double height;
	private double weight;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int age, double height, double weight) {
		super();
		this.age = age;
		this.height = height;
		this.weight = weight;
	}



	public String information() {
		return name +" "+ age +" "+ height +" "+ weight;
	}
}
