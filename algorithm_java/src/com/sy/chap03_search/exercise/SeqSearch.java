package com.sy.chap03_search.exercise;

import java.util.Scanner;

public class SeqSearch {
	
	//2. for문
	public int seqSearch(int[] a, int n, int key) {
		for(int i=0; i<n; i++) {
			if(a[i]==key)
				return i;
		}
		return -1;
	}
	
	//1. while문
//	public int seqSearch(int[] a, int n, int key) {
//		int i=0; 
//		while(true){
//			if(n == i) 
//				return -1;
//			if(a[i] == key)
//				return i;
//			i++;
//		}
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("요솟수 : ");
			n = sc.nextInt();
		}while(n<=0);
		
		int[] x = new int[n];
		for(int i=0; i<n; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		SeqSearch ss = new SeqSearch();
		int idx = ss.seqSearch(x,n,key);
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		}else {
			System.out.println(key+"은(는) x["+idx+"]에 있습니다.");
		}

	}

}
