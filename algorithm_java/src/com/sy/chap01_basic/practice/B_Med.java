package com.sy.chap01_basic.practice;

import java.util.Scanner;

public class B_Med {

//2.세 값의 중앙값
	//실습문제 1C_1 중앙값 구하기
	static int med(int a, int b, int c) {
		if(a >= b) {
			if(b >= c) {
				return b;
			}else if(a <= c) {
				return a;
			}else {
				return c;
			}
		}else if(a > c) {
			return a;
		}else if(b > c) {
			return c; 
		}else {
			return b;
		}
	}

	//연습문제 Q4 : 3개의 정숫값을 입력하고 중앙값을 구한 다음 출력
	public static int med3(int a, int b, int c) {
		int med = a;
		//(10 5 9)  / (6 5 9)(5 6 9)
		if(c >= b) {
			if(c < a) {        //(10 5 9)
				med = c;
			}else {            //(6 5 9) (5 6 9)
				if(a >= b) {}   //(6 5 9)
				else {         //(5 6 9)
					med = b;
				}
			}                  //b,c -> a,c -> a,b
		}else {
			if(b <= a) {
				med = b;
			}else {
				if(a >= c) {}
				else {
					med = c;
				}
			}
		}                     //b,c -> a,b -> a,c
		return med;
	}
	 
	//연습문제 Q5 : 효율이 떨어지는 이유
	//실습문제의 if문에서는 두 개의 매개변수 사이의 관계만 판별하여 참 거짓을 나눠 선택문을 이루었지만
	//아래에서는 조건의 참거짓을 따지기 위해서는 매번 a,b,c간 관계를 모두 검사해야 한다.
	//반복되어서
	public static int medi3(int a, int b, int c) {
		if((b>=a && c <=a) || (b<=a && c>=a)){  //3,5,1 / 3,1,5  
			return a;
		}else if((a>b && c<b) || (a<b && c>b)) {  //5,3,1 / 1,3,5
			return b;
		}
		return c; 
	}
	
	
//3. 연산자와 피연산자
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		int input = sc.nextInt();
		
		String a = (input == 0)? "입력한 값 : 0" : "입력한 값은 0이 아님";
		System.out.println(a);
	}
	
	
}
