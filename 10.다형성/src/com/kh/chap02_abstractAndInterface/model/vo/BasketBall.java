package com.kh.chap02_abstractAndInterface.model.vo;

public class BasketBall extends Sports{
	//상속받는 순간
	//부모클래스에 있는 추상 메소드를 강제 오버라이딩하게 뜸, 또는 추상클래스로 명시하게 뜬다 --> 미완성상태이기 때문에
	
	@Override
	public void rule() {
		System.out.println("공을 던져서 링에 넣어야 한다. ");
		
	}

	
}
