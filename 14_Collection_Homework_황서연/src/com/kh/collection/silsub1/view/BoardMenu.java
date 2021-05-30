package com.kh.collection.silsub1.view;

import java.util.Scanner;

import com.kh.collection.silsub1.controller.BoardManager;

public class BoardMenu {

	private Scanner sc = new Scanner(System.in);
	private BoardManager bm = new BoardManager();
	
	public BoardMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public void mainMenu() {
		/* ******* 게시글 서비스 프로그램 *******
1. 게시글 쓰기 // writeBoard() 실행
2. 게시글 전체 보기 // displayAllList()
3. 게시글 한 개 보기 // displayBoard()
4. 게시글 제목 수정 // modifyTitle()
5. 게시글 내용 수정 // modifyContent()
6. 게시글 삭제 // deleteBoard()
7. 게시글 검색 // searchBoard()
8. 파일에 저장하기 // saveListFile()
9. 정렬하기 // BookMenu 의 sortSubMenu() 실행
10. 끝내기 // main() 으로 리턴함
메뉴 번호 선택 : >> 입력 받음
// 메뉴 화면 반복 실행 처리
// 해당 메뉴 번호에 따라 BoardManager 클래스 메소드 실행*/
		
		while(true) {
			System.out.println("******* 게시글 서비스 프로그램 *******");
			System.out.println("1. 게시글 쓰기 ");
			System.out.println("2. 게시글 전체 보기");
			System.out.println("3. 게시글 한 개 보기");
			System.out.println("4. 게시글 제목 수정 ");
			System.out.println("5. 게시글 내용 수정 ");
			System.out.println("6. 게시글 삭제");
			System.out.println("7. 게시글 검색");
			System.out.println("8. 파일에 저장하기");
			System.out.println("9. 정렬하기");
			System.out.println("10. 끝내기");
			
			System.out.println("메뉴 번호 선택 :");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				bm.writeBoard();
				break;
			case 2:
				bm.displayAllList();
				break;
			case 3:
				bm.displayBoard();
				break;
			case 4:
				bm.modifyTitle();
				break;
			case 5:
				bm.modifyContent();
				break;
			case 6:
				bm.deleteBoard();
				break;
			case 7:
				bm.searchBoard();
				break;
			case 8:
				bm.saveListFile();
				break;
			case 9:
				sortSubMenu();
				break;
			case 10:
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
			}
			
		}
		
		
	}
	
	public void sortSubMenu() {
		/* ****** 게시글 정렬 메뉴 ******
1. 글번호순 오름차순정렬 // BookManager 의 sortList(1, false) 실행
2. 글번호순 내림차순정렬 // sortList(1, true) 실행
3. 작성날짜순 오름차순정렬 // sortList(2, false) 실행
4. 작성날짜순 내림차순정렬 // sortList(2, true) 실행
5. 글제목순 오름차순정렬 // sortList(3, false) 실행
6. 글제목순 내림차순정렬 // sortList(3, true) 실행
7. 이전 메뉴로 이동 // return 처리
메뉴 번호 선택 : 입력 받음
// 메뉴 화면 반복 실행 처리*/
		
		while (true) {
			System.out.println("****** 게시글 정렬 메뉴 ******");
			System.out.println("1. 글번호순 오름차순 정렬");
			System.out.println("2. 글번호순 내림차순 정렬");
			System.out.println("3. 작성날짜순 오름차순 정렬");
			System.out.println("4. 작성날짜순 내림차순 정렬");
			System.out.println("5. 글제목순 오름차순 정렬");
			System.out.println("6. 글제목순 내림차순 정렬");
			System.out.println("7. 이전 메뉴로 이동");

			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1: 
				bm.sortList(1, false); 
				break;
			case 2: 
				bm.sortList(1, true); 
				break;
			case 3: 
				bm.sortList(2, false); 
				break;
			case 4: 
				bm.sortList(2, true); 
				break;
			case 5: 
				bm.sortList(3, false); 
				break;
			case 6: 
				bm.sortList(3, true); 
				break;
			case 7: return;
			default : System.out.println("잘못 입력하셨습니다."); break;
			}

		}
		
		
		
	}
	
}
