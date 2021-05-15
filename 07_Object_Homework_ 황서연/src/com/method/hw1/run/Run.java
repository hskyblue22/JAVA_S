package com.method.hw1.run;

import com.method.hw1.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonStaticSample ns = new NonStaticSample();
		
		System.out.print("1. 랜덤 값 : ");
		ns.printLottoNumbers();
		
		char ch = 'G';
		int num = 5;
		System.out.print("2. "+ch + "문자 " + num + "개 출력 : ");
		ns.outputChar(num, ch);
		
		System.out.print("3. 랜덤 영문자 출력 : ");
		System.out.println(ns.alphabette());
		
		String str = "example";
		int index1 = 0;
		int index2 = 4;
		System.out.print("4. "+str+"의 "+index1+"번 "+index2+"번 인덱스 사이의 값 출력 : ");
		System.out.println(ns.mySubstring(str, index1, index2));
	}

//	1. 랜덤 값 : 24 7 20 11 40 30
//	2. a문자 5개 출력 : a a a a a
//	3. 랜덤 영문자 출력 : a
//	4. apple의 2번 4번 인덱스 사이의 값 출력 : pl
}
