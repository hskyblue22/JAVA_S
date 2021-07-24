package com.sy.chap03_search.exercise;

import java.util.Scanner;

public class BinSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0] : ");
		x[0] = sc.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x["+i+"] : ");
				x[i] = sc.nextInt();
			}while(x[i]<x[i-1]);  //바로앞의 요소보다 작으면 다시 입력
		}
		
		System.out.println("검색할 값 : ");
		int ky = sc.nextInt();
		
		int idx = binSearch(x,num,ky);
		
		if(idx == -1) 
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+"은(는) x["+idx+"]에 있습니다.");
	}
	
	static int binSearch(int[] a, int n, int key) {
		//요솟수가 n인 배열 a에서 key와 같은 요소를 이진검색
		
		int pl = 0;
		int pr = n-1;  //검색 범위의 끝 인덱스
		
		do {
			int pc = (pl + pr)/2;
			if(a[pc] == key)
				return pc;
			else if(key > a[pc])
				pl = pc+1;
			else
				pr = pc-1;
		}while(pl <= pr);
		
		return -1;
	}

}
