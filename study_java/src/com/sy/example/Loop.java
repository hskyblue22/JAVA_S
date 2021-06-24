package com.sy.example;

import java.util.Scanner;

public class Loop {

	Scanner sc = new Scanner(System.in);
	
	public void practice7() {
		
		while(true) {
			
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			
			if(num1<1 || num2<1) {
				System.out.println("1이상의 숫자를 입력해 주세요");
			}else {
				int big = num1 > num2 ? num1 : num2;
				int small = num1 < num2 ? num1 : num2;
				
				for(; small<=big; small++) {
					System.out.print(small + " ");
				}
				break;
			}	
		}
	}
	
	public void practice8() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("======= " + num + "단 =======");
		
		for(int i=1; i<10; i++) {
			System.out.println(num + " * " + i +" = " + num*i);
		}
	}
	
	public void practice10() {
		
		while(true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			if(num<2 || num>9) {
				System.out.println("2~9사이의 숫자를 입력해주세요");
				//continue;
			}else {
				for( ; num<10; num++) {
					System.out.println("======= " + num + "단 =======");
					for(int j=1; j<10; j++) {
						System.out.println(num + " * " + j +" = " + num*j);
					}
				}
				break;
			}
		}
	}
	
	public void practice11() {
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		System.out.print("공차 : ");
		int in = sc.nextInt();

		for(int i=0; i<10; i++) {
			int n = start + (in*i);
			System.out.print(n + " ");
		}
	}
	
	public void practice12() {
		while(true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.nextLine();
			
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			
			int result = 0;
			
			switch(op) {
			case "+" : 
				result = num1+num2; break;
			case "-" :
				result = num1-num2; break;
			case "*" :
				result = num1*num2; break;
			case "/" : 
				if(num2 != 0) {
					result = num1/num2; break;
				}
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요."); continue;
			case "%" :
				result = num1%num2; break;
			default : 
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				continue;
			}
			System.out.println(num1 + " "+op+" "+num2 + " = " + result);
		}
	}
}
