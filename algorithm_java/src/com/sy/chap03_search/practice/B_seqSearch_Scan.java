package com.sy.chap03_search.practice;

import java.util.Scanner;

public class B_seqSearch_Scan {

	
	
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
		
		int idx = seqSearch(x,n,key);
		
		System.out.println();
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		}else {
			System.out.println(key+"은(는) x["+idx+"]에 있습니다.");
		}

	}

	private static int seqSearch(int[] x, int n, int key) {
		
		System.out.print("   |  ");  //한 번만 출력되어야 하므로 아래 for문에 넣지 않음
		
		for(int i=0; i<n; i++) {     //맨 윗줄 배열의 인덱스 출력
			System.out.printf("%2d ",i);
		}
		
		System.out.print("\n---+--"); //인덱스가 출력되고 나서 -------출력되야 하므로 다른 for문 작성
		for(int i=0; i<n; i++) {
			System.out.print("---");  //배열의 크기만큼 ---출력
		}
		
		for(int i=0; i<n; i++) {
			System.out.print("\n   | ");  //1번째 줄 시작
			for(int k=0; k<=i; k++) {     // * 움직이는 것처럼 보이게 하기 위해 "공백" 넣음
				if(k != i)
					System.out.print("   "); 
				else
					System.out.printf("%3s","*");
			}
			
			//System.out.printf(String.format("%%%ds*\n", (i*4)+3),"");
			
			System.out.printf("\n%3d| ", i);  //2번째 줄 
			for(int l=0; l<n; l++) {          //모든 배열의 값 출력
				System.out.printf("%3d",x[l]);
			}
			
			if(x[i] == key) {                 //3번째 줄
				return i;
			}else {
				System.out.print("\n   | ");
			}			
		}
		
		return -1;
	}

}
