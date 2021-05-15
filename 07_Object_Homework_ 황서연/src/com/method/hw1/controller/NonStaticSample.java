package com.method.hw1.controller;

import java.util.Arrays;

public class NonStaticSample {

	public void printLottoNumbers() {
		int[] arr = new int[6];
		
		for(int i=0; i<6; i++) {
			
			arr[i] = (int)(Math.random()*45+1);
			
			for(int k=0; k<i; k++) {
				if(arr[i] == arr[k]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(arr);  //오름차순 정렬
		
		for(int i=0; i<6; i++) {  //출력
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	
	public void outputChar(int num, char c) {
		for(int i =0; i<num; i++) {
			System.out.print(c + " ");
		}
		System.out.println();
	}
	
	public char alphabette() {
//		System.out.println((int)'A');  //65 --26
//		System.out.println((int)'Z');  //90
//		System.out.println((int)'a');  //97
//		System.out.println((int)'z');  //122
	
		while(true) {
			int num = (int)(Math.random()*58+65);
			
			if(num >= 91 && num <=96) {
				continue;
			}
			return (char)num;
		}
	}
	
	public String mySubstring(String str, int index1, int index2) {
		
		String sentence = "";
		
		if(str.equals(null)) {
			return sentence;
		}else if (str.length()<=index1 || str.length() <= index2) {
			return "잘못 입력하셨습니다.";
		}else {
			for(int i=index1; i<=index2; i++) {
				sentence += str.charAt(i);
			}
			return sentence;
		}
		
		
	}
}
