package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine();  //nextInt() 메소드 뒤에 nextLine() 메소드가 올 것이기 때문에 그 사이에 엔터를 버퍼에서 빼주는 작업을 해줘야된다. 
		
		System.out.println("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		System.out.println(height);
		System.out.println("키 " + height + "인 " + age + "살 " + gender + "자 " + name + "님 반갑습니다^^");
		// height가 double이라서 print하면 소수점 끝까지 나올 줄 알았는데 소수점 아래 첫째자리까지만 출력된다.
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.printf("더하기 결과 : %d\n", num1+num2);
		System.out.printf("빼기 결과 : %d\n", num1-num2);
		System.out.printf("곱하기 결과 : %d\n", num1*num2);
		System.out.printf("나누기 결과 : %d\n", num1/num2);
		
	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double w = sc.nextDouble();
		
		System.out.print("세로 : ");
		double l = sc.nextDouble();
		
		System.out.printf("면적 : %.2f\n", w*l);
		System.out.printf("둘레 : %.1f\n", (w+l)*2);
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
	}
}
