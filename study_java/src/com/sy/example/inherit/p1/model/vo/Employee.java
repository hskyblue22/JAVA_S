package com.sy.example.inherit.p1.model.vo;

public class Employee extends Person{

	private int salary;
	private String dept;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		super.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	@Override
	public String information() {
		// TODO Auto-generated method stub
		return super.information() +" "+ salary + " "+ dept;
	}
}
