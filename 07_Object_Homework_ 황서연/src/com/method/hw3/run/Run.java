package com.method.hw3.run;

import com.method.hw3.controller.StaticSample;

public class Run {

	//테스트 출력은 main 함수에서 value 에 접근하여 출력
	public static void main(String[] args) {

		StaticSample.setValue("Java");
		System.out.println("value : "+ StaticSample.getValue());
		
		StaticSample.toUpper();
		System.out.println("대문자로 : "+ StaticSample.getValue());
		
		System.out.println("길이 : "+ StaticSample.valueLength());
		
		System.out.println("PROGRAMMING : "+ StaticSample.valueConcat("PROGRAMMING"));
		
		StaticSample.setChar(0, 'C');
		System.out.println("J => C : "+ StaticSample.getValue());
		
		/*value : Java
		대문자로 : JAVA
		길이 : 4
		PROGRAMMING 붙여서 : JAVAPROGRAMMING
		J => C : CAVA
		 * */
		
	}

}
