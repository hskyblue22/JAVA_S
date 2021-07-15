package com.sy.chap01_basic.practice;

import java.util.Scanner;

public class C_Loop_sum {
	
	static Scanner sc = new Scanner(System.in);

	//Q6
	public void sum_while() {
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i<=n) {
			sum += i;
			i++;
		}
		
		System.out.println(sum);
		System.out.println("증감전 i : "+i);
		System.out.println("증감후i : "+i);
	}
	
	//Q7
	public void practice7() {
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i=1;
		
		while(i <= n-1) {
			sum += i;
			System.out.print(i++ + " + ");
		}
		sum += n;
		System.out.println(i + " = " + sum);
	}
	
	//Q8 가우스의 덧셈
	public void practice8() {
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 : ");
		double n = sc.nextInt();

		double sum = (1+n)*(n/2);

		System.out.println("1부터 "+(int)n+"까지의 합 : "+ Math.round(sum));
	}
	
	//Q9 정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드 작성
	public int sumof(int a, int b) {
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		
		int sum = 0;
		
		for( ; min<= max ; min++) {
			sum += min;
		}
		return sum;
	}
	
	//Q10 정수 b에서 정수 a를 뺀 값을 구합니다(b > a가 되도록 입력 받음)
	public void practice10() {  //static -> 멤버변수도 static이어야 함
		
		System.out.print("정수 a를 입력하세요 : ");
		int a = sc.nextInt();
		
		while(true) {
			System.out.println("정수 b를 입력하세요(a보다 크게) : ");
			int b = sc.nextInt();
			
			if(a>b) {
				System.out.println("b는 a보다 큰 정수를 입력해주세요");
			}else {
				System.out.println("b - a : " + (b-a));
				break;
			}
		}
	}
	
	//Q11 2자리 정수 입력
	public void practice11() {  //양의 정수값의 자릿수를 구하여 나타냄
		int num;
		
		do {
			System.out.println("양의 정수를 입력하세요 : ");
			num = sc.nextInt();
		}while(num < 0);
		
		int n = 1;
		
		while(num>10) {
			num = num/10;
			n++;
		}
		System.out.println(num +"은 "+n+"자리 숫자입니다.");
	}
	
	//Q12 곱셈표
	public void practice12() {
		System.out.println(" | 1  2  3  4  5  6  7  8  9");
		System.out.println("---+-------------------------");
		for(int i=1; i<10; i++) {
			System.out.print(i+"| ");
			for(int j=1; j<10; j++) {
				if(j>=2) {
					System.out.printf("%3d",i*j);
				}else {
					System.out.print(i*j);
				}
			}
			System.out.println();
		}
	}

	// Q12 덧셈표
	public void practice13() {
		System.out.println(" |  1  2  3  4  5  6  7  8  9");
		System.out.println("---+--------------------------");
		for (int i = 1; i < 10; i++) {
			System.out.print(i + "| ");
			for (int j = 1; j < 10; j++) {
				if (j >= 2) {
					System.out.printf("%3d", i + j);
				} else {
					System.out.printf("%2d", i + j);
				}
			}
			System.out.println();
		}
	}

	//Q14 정사각형 모양을 나타냄
	public void practice14() {
		System.out.println("n 입력 : ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=n; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	//Q15 직각이등변 삼각형
	public void triangleB(int n) {

		//왼쪽 아래가 직각
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형");
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 왼쪽 위가 직각
		System.out.println("\n왼쪽 위가 직각인 이등변 삼각형");
		for (int i = n; i > 0; i--) {
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 오른쪽 위가 직각
		System.out.println("\n오른쪽 위가 직각인 이등변 삼각형");
		for(int i = 1; i <=n; i++) {
			for (int k = 1; k <=n; k++) {
				if(k<i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		// 오른쪽 아래가 직각
		System.out.println("\n오른쪽 아래가 직각인 이등변 삼각형");
		for (int i = 1; i <= n; i++) {
			for (int k = 5; k > 0; k--) {
				if (k > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	//Q16 피라미드
	public void spiral(int n) {
		
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=n-i; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(i-1)*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//Q17 피라미드
	public void npiral(int n) {
		
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=n-i; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(i-1)*2+1; j++) {
				System.out.print(i%10);
			}
			System.out.println();
		}
	}
	
}
