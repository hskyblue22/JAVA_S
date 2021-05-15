package com.method.hw3.run;

import com.method.hw3.controller.StaticSample;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("value : " );
		StaticSample.toUpper();
		StaticSample.valueLength();
		StaticSample.valueConcat("PROGRAMMING");
		StaticSample.setChar(0, 'C');
		
		/*value : Java
		대문자로 : JAVA
		길이 : 4
		PROGRAMMING 붙여서 : JAVAPROGRAMMING
		J => C : CAVA
		 * */
		
	}

}
