package com.sy.chap02_DataStructure.practice;

import java.util.Scanner;

public class B_Array {
	static Scanner sc = new Scanner(System.in);
	
	//실습 2-10: 1000이하 소수 구하기  --> 78022회
	//내방식대로 풀었음-1)2처음부터 넣지 않았음 2)prime으로 비교하지 않았음
	public static void primeNumber1(){
		int counter = 0;
		int ptr = 0;
		int[] prime = new int[500];
		
		int j=0;
		for(int i=2; i<=1000; i++) {
			for(j=2; j<i; j++) {
				counter++;
				if(i % j == 0) {  //0으로 나눠떨어지는 경우->소수 아님
					break;
				}
			}
			if(i==j) {
				prime[ptr++]=i;
				System.out.println(i);
			}
		}
		System.out.println("count : "+counter);
	}
	
	//실습2-10. 찾은 소수들로 나눠서 찾기  --> 14622회
	public static void primeNumber2() {
		int counter = 0;
		int ptr = 0;
		int[] prime = new int[500];
		
		prime[ptr++]=2;
		
		for(int i=3; i<=1000; i+=2) {
			int k;
			for(k=1; k<ptr; k++) {
				counter++;
				if(i%prime[k] == 0) {
					break;
				}
			}
			if(k==ptr)
			prime[ptr++]=i;
		}
		System.out.println(counter);
	}
	
	//소수찾기- 에라토스테네스의 체
	//특정 수의 범위안에 있는 수의 소수여부를 판별할 수 있다.
	public static void erat() {
		System.out.println("찾기 시작할 수를 입력하세요 : ");
		int n1 = sc.nextInt();
		System.out.println("찾기를 종료할 수를 입력하세요 : ");
		int n2 = sc.nextInt();
		
		boolean[] iArr = new boolean[n2+1];
		
		iArr[0]=true;  //0,1은 소수가 아니므로 true로 초기화해둔다.
		iArr[1]=true;
		
		for(int i=2; i<Math.sqrt(n2+1); i++) {
			for(int k=2*i; k<100+1; k+=i) {
				iArr[k]=true;
			}
		}
	
		for(int i=n1; i<iArr.length; i++) {
			if(iArr[i] == false) {
				System.out.println(i);
			}
		}
	}
}
