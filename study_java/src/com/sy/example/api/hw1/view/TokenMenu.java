package com.sy.example.api.hw1.view;

import java.util.Scanner;

import com.sy.example.api.hw1.controller.TokenController;

public class TokenMenu {

	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();

	public void mainMenu() {
		while(true) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("9. 프로그램 끝내기");
			System.out.println("메뉴 번호 :");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: tokenMenu(); break;
			case 2: inputMenu(); break;
			case 9: System.out.println("프로그램을 종료합니다."); break;
			default: System.out.println("잘못 입력하셨습니다. 다시입력해주세요");
			}
		}
	}
	
	public void tokenMenu() {
		String str = "J a v a P r o g r a m";
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " +str.length());
		
		String after = tc.afterToken(str);
		System.out.println("토큰 처리 후 글자: " + after);
		System.out.println("토큰 처리 후 개수 : " + after.length());
		System.out.println("모두 대문자로 변환 : " + after.toUpperCase());
	}
	
	public void inputMenu() {
		System.out.println("문자열을 입력해주세요 : ");
		String str = sc.nextLine();
		
		String fCap = tc.firstCap(str);
		System.out.println("첫 글자 대문자 : " + fCap);
		
		System.out.println("찾을 문자 하나를 입력하세요 : ");
		char one = sc.nextLine().charAt(0);
		
		int num = tc.findChar(fCap, one);
		System.out.println(one + " 문자가 들어간 개수 : "+num);
		
		
	}
}
