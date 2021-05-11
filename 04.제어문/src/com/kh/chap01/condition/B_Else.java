package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	/*
	 * * if-else문
	 * 
	 *  이 조건일 경우 실행 코드1 실행시키고 그 조건이 아니라면 무조건 실행 코드2 실행시키는 구문
	 *  
	 *  if(조건식){
	 *  	.. 실행 코드1 ..
	 *  }else {
	 *  	.. 실행 코드2 ..
	 *  }
	 *  
	 *  조건식의 결과가 true인 경우 실행코드 1 수행 후 if-else문 빠져나감
	 *  하지만 조건식의 결과가 false 인 경우 무조건 실행 코드 2 수행
	 */
	
	/*
	 * * if-else if문
	 * 
	 *  같은 비교 대상으로 여러개의 조건을 제시할 경우 
	 *  
	 *  if(조건식1){
	 *  	.. 실행 코드 1 ..
	 *  }else if(조건식2){
	 *  	.. 실행 코드 2 ..
	 *  }else if(조건식3) {
	 *  	.. 실행 코드 3 ..
	 *  }[else {
	 *  	.. 위의 조건들이 다 false일 경우 실행할 코드 ..
	 *  }]
	 * 
	 *  조건식 1의 결과가 true일 경우 실행 코드 1 수행하고 빠져나감
	 *  하지만 조건식1의 결과가 false일 경우 조건식2 실행
	 *  조건식2의 결과가 true일 경우 실행 코드 2 수행하고 빠져나감 
	 *  아니면 그 뒤의 조건식 실행.. 이렇게 구동
	 *  단 else문이 제시되어 있을 경우 위의 조건이 다 false가 나오게 되면 무조건 else 구문 실행
	 * 	
	 */
	public void method1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("양수다. ");
		} else if (num < 0) {              //if문 괄호에 물리게 (else if) 적기
			System.out.println("음수다. ");
		} else {
			System.out.println("0이다. ");
		}
	}

	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수입니다. ");
		}else {
			System.out.println("홀수입니다. ");
		}	
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");

		String name = sc.nextLine();

		System.out.println("학년(숫자만) : ");
		int grade = sc.nextInt();

		System.out.println("반(숫자만) : ");
		int classNum = sc.nextInt();

		System.out.println("번호(숫자만) : ");
		int num = sc.nextInt();

		sc.nextLine();

		System.out.println("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);

		System.out.println("성적(소수점아래 둘째자리까지) : ");
		double score = sc.nextDouble();

		String student = "";

		if (gender == 'M' || gender == 'm') {
			student = "남학생";
		} else if (gender == 'F' || gender == 'f') {
			student = "여학생";
		} else {
			System.out.println("잘못 입력하였습니다.");
			return; // return 은 현재 메소드의 뒤에 있는 코드는 수행하지 않고 바로 이 메소드를 호출한 곳으로 빠져나간다.
		}

		System.out.println();
		System.out.println(
				grade + "학년 " + classNum + "반 " + num + "번 " + name + " " + student + " 의 성적은 " + score + "이다.");
	}

	public void method4() {
		Scanner sc = new Scanner(System.in);

		System.out.println("나이 : ");
		int age = sc.nextInt();

		String result = null;

		// 13세 이하는 어린이, 14세부터 19세이하는 청소년, 20세부터는 성인

		if (age <= 13) {
			result = "어린이";
		} else if (age <= 19) { // 앞에 if에서 걸러졌음
			result = "청소년";
		} else {
			result = "성인";
		}

		System.out.println(result);
	}

	public void method5() {
		Scanner sc = new Scanner(System.in);

		System.out.println("이름 : ");
		String name = sc.nextLine();

//		if(name == "황서연") {
//			System.out.println("본인입니다.");
//		}
//		if(name != "황서연") {
//			System.out.println("본인 아닙니다.");
//		}
		// String비교시 String 클래스에서 제공하는 equals()메소드를 이용해서 비교

		if (name.equals("이효리")) {
			System.out.println("본인입니다.");
		} else {
			System.out.println("본인이 아닙니다.");
		}
	}

	public void method6() {
		// 사용자에게 키보드로 정수를 입력받아 점수별로 등급을 나눠서 점수와 등급을 출력하는 메소드

		// 90점 이상은 A등급
		// 90점 미만 80점 이상은 B등급
		// 80점 미만 70점 이상 C등급
		// 70점 미만 60점 이상 D등급
		// 60점 미만은 F등급

		Scanner sc = new Scanner(System.in);

		System.out.print("점수 입력: ");
		int score = sc.nextInt();
		String grade = "";

		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}

		System.out.println("당신의 점수는 " + score + "이고, 등급은 " + grade + "입니다. ");
	}
}
