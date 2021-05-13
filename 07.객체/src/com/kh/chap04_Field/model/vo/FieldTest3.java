package com.kh.chap04_Field.model.vo;


//클래스변수(static) 에 대해 알아보기
public class FieldTest3 {
	
	//전역변수의 일종인 클래스변수는 static 예약어가 붙은 변수
	
	//static - 프로그램을 실행하자마자 static메모리 영역에 할당됨, static은 공유의 개념
	//일반변수는 이 클래스로 객체를 생성해야만 그 변수가 메모리에 올라간다면, static이 붙은 변수는 프로그램 실행과 동시에 메모리에 올라간다.

	
	public static String pubsta = "public static";
	private static String prista = "private static";
	
	public FieldTest3() {
		// TODO Auto-generated constructor stub
	}
	
	//pubsta는 접근제한자가 public익, 언제 어디서든 접근가능하기 때문에 setter,getter메소드가 필요없음
	//private 변수에 대해서만 만들어주자, static예약어가 붙으면 메소드 또한 static을 붙여서 만들어야 한다.
	
	public static void setPrista(String prista) {  //여기도 static붙는다.
		//this.prista = prista;  //this -> 객체의 주소값 가지고 있음 / static은 객체 생성하지 않고 프로그램 실행과 동시에 static영역에 할당되므로 this가 존재하지 않는다.
		FieldTest3.prista = prista;
	}
	
	public static String getPrista() {
		return prista;
	}
	
}
