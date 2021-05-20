package com.kh.chap01_poly.part02_electronic.model.vo;

public class Notebook extends Electronic{

	private int usbPort;
	
	public Notebook() {
		// TODO Auto-generated constructor stub
	}

	public Notebook(String brand, String name, int price, int usbPort) {
		super(brand, name, price);
		this.usbPort = usbPort;
	}

	public int getUsbPort() {
		return usbPort;
	}

	public void setUsbPort(int usbPort) {
		this.usbPort = usbPort;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Notebook : "+super.toString()+" usbPort: "+usbPort;
	}
	
	
	
}
