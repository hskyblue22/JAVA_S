package com.sy.example.object.mvc.view;

import java.util.Scanner;

import com.sy.example.object.mvc.controller.MemberController;

public class MemberView {

	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public MemberView() {
		// TODO Auto-generated constructor stub
	}
	
	public void mainMenu() {
		System.out.print("아이디 입력하시오 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 입력하시오 : ");
		String pwd = sc.nextLine();
		
		if(mc.login(id, pwd) == 0) {
			System.out.println("아이디, 비밀번호 불일치. 프로그램 종료");
		}else {
			while(true) {
				System.out.println("=== 회원 프로그램 ===");
				System.out.println("1. 내 정보 보기");
				System.out.println("2. 내 나이 조회하기");
				System.out.println("3. 키 수정하기");
				System.out.println("9. 프로그램 종료하기");
				System.out.print("메뉴번호 선택 : ");
				int menu = sc.nextInt();
				sc.nextLine();
				
				switch(menu) {
				case 1: 
					System.out.println(mc.readInfo().information()); break;
				case 2: 
					String name = mc.readInfo().getMemberName();
					int age = mc.readAge();
					System.out.printf("%s님의 나이 : %d\n", name, age); break;
				case 3: updateHeight(); break;
				case 9: System.out.println("프로그램 종료"); return;
				default: System.out.println("다시 입력"); break;
				}
			}
		}
	}
	
	public void updateHeight() {
		System.out.print("수정할 키를 입력하시오 : ");
		double height = sc.nextDouble();
		mc.updateHeight(height);
		System.out.println("키를 수정하였습니다.");
	}
	
}
