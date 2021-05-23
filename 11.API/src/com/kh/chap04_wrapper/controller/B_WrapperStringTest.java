package com.kh.chap04_wrapper.controller;

public class B_WrapperStringTest {

	//기본자료형 <--> String
	
	public void method1() {
		String str1 = "10";
		String str2 = "15.3";
		
		
		System.out.println(str1 + str2);
		

		//1.String --> 기본자료형으로 바꾸기 위해서
		//해당 Wrapper클래스.parseXXX() 사용
		
		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		
		System.out.println(i+d);
		
		
		//2.기본자료형 --> String으로 바꾸기 위해
		//기본자료형 --> Wrapper --> String
		//해당 Wrapper클래스.valueOf().toString()
		
		String strI1 = Integer.valueOf(i).toString();  //valueOf : Integer객체로 반환
		String strD1 = Double.valueOf(d).toString();
		
		String strI = String.valueOf(i);
		String strD = String.valueOf(d);
		
		System.out.println(strI1);
		System.out.println(strI);
		
		
		
		
		
	}
	
	
	
	
}
