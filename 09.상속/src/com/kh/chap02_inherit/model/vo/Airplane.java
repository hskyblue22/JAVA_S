package com.kh.chap02_inherit.model.vo;

public class Airplane extends Vehicle {
	
	private int tire;
	private int wing;
	
	public Airplane() {
		// TODO Auto-generated constructor stub
	}

	public Airplane(String name, double mileage, String kind, int tire, int wing) {
		super(name, mileage, kind);
		
		this.tire = tire;
		this.wing = wing;		
		
	}

	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}

	public int getWing() {
		return wing;
	}

	public void setWing(int wing) {
		this.wing = wing;
	}

	
	@Override
	public String information() {
		// TODO Auto-generated method stub
		return "Airplane [" + super.information() +" tire = "+tire+" wing = "+wing +" ]";
	}

	@Override
	public void howToMove() {
		System.out.println("날개를 가지고 날아다닌다.");
	}
	
	
}
