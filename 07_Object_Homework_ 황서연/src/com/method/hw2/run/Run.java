package com.method.hw2.run;

import com.method.hw2.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonStaticSample ns = new NonStaticSample();
		
		int arrLength = 5;
		System.out.print("- 크기가 " + arrLength +"인 배열의 랜덤값 : ");
		int[] arr = ns.intArrayAllocation(arrLength);
		ns.display(arr);
		
		ns.swap(arr, 0, 3);
		
		System.out.print("- 내림차순 출력 : ");
		ns.sortDescending(arr);
		System.out.print("- 오름차순 출력 : ");
		ns.sortAscending(arr);
		
		String str = "apple";
		char ch = 'p';
		
		System.out.printf("- %s문자열에 %s의 갯수 : ",str,ch);
		System.out.println(ns.countChar(str, ch));
		
		int num1 = 13;
		int num2 = 7;
		System.out.println("- "+num1+"과 "+num2+"사이 정수들의 합계 : " + ns.totalValue(1, 5));
		
		String str1 = "programming";
		int index = 3;
		System.out.println("- "+str1+"문자열의 "+index+"번 인덱스 문자 : " + ns.pCharAt(str1, index));

		String str2 = "JAVA";
		System.out.printf("- %s와 %s을 합친 문자열 : ",str2,str1);
		System.out.print(ns.pConcat(str2, str1));
		
	}
	
//	- 크기가 5인 배열의 랜덤값 : 54 92 79 23 80
//	- 내림차순 출력 : 92 80 79 54 23
//	- 오름차순 출력 : 23 54 79 80 92
//	- apple문자열에 p의 갯수 : 2
//	- 13과 7사이 정수들의 합계 : 50
//	- programming문자열의 3번 인덱스 문자 : g
//	- JAVA와 programming을 합친 문자열 : JAVAprogramming

}
