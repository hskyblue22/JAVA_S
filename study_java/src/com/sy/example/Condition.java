package com.sy.example;

import java.util.Scanner;

public class Condition {

	Scanner sc = new Scanner(System.in);
	
	//3.조건문
	public void practice4() {
		System.out.print("1~12사이의 정수 입력 : ");
		int mon = sc.nextInt();
		
		String season = "";
		
		switch(mon) {
		case 12 :
		case 1 :
		case 2:
			season = "겨울";
			break;
		case 3:
		case 4: 
		case 5: 
			season = "봄";
			break;
		case 6:
		case 7: 
		case 8: 
			season = "여름";
			break;
		case 9:
		case 10: 
		case 11: 
			season = "겨울";
			break;
		default :
			season = "잘못 입력된 달";			
		}
		System.out.println(mon + "월은 " + season +"입니다.");
	}
	
	public void practice5() {
		String user_id = "user1";
		String user_pw = "1234";
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
		if(user_id.equals(id) && user_pw.equals(pw)) {
			System.out.println("로그인 성공");
		}else {
			if(!user_id.equals(id)) {
				System.out.println("아이디가 틀렸습니다.");
			}
			if(!user_pw.equals(pw)) {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}		
	}
	
	public void practice6() {
		System.out.println("권한을 확인하고자 하는 회원 등급 : ");
		String mem = sc.nextLine();
		
		switch(mem) {
		case "관리자" :
			System.out.println("회원관리, 게시글 관리");
		case "회원" : 
			System.out.println("게시글 작성, 댓글 작성");
		case "비회원" : 
			System.out.println("게시글 조회");
		default:
			System.out.println("잘못 입력했습니다.");
		}			
	}
	
	public void practice8() {
		System.out.print("피연산자1 입력 : ");
		int n1 = sc.nextInt();
		
		System.out.print("피연산자2 입력 : ");
		int n2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char op = sc.nextLine().charAt(0);
		
		int result = 0;
		
		if(n1<=0 || n2<=0) {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}else {
			switch(op) {
			case '+' :
				result = n1 + n2; break;
			case '-' :
				result = n1 - n2; break;
			case '*' :
				result = n1 * n2; break;
			case '/' :
				result = n1 / n2; break;
			case '%' :
				result = n1 % n2; break;
			default :
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				return;
			}
			System.out.println(n1+" "+op+" " + n2 +" = "+result);
		}
	}
	
	public void practice9() {
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int fin = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int sub = sc.nextInt();
		
		System.out.print("출석 회수 : ");
		int att = sc.nextInt();
		
		double m = mid*0.2;
		double f = fin*0.3;
		double s = sub*0.3;
		
		double sum = m + f + s + att;
		
		System.out.println("===========결과==========");
		
		if(sum>=70 && att>=20*0.7) {
			System.out.println("중간 고사 점수(20) : " + m);
			System.out.println("기말 고사 점수(30) : " + f);
			System.out.println("과제 점수(30) : " + s);
			System.out.println("출석 점수(20) : " + att*1.0);
			System.out.println("총점 : "+sum + "\nPASS");
		}else {
			if(att<20*0.7) {
				System.out.println("FAIL [출석 횟수 부족] ("+ att +"/20)");
			}
			if(sum < 70) {
				System.out.println("FAIL [점수미달] (총점 "+sum+")");
			}
		}
		
	}
}
