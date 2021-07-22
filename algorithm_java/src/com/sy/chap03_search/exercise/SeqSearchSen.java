package com.sy.chap03_search.exercise;

import java.util.Scanner;

public class SeqSearchSen {
	//보초법(Sentinel method) : 종료판단횟수 2회 -> 1회로 줄이는 역할
	
	static int seqSearchSen(int[] a, int n, int key) {
		
		a[n] = key;  //배열의 맨 뒤에 찾는 값 넣어주기
		
		int i = 0;
		//하나의 if문 만으로 비교 -> 반복종료에 대한 판단 횟수는 절반으로 줄어든다.
		while(true) {
			if(a[i] == key) {  
				break;
			}
			i++;
		}
		return (i == n)? -1: i;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("요솟수 : ");
			n = sc.nextInt();
		}while(n<=0);
		
		int[] x = new int[n+1];
		for(int i=0; i<n; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		int idx = seqSearchSen(x,n,key);
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		}else {
			System.out.println(key+"은(는) x["+idx+"]에 있습니다.");
		}

	}

}
