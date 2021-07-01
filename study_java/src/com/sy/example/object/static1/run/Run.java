package com.sy.example.object.static1.run;

import com.sy.example.object.static1.controller.StaticSample;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticSample ss = new StaticSample();
		/*
		ss.setValue("Java");
		String sValue = ss.getValue();
		
		System.out.println("value : "+ sValue);
		
		ss.toUpper();
		System.out.println("대문자로 : " + sValue);
		
		System.out.println("길이 : "+ ss.valueLength());
		
		String p = "PROGRAMMING";
		System.out.println(p+" 붙여서 : " + ss.valueConcat(p));
		
		char c = 'J';
		ss.setChar(0, c);
		System.out.println("J => C : " + sValue);
		*/
		
//		value : Java
//		대문자로 : Java
//		길이 : 4
//		PROGRAMMING 붙여서 : JAVAPROGRAMMING
//		J => C : Java
		
		ss.setValue("Java");
		
		System.out.println("value : "+ ss.getValue());
		
		ss.toUpper();
		System.out.println("대문자로 : " + ss.getValue());
		
		System.out.println("길이 : "+ ss.valueLength());
		
		String p = "PROGRAMMING";
		System.out.println(p+" 붙여서 : " + ss.valueConcat(p));
		
		char c = 'J';
		ss.setChar(0, 'C');
		System.out.println("J => C : " + ss.getValue());
		
	}

}
