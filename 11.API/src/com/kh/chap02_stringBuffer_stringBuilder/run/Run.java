package com.kh.chap02_stringBuffer_stringBuilder.run;

public class Run {

	public static void main(String[] args) {
		// String 클래스의 원리
		// String a 값에 게속 값을 더해가는 경우 새로운 String 클래스가 만들어진다.

		// StringBuffer 나 StringBuilder의 원리

		// 새로운 객체를 생성시키지 않고, 기존에 있는 객체의 크기를 증가시키면서 값을 더한다.
		// * 응답시간
		// String > StringBuffer > StringBuilder
		// * 메모리
		// String > StringBuffer == StringBuilder
		
		
		method1();
		method2();
		method3();

	}

	private static void method3() {
		StringBuilder sb = new StringBuilder("난");
		
		//append : 뒤에 값 추가
		sb.append("배가 고프다").append("!!!!!"); //메소드 체이닝(여러 메소드 이어서 호출)
		
		System.out.println(sb);
		System.out.println(sb.capacity());  //17(16+1)
		System.out.println(sb.length());
		
		//insert : 삽입
		sb.insert(1, "저녁시간전이라~");
		System.out.println(sb);
		
		//delete : 삭제
		sb.delete(0, 8);
		System.out.println(sb);
		
		//reverse : 반전
		sb.reverse();
		System.out.println(sb);
		
	}

	private static void method2() {
		String str = "반가워";
		
		System.out.println("str 기존 : " + str +"  주소: "+System.identityHashCode(str));
		str += " 난 스트링이라고 해";
		System.out.println("str 기존 : " + str +"  주소: "+System.identityHashCode(str));
		//주소값 새로 생성
		
		
		StringBuffer sbf = new StringBuffer("안녕~~");
		System.out.println("sbf 기존 : " + sbf +"  주소: "+System.identityHashCode(sbf));
		sbf.append(" 난 스트링 버퍼야");
		System.out.println("sbf 기존 : " + sbf +"  주소: "+System.identityHashCode(sbf));
		//주소값 동일
		
		
		StringBuilder sbd = new StringBuilder("Wow");
		System.out.println("sbd 기존 : " + sbd +"  주소: "+System.identityHashCode(sbd));
		sbd.append(" 난 스트링빌더야");
		System.out.println("sbd 기존 : " + sbd +"  주소: "+System.identityHashCode(sbd));
		//주소값 동일
		
		
		
	}

	private static void method1() {
		StringBuilder sb = new StringBuilder("환불원정대");
		System.out.println(sb.capacity()); //sb의 크기- 21(16+5)
		System.out.println(sb.length());   //sb안 들어있는 문자열 크기 -5
		
		StringBuilder sb1 = new StringBuilder(20);  //기본 메모리 확보크기를 정해서 객체를 생성할 수도 있다.
		System.out.println(sb1.capacity()); //- 20
	}

}
