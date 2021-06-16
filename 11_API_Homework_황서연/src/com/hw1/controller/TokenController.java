package com.hw1.controller;

import java.util.StringTokenizer;

public class TokenController {

	public String afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str, " ");
		
		String newStr = "";
		while(st.hasMoreTokens()) {  
			newStr += st.nextToken();
		}
		return newStr;
		
	}
	
	public String firstCap(String input) {
		String capStr = String.valueOf(input.charAt(0)).toUpperCase() + input.substring(1);
		return capStr;
	}
	
	public int findChar(String input, char one) {
		int count =0;
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == one) {
				count++;
			}
		}
		return count;
	}

	
}
