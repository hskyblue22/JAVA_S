package com.kh.variable; //다른 패키지이기때문에 같은 클래스명을 적어도 에러 안남

public class A_Variable {
	// 변수란 : 어떠한 값을 메모리에 기억하기 위한 공간이다 (박스같은개념)
	/* 변수를 사용하는 이유 :
	 * 변수는 우선적으로 값에 의미를 부여하기위한 목적으로 사용 한다. (가독성이 좋아짐)
	 * 또한 한번값을 저장해두고 계속 사용할 목적으로 사용된다. 
	 * 
	 * -> 유지보수를 쉽게 하기위한 목적
	*/
	
	public void printValue() {
		System.out.println("변수사용전");
		System.out.println(2 * 3.14592020202 * 10);
		System.out.println(3.14592020202 * 10 * 10);
		System.out.println(3.14592020202 * 10 * 10 * 20);
		System.out.println(4 * 3.14592020202 * 10 * 10);
		
		double pi = 3.14592020202;
		int r = 10;
		int h = 20;
		
		System.out.println("변수사용후");
		System.out.println(2 * pi * r );
		System.out.println(pi * r * r );
		System.out.println(pi * r  * r  * h);
		System.out.println(4 * pi *  r  * r );		
	}
	
	public void declareVariable() {
		/*
		 *  변수의 선언 (저장할 값을 기록하기 위한 변수를 메모리 공간에 확보해놓는 과정) == 변수(박스)만들겠다!! 
		 * [표현법] 자료형 변수명;
		 * 
		 * 자료형 : 어떤 값을 담아낼지, 어떤 크기의 값을 담아낼지에 대해 변수(박스)의 크기 및 모양을 정하는 부분
		 * 변수명 : 변수(박스)의 이름을 정하는 부분 (의미부여) -> 여기서 지정한 이름으로 앞으로 호출
		 * 
		 * 주의할점
		 * - 변수명은 반드시 첫 문자가 소문자여야된다. 
		 * - 하지만 여러단어로 엮어 있는경우 연결되는 단어의 첫글자는 대문자 
		 * - 동일한 변수명으로 선언 불가
		 * - 해당 영역({})에 선언한 변수는 해당 지역 안에서만 꺼내 쓸수 있다. (다른 메소드에서는 사용 불가)
		 *   == 지역변수 개념
		 * 
		 */	
		
		//자료형에 대한 개념
		//1.논리형
		boolean isTrue; //true,false,1,0 //1byte
		
		//2.숫자형
		//2_1 정수형
		byte bNum;    //1byte
		short sNum;   //2byte
		int iNum;     //4byte -> 정수형 중에 가장 대표적인 자료형(기본형) -21억~21억xxx까지의 값이 담기는 자료형
		long lNum;    //8byte
		
		//2_2 실수형
		float fNum;   //4byte
		double dNum;  //8byte -> 실수형 중에 가장 대표적인 자료형(기본형)
		
		//3.문자형
		char ch;      //2byte
		
		//---------------------------여기까지 기본자료형(8개)
		
		//4.문자열(참조자료형)
		String str;
		
		/* 변수에 값 대입
		 * 위에서 값을 담기위한 공간을 확보했다면 해당 변수에 값대입 가능
		 * 
		 * [표현법] 변수명 = 값;
		 * */
		
		isTrue = true;
		
		bNum = 1;
		sNum = 2;
		iNum = 5;
		lNum = 8L;    ////반드시 L를 붙여야함
		 
		fNum = 4.0f;  //반드시 f를 붙여야함
		dNum = 8.0;   //d를 붙이지 않아도 된다.
		
		ch = 'A';     //따옴표를 사용하여 값 대입
		//ch = 'ABC'    문자에는 한 문자가 저장됨
		
		ch = '강';
		
		str = "A";    //한 개의 문자만 쓰더라도 쌍따옴표 이용
		
		//변수에 담긴값 호출하여 출력
		System.out.println("isTrue의 값 " + isTrue);
		System.out.println("bNum의 값 " + bNum);
		System.out.println("sNum의 값 " + sNum);
		System.out.println("iNum의 값 " + iNum);
		System.out.println("lNum의 값 " + lNum);
		System.out.println("fNum의 값 " + fNum);
		System.out.println("dNum의 값 " + dNum);
		System.out.println("ch의 값 " + ch);
		System.out.println("str의 값 " + str);
	}
	
	public void initVariable() {
		
		/*
		 * 변수 선언과 동시에 초기화
		 * */
		
		boolean isTrue = true;
		
		byte bNum = 1;
		short sNum = 2;
		int iNum = 5;
		long lNum = 8L;    ////반드시 L를 붙여야함
		 
		float fNum = 4.0f;  //반드시 f를 붙여야함
		double dNum = 8.0;   //d를 붙이지 않아도 된다.
		
		char ch = 'A';     //따옴표를 사용하여 값 대입
		//ch = 'ABC'    문자에는 한 문자가 저장됨
		
		ch = '강';
		
		String str = "B오후반";    //한 개의 문자만 쓰더라도 쌍따옴표 이용
		
		//변수에 담긴값 호출하여 출력
		System.out.println("isTrue의 값 " + isTrue);
		System.out.println("bNum의 값 " + bNum);
		System.out.println("sNum의 값 " + sNum);
		System.out.println("iNum의 값 " + iNum);
		System.out.println("lNum의 값 " + lNum);
		System.out.println("fNum의 값 " + fNum);
		System.out.println("dNum의 값 " + dNum);
		System.out.println("ch의 값 " + ch);
		System.out.println("str의 값 " + str);
		
		
		//변수 명명규칙
		
		int number;
		//1)변수명이 같으면 에러발생
		//int number;
		
		//2)대소문자 구분
		int nUmber;
		
		//3) 예약어(이미 자바에서 사용되고 있는 키워드들) 사용하면 에러
		
//		int true;
//		int class;
//		int void;
		
		//4)숫자 가능(단, 숫자로 시작하는 것은 안됨)
		//int 1age;
		
		//5)특수문자가능(_,$만 가능)
		int number_1;
		int number$2;
		
//		int number#1
		
		//여러 단어로 된 변수명인경우 붙여쓰고 첫글자는 소문자, 연결되는 단어의 첫 글자는 대문자	
		String username;  //관례상 틀림
		String userName;  //관례상 맞는 표현
		
		String 이름; //한글도 잘 사용하지 않음, 한글 사용하지 않는 환경에서 오류발생 가능
		
		/*
		 * 정리
		 * 변수 : 리터럴(값)을 저장하기 위한 공간(메모리에 값을 기록하기 위한 공간)
		 * 값 : 프로그램상에 필요한 명시적인 값 /또는 사용자가 마우스 또는 키보드로 입력한 값
		 * 
		 * */
	}
	
	public void test() {
		boolean v1 = false;
		char v2 = '가';
		double v3 = 3.14;
		int v4 = 30;
		String v5 = "aaa";
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
	}
	
	
}
