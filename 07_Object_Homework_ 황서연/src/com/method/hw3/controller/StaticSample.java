package com.method.hw3.controller;

public class StaticSample {

	// Field : 필드
	private static String value;

	
	// setter/getter 메소드 : 값 변경용, 조회용 메소드
	public static String getValue() {  //필드 "static" => setter,getter메소드 "static" 붙여줘야함
		return value;                    
	}

	public static void setValue(String value) {  
		StaticSample.value = value;  //this.value = value(X)
	}
	
	
	// 추가적인 메소드 : 해당 클래스에 존재하는 필드를 가지고 작업해야되는 메소드
	public static void toUpper() {
		// value 필드 값을 모두 대문자로 변경 --> char 배열 응용
		char[] cArr = new char[value.length()];
		
		String temp = "";
		for(int i=0; i<cArr.length; i++) {
			cArr[i] = value.toUpperCase().charAt(i);
			temp += cArr[i];
		}
		value = temp;
	}
	
	public static void setChar(int index, char c) {
		// 전달받은 인덱스 위치의 value 값을 전달받은 문자로 변경하는 static 메소드
		value = value.substring(0, index) + c + value.substring(index+1);
		
//		char[] cArr = value.toCharArray();
//		
//		cArr[index] = c;
//		
//		value = String.valueOf(cArr);
	}
	
	public static int valueLength() {
		// value 필드 값에 기록되어 있는 문자 갯수 리턴
		return value.length();
	}
	
	public static String valueConcat(String str) {
		// 문자열 값을 전달받아 value 필드 값과 하나로 합쳐서 리턴
		return value+str;
	}
	
}
