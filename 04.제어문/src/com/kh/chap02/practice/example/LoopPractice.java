package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i=1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num >= 1) {
				for(int i=1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for( ; num>0; num--) {
				System.out.print(num + " ");
			}
			
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num >= 1) {
				for( ; num>0; num--) {
					System.out.print(num + " ");
				}
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum += i;
			if(i < num) {
				System.out.print(i + " + ");
			}else {
				System.out.print(i + " = " + sum);
			}
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1>=1 && num2>=1) {
			for(int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++ ) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1이상의 숫자만을 입력해주세요.");
		}	
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {

			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			
			if(num1 < 1 || num2 <1) {
				System.out.println("1이상의 숫자만을 입력해주세요.");
				continue;
			}else {
				for(int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++ ) {
					System.out.print(i + " ");
				}
			}break;		
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("===== " + num + "단 =====");
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i );
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num>=2 && num <=9) {
			
			for( ; num<=9; num++) {
				System.out.println("===== " + num + "단 =====");
				for(int i=1; i<=9; i++) {
					System.out.printf("%d * %d = %d\n", num, i, num*i );
				}
			}
		}else {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
			System.out.print("숫자 : ");
			int num = sc.nextInt();
		
			if(num>=2 && num <=9) {
				
				for( ; num<=9; num++) {
					System.out.println("===== " + num + "단 =====");
					for(int i=1; i<=9; i++) {
						System.out.printf("%d * %d = %d\n", num, i, num*i );
					}
				}
				break;
			}else {
				System.out.println("2~9 사이의 숫자만 입력해주세요.");
			}
		}	
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		System.out.print("공차 : ");
		int in = sc.nextInt();
		
		for(int i=0; i<10; i++) {
			System.out.print(start + " ");
			start += in;
		}
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {	
			
			System.out.print("연산자(+,-,*,/,%) : ");
			String op = sc.nextLine();
			
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
				
			}
			
			//else 없어도 된다!
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			
			int result = 0;
			
			switch(op) {
			case "+" :
				result = num1 + num2;
				break;
			case "-" :
				result = num1 - num2;
				break;
			case "*" :
				result = num1 * num2;
				break;
			case "/" :
				if(num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					sc.nextLine();
					continue;
				}
				result = num1 / num2;
				break;
			case "%" :
				result = num1 % num2;
				break;
			default :
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				continue;	
			}
			
			System.out.println(num1 + " " + op + " " + num2 + " = " + result);
			sc.nextLine();
		}
	}
	
	
	
	
	
	
	
}
