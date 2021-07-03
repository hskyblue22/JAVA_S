package com.sy.example.inherit.p2.model.vo;

public class Circle extends Point{

	private int radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		
		super.draw();
		
		double s = Math.PI * radius * radius;
		double l = Math.PI * radius * 2;
		
		System.out.printf("면적 : %.1f\n",s);
		System.out.printf("둘레 : %.1f\n",l);
	}
	
}
