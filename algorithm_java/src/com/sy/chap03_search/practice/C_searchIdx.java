package com.sy.chap03_search.practice;

import java.util.Arrays;
import java.util.Scanner;

public class C_searchIdx {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		do {
			System.out.print("요솟수 : ");
			n = sc.nextInt();
		} while (n <= 0);

		int[] x = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}

		System.out.print("검색할 값 : ");
		int key = sc.nextInt();

		int idxs = searchIdx(x, n, key);

		if (idxs == 0) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(key +"은(는) "+ idxs +"개 있습니다.");
		}

}

	static int searchIdx(int[] x, int n, int key) {
		int[] idxArr = new int[n];
		
		int count = 0;
		for(int i=0; i<x.length; i++) {
			if(x[i] == key) {
				idxArr[count++]=i;
			}
		}
		System.out.println(Arrays.toString(idxArr));
		return count;
	}
}