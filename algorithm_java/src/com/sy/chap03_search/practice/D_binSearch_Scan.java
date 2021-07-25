package com.sy.chap03_search.practice;

import java.util.Scanner;

public class D_binSearch_Scan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		do {
			System.out.print("요솟수 : ");
			num = sc.nextInt();
		}while(num <= 0);
		
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		int idx = binSearch(arr,num,key);
		
		
	}

	static int binSearch(int[] arr, int n, int key) {
		
		System.out.print("   |  ");  
		
		for(int i=0; i<n; i++) {     
			System.out.printf("%2d ",i);
		}
		
		System.out.print("\n---+--"); 
		for(int i=0; i<n; i++) {
			System.out.print("---");
		}
		
		int pl = 0;
		int pr = n-1;
		
		do {
			
		}while(pl <= pr);
		
		
		
		return -1;
	}

}
