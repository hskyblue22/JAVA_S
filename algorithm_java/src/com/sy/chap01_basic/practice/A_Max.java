package com.sy.chap01_basic.practice;

public class A_Max {

	//연습문제 Q1 : 네 값의 최댓값을 구하는 max4메서드를 작성하세요
	public static int max4(int a, int b, int c, int d) {
		
		int max = a;
		if(b > a) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		if(d > max) {
			max = d;
		}
		return max;
	}
	
	//연습문제 Q2 : 세 값의 최솟값 
	public static int min3(int a, int b, int c) {
		int min = a;
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		return min;		
	}
	
	//연습문제 Q3 : 네 값의 최솟값
	public static int min4(int a, int b, int c, int d) {
		
		int min = a;
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		if(d < min) {
			min = d;
		}
		return min;
	}
	
}
