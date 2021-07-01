package com.sy.example.object.nonstatic1.controller;

import java.util.Arrays;

public class NonstaticSample {

	public NonstaticSample() {
		// TODO Auto-generated constructor stub
	}
	
	public void printLottoNumbers() {
		int[] rArr = new int[6];
		
		for(int i=0; i<6; i++) {
			int r = (int)(Math.random()*45+1);
			rArr[i] = r;
			
			for(int k=0; k<i; k++) {
				if(rArr[k] == r) {
					i--;
					break;
				}
			}
						
		}
		//배열 정렬
		Arrays.sort(rArr);
		
		//Arrays.toString(배열변수)
		System.out.println("1. 랜덤 값 : " + Arrays.toString(rArr));
	}
	
	public void outputChar(int num, char c) {
		System.out.printf("2. %s문자 %d개 출력 : ",c,num);
		for(int i=0; i<num; i++) {
			System.out.print(c + " ");
		}
	}
	
	public char alphabette() {
		//대문자 : 65~90, 소문자 : 97~122
		
		while(true) {
			int r = (int)(Math.random()*58+65);
			
			if(r>90 && r<98) {
				continue;
			}else {
				return (char)r;
			}
		}
	}
	
	public String mySubstring(String str, int index1, int index2) {
		//null = ""?
		try {
			if(str.equals("")) {
				return null;
				
				//System.out.println(new NonstaticSample().mySubstring("", 0, 2));
			}else {
				if(str.length() <= index2 || str.length() <= index1) {
					return "인덱스를 올바르게 입력해주세요";
				}else {
					return str.substring(index1,index2);
				}
			}	
		} catch(NullPointerException e) {
			return "null값은 입력할 수 없습니다";
			
			//System.out.println(new NonstaticSample().mySubstring(null, 0, 2));
		}

	}
}
