package com.sy.chap03_search.practice;

import java.util.Scanner;

public class E_binSearchX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		System.out.println("오름차순으로 입력하세요");
		
		System.out.println("x[0] : ");
		arr[0] = sc.nextInt();
		
		//이진검색 -> 오름차순 정렬로
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x["+i+"] : ");
				arr[i] = sc.nextInt();
			}while(arr[i]<arr[i-1]);
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		int idx = binSearchX(arr, num, key);
		
		if(idx == -1) 
			System.out.println("찾으시는 값이 없습니다.");
		else 
			System.out.println(key +"는 x["+ idx +"]에 첫번째로 있습니다.");
		
	}

	static int binSearchX(int[] arr, int n, int key) {
		
		int pl = 0;
		int pr = n-1;
		
		do {
			int pc = (pl+pr)/2;
			
			if(arr[pc] == key) {
				
				while(arr[pc]==key) {
					pc--;
				}
				return pc+1;
				
			}else if(pc < key) {
				pl = pc+1;
			}else {
				pr = pc-1;
			}
					
		}while(pl<=pr);
		
		
		
		
		return -1;
	}

}
