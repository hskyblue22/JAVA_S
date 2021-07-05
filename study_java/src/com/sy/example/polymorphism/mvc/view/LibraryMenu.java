package com.sy.example.polymorphism.mvc.view;

import java.util.Scanner;

import com.sy.example.polymorphism.mvc.controller.LibraryManager;
import com.sy.example.polymorphism.mvc.model.vo.Book;
import com.sy.example.polymorphism.mvc.model.vo.Member;

public class LibraryMenu {

	private LibraryManager lm = new LibraryManager();
	Scanner sc = new Scanner(System.in);
	
	public LibraryMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public void mainMenu() {
		// 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
		// LibraryManager의 insertMember() 메소드에 전달
		System.out.println("회원가입을 시작합니다.");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);
		
		Member mem = new Member(name, age, gender);
		lm.insertMember(mem);
		
//		==== 메뉴 ==== // 무한 반복 실행
//		1. 마이페이지 // LibraryManager의 myInfo() 호출한 후 그 결과값 출력
//		2. 도서 전체 조회 // LibraryMenu의 selectAll() 호출
//		3. 도서 검색 // LibraryMenu의 searchBook() 호출
//		4. 도서 대여하기 // LibraryMenu의 rentBook() 호출
//		0. 프로그램 종료하기
//		
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("0. 프로그램 종료하기");
			
			System.out.println("메뉴를 입력하세요 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: 
				System.out.println(lm.myinfo().toString()); break;
			case 2: selectAll(); break;
			case 3: searchBook(); break;
			case 4: rentBook(); break;
			case 0: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("다시 입력해주세요"); break;
			}
		}
	}
	
	public void selectAll() {
		Book[] bList = lm.selectAll();
		
		//ex ) 0번도서 : 백종원의 집밥 / 백종원 / tvN / true
		for(int i=0; i<bList.length; i++) {
			if(bList[i] != null) {
				System.out.println(i+"번도서 : " +bList[i].toString());
			}
		}
	}
	
	public void searchBook() {
		System.out.println("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		
		Book[] searchList = lm.searchBook(keyword);
		
		for(Book bk : searchList) {
			if(bk != null) {
				System.out.println(bk.toString());
			}
		}
	}
	
	public void rentBook() {
		selectAll();
		
		System.out.println("대여할 도서 번호 선택 : ");
		int num = sc.nextInt();
		
		int result = lm.rentBook(num);
		if(result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		}else if(result == 1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		}else if(result == 2) {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.");
		}
	}
}
