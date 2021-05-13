package com.kh.chap01_Abstraction.model.vo;

//vo : value object : 데이터 전달 및 표현 관리, 계층간 데이터 교환, 테이블 컬럼들 정의하고 모아놓은 단위
/* 클래스의 구조
 * 
 * public class 클래스명{
 * 		//필드부
 * 
 * 		//생성자부
 * 
 * 		//메소드부
 * 
 *  * }
 * */


//학생을 추상화해서 만든 클래스(아직은 미완성) --> 클래스 구조체와 메소드(함수)의 결합 (지금은 구조체)
public class Student {
	
	//필드부
	//접근제한자[예약어] 자료형 변수명;  --> 예약어는 나중에
	
	//접근제한자 : 접근할 수 있는 범위 제한할 수 있다.(public > protected(상속 간 관계) > default(같은 패키지) > private)
	
	public String name;
	public int age;
	public double height;
	public int kor;
	public int math;
	//생성자부
	
	//메소드부

}
