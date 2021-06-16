package com.hw2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {

	public SpaceUpper() {
		// TODO Auto-generated constructor stub
	}
	
	public void spaceToUpper() {
		Scanner sc = new Scanner(System.in);
		System.out.println("영어를 입력하시오(띄어쓰기 포함):");
		String str = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(str," ");
		StringBuilder sb = new StringBuilder("");
		while(st.hasMoreTokens()) {  
			String newst = st.nextToken(); 
			sb.append(newst.substring(0, 1).toUpperCase()).append(newst.substring(1)).append(" ");
		}
		System.out.println(sb);
		
	}
}
