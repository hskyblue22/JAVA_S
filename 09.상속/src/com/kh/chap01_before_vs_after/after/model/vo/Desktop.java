package com.kh.chap01_before_vs_after.after.model.vo;

public class Desktop extends Product{

	private boolean allInone;
	
	public Desktop() {
		// TODO Auto-generated constructor stub
	}

	//alt + shift + s -> 아래 생성자
	public Desktop(String brand, String pCode, String pName, int price, boolean allInone) {
		super(brand, pCode, pName, price);  //super()생성자에서 부모생성자를 호출하여 사용, 생성자로 접근은 반드시 첫줄
		
		//super.pCode = pCode;  직접접근일때는 부모필드의 접속 제어자를 protected여야한다.(접근하고자 하는 필드가 private일때는 접근불가)
		//super. 외 super는 해당객체의 부모주소를 담고있다. 따라서 super.으로 접근가능
		
		
		this.allInone = allInone;
	}

	public boolean isAllInone() {
		return allInone;
	}

	public void setAllInone(boolean allInone) {
		this.allInone = allInone;
	}

	//alt + shift + s
	@Override
	public String information() {
		// TODO Auto-generated method stub
		return super.information() + " allInone : " + allInone;
	}
	
//	public void print() {
//		System.out.println("나 desktop이야");
//	}
	
}
