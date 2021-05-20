package com.kh.chap02_abstractAndInterface.model.vo;
//상속
//미완성 클래스 / 클래스 extends(하나만 상속가능)
//인터페이스 : implements(여러개 가능)
public class FootBall extends Sports implements ISports1, ISports2 {

	@Override
	public void rule() {
		System.out.println("손이 아닌 발로 공을 차야된다.");
		
	}

	@Override
	public void startTime() {
		System.out.println("인터페이스 ISports2메소드 --> startTime()");
		
	}

	@Override
	public void EndTime() {
		System.out.println("인터페이스 ISports2메소드 --> EndTime()");
		
	}

	@Override
	public void rule1() {
		System.out.println("인터페이스 ISports1메소드 --> rule1()");
		
	}

}
