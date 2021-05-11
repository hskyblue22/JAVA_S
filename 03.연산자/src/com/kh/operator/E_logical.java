package com.kh.operator;

import java.util.Scanner;

public class E_logical {
	/*
	 * * 논리 연산자
	 * - 두 논리값을 연산하는 연산자 
	 * - 논리 연산자의 결과값 또한 논리값
	 * 
	 * 논리값 && 논리값 : 왼쪽, 오른쪽 둘 다 true일 경우 true (AND) -- 이고 ,  이면서 
	 * 논리값 || 논리값 : 왼쪽, 오른쪽 둘 중에 하나라도 true일 경우 true (OR) -- 이거나, 또는 
	 */
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수하나입력 : ");
		
		int num = sc.nextInt();
		
		boolean result;
		
		//사용자가 입력한 num값이 1이상이고 100이하의 값인 가요?
		//result = (1 <= num <=100);  안됨
		
		result = (num >= 1) && (num <= 100);
		
		System.out.println("사용자가 입력한 num값이 1이상이고 100이하의 값인 가요?" + result);
	}
	
	public void method2() {
		//사용자가 입력한 문자가 영어대문자인지 확인하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자하나입력 : ");
		
		char ch = sc.next().charAt(0);
		
		boolean result = (ch >= 'A') && (ch <= 'Z');   //문자같은 경우는 숫자값(유니코드)이기 때문에 대소비교 가능
				
		System.out.println("사용자가 입력한 문자가 영어 대문자입니까? " + result);	
	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계속하려면 y 혹은 Y를 입력하세요 : ");
		
		char ch = sc.next().charAt(0);
		
		boolean result = (ch == 'y') || (ch == 'Y');
		
		
		System.out.println("사용자가 입력한 값이 y 또는 Y 입니까? " + result);
		
		
	}
	/*
	 *  && : 두 개의 조건이 모두 true 여야 결과값이 true이다. (AND)
	 *  
	 *  true && true 	=> true
	 *  true && false 	=> false
	 *  false && true	=> false
	 *  false && false 	=> false
	 *  
	 *  --> && 연산자를 기준으로 앞의 결과가 false값이 나온다면 뒤의 조건은 굳이 실행하지 않는다. 
	 *  
	 *  || : 두 개의 조건이 하나라도 true라면 결과값이 true이다. (OR)
	 *  
	 *  true || true 	=> true
	 *  true || false 	=> true
	 *  false || true	=> true
	 *  false || false	=> false
	 * 
	 * --> || 연산자를 기준으으로 앞의 결과가 true가 나온다면 뒤의 조건은 굳이 실행하지 않는다. 
	 */
	
	public void method4() {
		
		int num = 10;
		System.out.println("&& 연산전의 num값 : " + num);  //10
		
		boolean result1 = (num < 5) && (++num > 0);     //앞이 false이므로 뒤연산(++num)은 수행X
		
		System.out.println("result1 : " + result1);
		System.out.println("&& 연산후의 num값 : " + num);  //10
		
		System.out.println("===================================");
		
		
		boolean result2 = (num < 20) || (++num > 0);     //(num < 20) -> true -> (++num > 0) 수행 X
		
		System.out.println("result2 : " + result2);
		System.out.println("|| 연산후의 num값 : " + num);
		// ||연산자를 기준으로 앞에 이미 true가 제시되어있기 때문에 뒤쪽 연산은 수행하지 않는다.
	}
}
