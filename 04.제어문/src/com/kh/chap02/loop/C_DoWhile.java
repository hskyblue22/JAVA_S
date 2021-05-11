package com.kh.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	/*
	 * * do-while문
	 * 
	 * [초기식]
	 * 
	 * do{
	 * 		반복적으로 실행할 코드;
	 * 
	 * 		[증감식]
	 * 
	 * }while(조건식); 
	 * 
	 * 
	 * 초기식  --> 무조건 한번은 실행 --> 증감식 
	 * 조건식 --> true일 경우 실행 --> 증감식
	 * 조건식 --> true일 경우 실행 --> 증감식
	 * 조건식 --> false일 경우 빠져나감
	 * 
	 * while문과 다른 점은 while문은 처음 수행될때도 조건식을 검사하고 나서 조건식이 true일 경우 실행되는데
	 * do while문은 첫 실행은 조건식없이 무조건 수행된다는 점
	 * 
	 */
	
	public void method1() {
		//조건이 맞지 않아도 반드시 한번은 수행하고 조건검사
		
		int num = 1;
		
		do {
			System.out.println(num);
		}while(num == 0);
		
	}
	
	public void method2() {
		//1부터 5까지 출력
		//1 2 3 4 5
		
		int i = 1;
		do {
			System.out.print(i++ + " ");
		//	i++;
		}while(i <=5);
		
	}
	
	public void method3() {
		
		int random = (int)(Math.random()*10 +1);
		int i = 1;
		int sum = 0;
		
		do {
			sum += i;
			i++;
		}while(i <= random);
		System.out.println("1부터 " + random + "까지의 합 : " + sum );
	}
	
	public void method4() {
		//사용자가 입력한 단의 구구단을 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		int i = 1;
		
		do {
			if(dan >=2 && dan <=9) {
				System.out.printf("%d * %d = %d\n",dan, i, dan*i);
				i++;
			}else {
				System.out.println("2~9 사이의 양수를 입력하세요.");
				break;  //없으면 2~9사이가 아닌 수를 입력했을 경우 -> else문 무한반복됨
			}
			
		}while(i < 10);
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		int i =0; 
		do {
			System.out.println(str.charAt(i));
			i++;                              
		}while(i < str.length());
		
	}
	
	public void method6() {
		//계속 문자열을 입력받고 그 문자열을 출력하게끔
		//하지만 그 문자열이 "exit"가 아닐 때까지 반복
		
		Scanner sc = new Scanner(System.in);
		
		String str ="";
		
		do {
			System.out.println("문자열을 입력해 주세요 : ");
			str = sc.nextLine();
			System.out.println("str : " + str);
			
		}while(!str.equals("exit"));
		System.out.println("exit를 입력해서 종료되었습니다.");
	}
	
	public void method7() {
		//method7() break이용
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("문자열을 입력해 주세요 : ");
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				break;
			}
			System.out.println("str : "+str);
			
		}while(true);
		System.out.println("exit를 입력해서 종료되었습니다.");
	}
	
	
}
