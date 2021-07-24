package com.sy.chap03_search.practice;

import java.util.Scanner;

public class A_seqSearch {

	static int seqSearchSen(int[] a, int n, int key) {

		a[n] = key; // 배열의 맨 뒤에 찾는 값 넣어주기
		int index = 0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i] == key) {
				if(i == n)
					index = -1;
				else
					index = i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		do {
			System.out.print("요솟수 : ");
			n = sc.nextInt();
		} while (n <= 0);

		int[] x = new int[n + 1];
		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}

		System.out.print("검색할 값 : ");
		int key = sc.nextInt();

		int idx = seqSearchSen(x, n, key);

		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
		}

	}
}
