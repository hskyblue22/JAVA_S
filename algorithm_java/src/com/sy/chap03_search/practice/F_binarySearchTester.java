package com.sy.chap03_search.practice;

import java.util.Arrays;
import java.util.Scanner;

public class F_binarySearchTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 입력 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		System.out.print("x[0] : ");
		x[0] = sc.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x["+i+"] : ");
				x[i] = sc.nextInt();
			}while(x[i] < x[i-1]);
		}

		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		int idx = Arrays.binarySearch(x, key);
		
		if(idx < 0) 
			System.out.println("검색에 실패하였습니다.\n삽입자 : " + -(idx+1));
			//삽입자 : (1)배열에서 key보다 큰 값의 인덱스-1 (2)큰값이 없으면 배열 길이
			//idx(반환값) : -삽입자-1
		else
			System.out.println(key + "은(는) x["+ idx +"]에 있습니다.");
			
	}

}
