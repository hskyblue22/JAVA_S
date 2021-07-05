package com.sy.example.polymorphism.mvc.model.vo;

public class CookBook extends Book{
	
	private boolean coupon;  //요리학원쿠폰유무
	
	public CookBook() {
		// TODO Auto-generated constructor stub
	}

	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}

	public boolean isCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() +" / "+ coupon;
	}
	
}
