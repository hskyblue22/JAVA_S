package com.kh.operator;

public class F_Compoud {
	/*
	 * * 복합 대입 연산자 : 산술연산자와 대입연산자를 함께 사용하는 연산자
	 * 				  연산처리 속도가 훨씬 빠르므로 사용을 권장한다. 
	 * 
	 * +=, -=, *=, /=, %=
	 * 
	 * a = a + 3;	=>   a += 3;
	 * a = a - 3;	=>	 a -= 3;
	 * a = a * 3;	=>	 a *= 3;
	 * a = a / 3;	=> 	 a /= 3;
	 * a = a % 3;	=> 	 a %= 3;
	 * 
	 */
	
	public void method1() {
		int num = 12;
		
		System.out.println("num : " + num); //12
		
		
		//num을 3 증가시키기
		num = num + 3;
		System.out.println("3 증가시킨 num : " + num);  //15
		
		
		//num을 3 증가시키기
		num += 3;
		System.out.println("3 증가시킨 num : " + num);  //18
		
		
		//num을 5감소시키기
		num -= 5;
		
		//num을 6배 증가시키기
		num *= 6;
		
		//num을 2배 감소시키기
		num /= 2;
		
		//num을 4배 감소시켰을 때 나머지
		num %= 4;
		
		System.out.println(num);
		
		
		String str = "Hello";
		System.out.println("str : "+ str);
		
		str += "World";
		System.out.println("최종 str : " + str);
		
		str += "!";
		System.out.println("최종 str : " + str);
		
	}
}
