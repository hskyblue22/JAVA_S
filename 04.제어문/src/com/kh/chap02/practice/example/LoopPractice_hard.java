package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice_hard {

	public void practice15( ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num >= 2) {
			for(int i=2; i < num; i++) {
				if(num % i != 0) {
					
				}else {
					System.out.println("소수가 아닙니다.");
					return;
				}
			}
			System.out.println("소수입니다.");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			if(num >= 2) {
				for(int i=2; i <= num/2; i++) {
					if(num % i != 0) {
						
					}else {
						System.out.println("소수가 아닙니다.");
						return;
					}
				}
				System.out.println("소수입니다.");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		}
	}
	
	//못 풀었음
	public void practice17() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		int count = 0;
		
		if(num >=2) {
			for(int i=2; i<=num; i++) {
				
				for(int j=2; j<i/2; j++) {
					if(i % j != 0) {
						
					}else {
						break;
					}
				}				
			}
		}
		
		
	}
	
	public void practice18() {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		int count = 0;
		
		for(int i=1; i<=num; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");				
				if(i % 6 == 0) {
					count += 1;
				}
			}
		}
		System.out.println();
		System.out.println("count : " + count);
	}
	
	public void practice19() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i<=num; i++) {
			for(int j=1; j<=num-i; j++) {
				System.out.printf(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
	
	public void practice20() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		//위쪽 삼각형(1,2줄)
		for(int i=1; i<num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//아래쪽 삼각형(3,4,5줄)
		for(int i=num; i>0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice21() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			for(int j=1; j<=num-i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public void practice22() {
		
	}
}
