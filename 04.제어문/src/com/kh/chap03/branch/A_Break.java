package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	
	//break : 가장 가까운 반복문을 빠져나가는 문구
	//단, switch문안의 break는 switch문을 빠져나가는 break
	
	public void method1() {
		//사용자에게 문자열을 입력받고 문자열 같이 출력하기
		//단 사용자가 입력한 문자열이 exit인 경우 반복종료
		
		Scanner sc = new Scanner(System.in);
		
		/* 무한반복
		 * for(;;) {
			System.out.println("문자열 입력 : ");
			String str = sc.nextLine();
			System.out.println("str : " + str);	
		}*/
			
		while(true) {//-->while은 조건식을 입력해야한다.
			System.out.println("문자열 입력 : ");
			String str = sc.nextLine();
			System.out.println("str : " + str);	
			
			if(str.equals("exit")) {
				break;
			}
			System.out.println("문자열의 길이 : "+ str.length());
		}
		//무한반복문 안에서 break가 없는 경우 다음 코드 오류 -> unreachable code(절대 실행될 일이 없는 코드)
		System.out.println("프로그램 종료"); 
	}
	
	public void method2() {
		//매번 반복적으로 랜덤값(1~10)을 발생시킨 후 출력
		//단 그 랜덤값이 홀수인 경우 출력하지 않고 반복문을 빠져나감
		
		while(true) {
			int random = (int)(Math.random()*10 + 1);
			
			if(random % 2 == 1) {
				break;
			}
			System.out.println("랜덤값 : " + random);
		}
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void method3() {
		//사용자에게 반복적으로 정수 2개와 연산기호(문자) (+,-)를 입력받고
		//그에 해당하는 계산을 처리하시오
		//단, 제시된 연산기호를 입력하지 않고 다른 연산기호를 입력했을 경우 빠져나가도록
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("정수1 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 입력 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			System.out.print("연산기호 입력(+,-) : ");
			char op = sc.nextLine().charAt(0);
			
			int result = 0;
			
			if(op == '+') {
				result = num1+num2; 	
			}else if(op == '-') {
				result = num1-num2; 
			}else {
				System.out.println("잘못입력하였습니다.");
				break;
			}
			
			System.out.println(num1 + " " + op +" " + num2 + " = " + result);
		}	
	}
	
}
