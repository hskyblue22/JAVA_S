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
		
		System.out.println();
		if(idx == -1) 
			System.out.println("찾으시는 값의 요소는 없습니다.");
		else 
			System.out.println(key +"는 x["+idx+"]에 있습니다.");		
		
	}

	static int binSearch(int[] arr, int n, int key) {
		
		for(int i=0; i<n; i++) { 
			if(i == 0) 
				System.out.print("   |  ");
			System.out.printf("%2d ",i);
		}
		
		System.out.print("\n---+--"); 
		for(int i=0; i<n; i++) {
			System.out.print("---");
		}
		
		int pl = 0;
		int pr = n-1;
		
		do {
			int pc = (pl+pr)/2;
			
			for(int i=0; i<=pr; i++) {
				if(i==0)
					System.out.print("\n   |  ");	
				
				if(i == pc) {  //pc (+) 가 먼저 나올 수 있도록 제일 위에 위치해둠
					System.out.printf("%2s","+");
				}else if(i == pr){
					System.out.printf("%3s","->");
				}else if(i == pl) {
					System.out.printf("%3s","<-");
				}else {
					System.out.print("   ");
				}
			}
			
			for(int i=0; i<n; i++) {
				if(i==0)
					System.out.printf("\n%3d| ", pc);
				System.out.printf("%3d",arr[i]);
			}
			
			if(arr[pc] == key) {
				return pc;
			}else {
				if(arr[pc] < key) {
					pl = pc+1;
				}else {
					pr = pc-1;
				}
				System.out.print("\n   |  ");
			}
			
		}while(pl <= pr);
		
		
		return -1;
	}

}
