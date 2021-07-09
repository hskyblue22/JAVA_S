package com.sy.example.api.hw1.controller;

import java.util.StringTokenizer;

public class TokenController {

	public String afterToken(String str) {
		StringTokenizer tn = new StringTokenizer(str, " ");
		String s = "";
		
		while(tn.hasMoreTokens()) {
			s += tn.nextToken();
		}
		
		return s;
	}
	
	public String firstCap(String input) {
		String after = "";
		String s = String.valueOf(input.charAt(0)).toUpperCase();
		
		after += s;
		
		//String.substring(index1, index2)
		for(int i=1; i<input.length(); i++) {
			after += String.valueOf(input.charAt(i));
		}
		
		return after;
	}
	
	public int findChar(String input, char one) {
	
		//str이 들어오면 이렇게 lower로 해줄 필요 없음
		int count = 0;
		for(int i=0; i<input.length(); i++) {
			String s = String.valueOf(input.charAt(i)).toLowerCase();
			String find = String.valueOf(one).toLowerCase();
			if(find.equals(s)) {
				count++;
			}
		}
		return count;
	}
}
