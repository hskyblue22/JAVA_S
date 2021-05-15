package com.mvc.view;

import java.util.Scanner;

import com.mvc.controller.MemberController;

public class MemberView {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberView() {
		// TODO Auto-generated constructor stub
	}
	
	public void mainMenu() {
		System.out.println("아이디 입력하시오 : "); 
		String id = sc.nextLine();
		
		System.out.println("비밀번호 입력하시오 : "); 
		String pwd = sc.nextLine();
		
		int result = mc.login(id, pwd);
		
		// 입력받은 아이디, 비밀번호 값을
		// MemberController 클래스의 login 메소드에 전달하고
		// 그 결과값을 result변수에 받는다.
		// 성공적으로 로그인 했을 경우 => 즉, result 변수 값이 1일 경우 아래의 메뉴출력
		
		if(result == 1) {
			while(true) {
				System.out.println("=== 회원 프로그램 ===");
				System.out.println("1. 내 정보 보기");
				System.out.println("2. 내 나이 조회하기");
				System.out.println("3. 키 수정하기");
				System.out.println("9. 프로그램 종료하기");
				
				System.out.println("메뉴 번호 선택 : ");
				int num = sc.nextInt();
				
				switch(num) {
				case 1 : // MemberController의 readInfo() 호출
					System.out.println(mc.readInfo().information());
					break;
				case 2 : // MemberController의 readAge() 호출
					System.out.println(mc.readAge());
					break;
				case 3 :
					updateHeight();
					break;
				case 9 :
					System.out.println("프로그램을 종료합니다.");
					return;
				default : 
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
			}
		} else {
			System.out.println("회원정보가 맞지 않습니다. 프로그램을 종료합니다.");
			return;
		}
		// 위의 메뉴 무한 반복 실행
		// 로그인에 실패 했을 경우 => 즉, result 변수 값이 0일 경우 => 프로그램 종료
	}
	
	public void updateHeight() {
		System.out.println("수정할 키를 입력하시오 : ");
		double height = sc.nextDouble();
		
		mc.updateHeight(height);
	}
	
}
