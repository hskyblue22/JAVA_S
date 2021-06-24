package com.sy.example;

import java.util.Scanner;

public class Operator {
	
	Scanner sc = new Scanner(System.in);

	//연산자
	public void method4() {
		System.out.print("인원 수 : ");
		int person = sc.nextInt();
		
		System.out.print("사탕 개수 :");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : "+candy/person);
		System.out.println("남는 사탕 개수 : "+ candy%person);
	}
	
	public void method7() {
		System.out.print("국어 : ");
		int k = sc.nextInt();
		System.out.print("영어 : ");
		int e = sc.nextInt();
		System.out.print("수학 : ");
		int m = sc.nextInt();
		
		int sum = k+e+m;
		double avg = sum/3;
		
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		
		if((k>=40 && e>=40 && m>=40) && avg>=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	}
	
	public void method8() {
		System.out.println("주민번호를 입력하세요(-포함) : ");
		String p_no = sc.nextLine();
		
		String s = p_no.charAt(7) == '1' ? "남자" : "여자";
		
		System.out.println(s);
	}
	
	public void method9() {
		System.out.println("정수1 : ");
		int n1 = sc.nextInt();
		System.out.println("정수2 : ");
		int n2 = sc.nextInt();
		
		System.out.println("입력 : ");
		int input = sc.nextInt();
		
		String result = (input<=n1 || input>n2) ? "true" : "false";
		System.out.println(result);
	}
	
	public void method11() {
		double[] dArr = new double[3];
		String[] sArr = {"A","B","C"};
		double[] inArr = {0.4, 0, 0.15};
		
		for(int i=0; i<3; i++) {
			System.out.print(sArr[i]+"사원의 연봉 : ");
			dArr[i] = sc.nextDouble();
		}
		
		for(int i=0; i<3; i++) {
			double salary = dArr[i]*(1+inArr[i]);
			//double salary = dArr[i] + dArr[i]*inArr[i]);
			System.out.println(sArr[i]+"사원의 인센티브포함 연봉 : " + salary);
			
			String s = salary>=3000 ? "3000 이상" : "3000 미만";
			System.out.println(s);
		}
	}
}
