package com.kh.variable;

public class D_Cast {
	// 형변환 : 값의 자료형을 바꾸는 것
		/*
		 *  * 컴퓨터에서의 값 처리 규칙 (즉, 형 변환이 필요한 상황)
		 *  1. 대입 연산자를 기준으로 왼쪽과 오른쪽은 같은 자료형이여야된다. 
		 *  --> 즉, 같은 자료형에 해당하는 값만 대입이 가능하다. 다른 자료형의 값을 대입하고자 한다면 형변환이 필수
		 *      자료형 변수명 = (자료형)값;
		 *  
		 *  2. 같은 자료형끼리만 계산이 가능 --> 계산 결과도 같은 자료형으로 나옴!
		 *     값 + 값		=> 두 값이 같은 자료형이여야됨!
		 *  
		 *  * 형 변환의 종류
		 *  1. 자동 형변환	--> 자동으로 형변환이 이루어져 우리가 형변환을 시켜줄 필요 없다. 
		 *  
		 *  2. 강제(명시적) 형변환 --> 자동으로 형변환이 안되서 우리가 직접 형변환을 해줘야됨
		 *  
		 *     [표현법] (바꿀자료형)값
		 *     
		 *     (바꿀자료형) 을 cast연산자 즉, 형변환 연산자라고 함
		 *  
		 *  * 주의사항
		 *  boolean은 형변환이 불가하다 오직 true, false의 값만을 가질 수 있다. 
		 *  
		 */
	
	public void rule1() {
		/*자동형변환
		 * 값의 범위가 작은 자료형과 큰 자료형 간의 연산(대입,계산 등)시
		 * 컴파일러가 자동으로 범위가 작은 자료형을 큰 자료형으로 변환 처리해준다.
		 * */
		short s = 1;
		int i = s;  //분명 대입 연산자를 기준으로 왼쪽과 오른쪽의 자료형이 다르지만 문제 없음
		
		
		//1.int(4byte) --> double(8byte)
		
		int i1 = 12;
		System.out.println("i1 : " + i1);
		
		double d1 = i1;
		System.out.println("d1 : " + d1);
		
		
		int i2 = 12;
		double d2 = 3.3;
		
		double result = i2 + d2;
		System.out.println("result : " + result);  //int형과 double형의 연산결과가 double형으로 자동변환딤.
		
		
		//2.int(4byte) --> long(8byte)
		
		int i3 = 3333;
		long l3 = i3;
		
		
		int i4 = 2147483647;
		long l4 = 1000000000L;
		
		long result2 = i4 + l4;
		System.out.println("result2 : " + result2);
		
		
		//3. float(4byte) --> double(8byte)
		
		float f5 = 1.0f;
		double d5 = f5;
		
		System.out.println("f5 : " + f5);
		System.out.println("d5 : " + d5);
		
		
		//4.long(8byte) --> float(4byte)
		
		long l6 = 1000000000L;
		float f6 = l6;
		
		System.out.println("f6 : " + f6);
		
		
		//5. char(2byte) --> int(4byte)
		
		int num = 'A';
		System.out.println("num : "+ num);
		
		/*char -> int형으로 변환이 가능한 이유
		 * char라는 자료형에 값(숫자) 들어오면 해당 숫자와 일치하는 유니코드표에서 찾아서 출력한다.
		 * */
		
		char ch = 65;
		System.out.println("ch : "+ch);
		
		//ch = -65; //char형은 음수값 저장 불가 -> 값의 범위가 0~65535까지이기 때문
		
		byte b2 = 1;
		byte b3 = 10;
		
		//byte result3 = b2 + b3; --> byte나short는 연산시 무조건 int형으로 처리, 따라서 강제형변환 필요
		
		byte result3 = (byte)(b2 + b3); //강제 형변환해줘야 함
		
		
		/* 
		 * int형 리터럴로 초기화가 가능한 자료형
		 * byte, short, char, int
		 * -> 1) 초기화 시 입력 값을 int형 리터럴로 인식하지 않고 그냥 정수로 인식
		 *    2) 컴파일러가 저장하려는 자료형의 값의 범위와 일치하는지 검사하여
		 *       일치하면 입력값을 저장하려는 자료형으로 변환하여 저장
		 *    3) 값의 범위가 일치하지 않으면 에러 발생  
		 * 
		 * -> 초기화 된 이후 위 자료형들의 연산 시 무조건 int형으로 처리
		 */
	
		// 자동형변환 : 작은 크기의 자료형이 자동으로 큰 크기의 자료형으로 바뀌는 거 (형변환 생략 가능)
		// 다른 자료형들 끼리의 연산 시 작은자료형 -> 큰 자료형으로 자동 형변환 후 연산처리됨.
		
		
		
		}
	public void rule2() {
		//강제형변환: 큰 크기의 자료형을 작은 크기의 자료형으로 바꾸는 것(형변환 생략 불가)
		
		//double(8byte) --> float(4byte)
		double d = 4.0;
		//float f = d; --> 에러 발생
		
		float f = (float) d;

		//double(8byte) --> int(4byte)
		
		int iNum = 10;
		double dNum = 5.89;
		
		//int iSum = iNum + dNum; -> 10.0 + 5.89 -> 15.89 double형 --> int형으로 대입 불가능
	
		//해결방법
		//1.수행결과를 int형으로 강제 형변환
		int iSum = (int)(iNum + dNum);
		System.out.println("iSum : "+ iSum); //실수->정수형 : 강제형변환시 소수점 아래부분이 모두 버려짐.
		
		//2. double 형 값을 int형으로 강제 형변환.
		int iSum2 = iNum + (int)dNum;
		System.out.println("iSum2 : "+ iSum2);
		
		//3. 연산결과를 double형으로 받음
		double dSum = iNum + dNum;
		System.out.println("dSum : "+ dSum);
		
		
		byte bNum = 1;
		byte sNum = 2;
		
		//byte result = bNum + sNum;
		
		//방법1 연산결과를 byte 또는 short로 강제 형변환
		byte bSum = (byte)(bNum + sNum);
		short sSum = (short)(bNum + sNum);
		
		System.out.println("bSum : " + bSum);
		System.out.println("sSum : " + sSum);
		
		
		//방법2 실행결과를 int형으로 저장
		int sum2 = bNum + sNum;
		System.out.println("sum2 : " + sum2);
	
		
		int temp1 =290;
		byte temp2 = (byte)temp1;
		
		System.out.println("temp2 : " + temp2); //계산하기 쉽지 않은 데이터 손실이 발생하기 때문에 주의해서 사용해야한다.
		
	}
	
	
	public void stringTest() {
		//리터럴 : stringpool(heap)에 담김 : 이미 값이 있으면 주소를 생성하지 않는다.
		//new : 무조건 heap에서 새로운 인스턴스 객체를 생성, 반환 타입이 참조형이라는 것은 객체의 주소를 반환한다는 것을 의미한다.
		String s = "안녕하세요"; //stringpool생성됨
		String s1 = "안녕하세요"; //이미 존재
		String s2 = new String("안녕하세요"); //heap생성
		
		System.out.println("--------------------------------");
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		System.out.println("--------------------------------");
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode()); //hashcode는 다 같은 곳에 저장한다.
		
		System.out.println("--------------------------------");
		
		String t = "정지훈"; //stringpool 생성
		String t1 = "이효리"; //stringpool 생성
		String t2 = new String("유재석"); //heap 생성
		String t3 = "유재석"; //stringpool 생성
		String t4 = "이효리"; //이미 존재
		
		System.out.println("t: " + System.identityHashCode(t));
		System.out.println("t1: " +System.identityHashCode(t1));
		System.out.println("t2: " +System.identityHashCode(t2));
		System.out.println("t3: " +System.identityHashCode(t3));
		System.out.println("t4: " +System.identityHashCode(t4));
		
		System.out.println("--------------------------------");
		
		System.out.println("t4 : " + t4);
		System.out.println(System.identityHashCode(t4));
	
		t4 = "싹스리";
		System.out.println(System.identityHashCode(t4));
		System.out.println("t4 : " + t4);
		t4 = "이효리";
		System.out.println(System.identityHashCode(t4));
		System.out.println("t4 : " + t4);
		
		System.out.println("--------------------------------");
		
		
		System.out.println("t2 : " + t2);
		System.out.println(System.identityHashCode(t2));
		t2 = "놀면뭐하니";
		System.out.println(System.identityHashCode(t2));
		System.out.println("t4 : " + t4);
		t2 = new String("유재석"); //있어도 새로 생김
		System.out.println(System.identityHashCode(t2));
		System.out.println("t2 : " + t2);
		
		/*
		 * System.identityHashCode : Hashcode와 같이 주소값을 의미, os(system)에서 가지고 있는 주소값
		 * hashcode :  객체가 메모리에 가진 해쉬 주소값을 의미, 10진수(string에서는 재정의 되어있다.)
		 * */
		
	
	}
}
