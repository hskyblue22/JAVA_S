package com.kh.chap01_String.run;

public class Run {

	public static void main(String[] args) {
		//Run.method1();
		new Run().method2();
	}

	private void method2() {  //static없음
		String str = "abc";
		
		//charAt(해당인덱스) : 문자 뽑아내기
		System.out.println(str.charAt(2));
		
		//concat : 문자열 합치기
		System.out.println(str.concat("def"));
		
		//contains : 포함여부 확인
		System.out.println(str.contains("ab"));
		
		//equals : 동등여부확인(문자값이 일치)
		System.out.println(str.equals("abc"));
		
		//length() : 문자열 길이(문자열에 포함된 문자 갯수)
		System.out.println(str.length());
		
		
		//split : 문자구분 (특수기호를 기준으로 각가을 문자열 배열로 쪼개서 반환하는 메소드)
		String str1 = "a,bc,de";
		
		String[] strArr = str1.split(",");
		
		for(int i=0 ; i<strArr.length; i++) {
			System.out.println(strArr[i]);  //아주 중요
		}
		
		for(String arr : strArr) {
			System.out.println(arr);
		}
		
		//toUpperCase : 대문자로
		//toLowerCase : 소문자로
		//equalsIgnoreCase : 대소문자 상관없이 문자열 비교(boolean)
		
		String strCase1 = "Abc";
		String strCase2 = "aBc";
		
		System.out.println(strCase1.toUpperCase());
		System.out.println(strCase2.toLowerCase());
		
		System.out.println(strCase1.equalsIgnoreCase(strCase2));
		
		//trim : 문자열 양쪽 공백을 제거
		String str2 = "       ab c     ";
		System.out.println(str2);
		System.out.println(str2.trim());
		
	}

	private static void method1() {
		//1.문자열을 리터럴로 생성 -> 동등한 값을 가진 객체는 새로 생성X
		String str = "abc";  //heap객체 생성
		
		String str1 = "abc";
		
		String str2 = "def";
		
		//2.문자열을 new생성자()로 생성 -> 동등한 값의 유무와 상관없이 새로 생성
		String str3= new String("abc");
		String str4= new String("abc");
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
			
	}

}
