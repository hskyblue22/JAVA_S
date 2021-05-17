package com.hw1.model.vo;

public class Employee extends Person {

	private int salary;
	private String dept;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);  //생성자로 접근은 반드시 첫줄
		super.name = name;  //name값은 부모 필드 값에 직접 접근해서 초기화
		this.salary = salary;
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String information() {
		return "Employee [ " +super.information()+" salary : "+salary+" dept : "+dept +" ]";
	}
	
	
	
	
	
	
}
