package com.sy.chap03_search.practice;

import java.util.Scanner;

//Q11. 실습 seqSearchSen 메서드를 while문이 아니라 for문을 사용하여 수정하라
public class A_seqSearch {

	static int seqSearchSen(int[] a, int n, int key) {

		a[n] = key; // 배열의 맨 뒤에 찾는 값 넣어주기

		for(int i=0; i<a.length-1; i++) {  //배열의 맨끝 바로 앞까지 돌면서 찾기
			if(a[i] == key) {
				return i;
			}
		}
		return -1;                         //배열의 맨끝 바로 앞까지 찾는 값이 없다면 -1반환
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
