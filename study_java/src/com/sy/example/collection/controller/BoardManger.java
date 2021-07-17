package com.sy.example.collection.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import com.sy.example.collection.model.comparator.AscBoardDate;
import com.sy.example.collection.model.comparator.AscBoardNo;
import com.sy.example.collection.model.comparator.AscBoardTitle;
import com.sy.example.collection.model.comparator.DescBoardDate;
import com.sy.example.collection.model.comparator.DescBoardNo;
import com.sy.example.collection.model.comparator.DescBoardTitle;
import com.sy.example.collection.model.dao.BoardDao;
import com.sy.example.collection.model.vo.Board;

public class BoardManger {
	private BoardDao bd = new BoardDao();
	private Scanner sc = new Scanner(System.in);
	
	public BoardManger() {
		
	}
	public void writeBoard() {
		// "새 게시글 쓰기 입니다." 출력
		// "글 제목 : " >> 입력 받음 (공백 포함)
		// "작성자 : " >> 입력 받음 (공백 없이)
		// 작성날짜는 현재 날짜로 처리함
		// "글 내용 : " >> 여러 줄로 입력 받음 >>"exit" 입력하면 입력종료
		// BoardDao의 getLastBoardNo() 메소드를 통해 게시글의 마지막 번호를 알아옴
		// Board 객체 생성시 초기값으로 사용함
		// BoardDao의 writeBoard() 메소드 호출 시 해당 Board 전달
		// 파일이 존재하지 않을 경우, 즉 첫 글 등록일 경우 예외 발생
		// 어떤 예외처리가 발생하는지 알아보고 try catch문을 이용하여 오류 해결
		
		System.out.println("새 게시글 쓰기입니다.");
		System.out.print("글 제목 : ");
		String title = sc.nextLine();
		System.out.print("작성자 : ");
		String author = sc.next();
		Date today = new Date();  //현재 날짜
		System.out.print("글 내용 : ");
		String content = "";
		while(true) {
			String str = sc.nextLine();  //밑에 바로 sc.nextLine()넣으면 제대로 안됨
			
			if(str.equals("exit")) {  //exit 포함안되게끔
				break;
			}else {
				content += str+"\n";
			}
		}
		int lNo;  
		//파일 없을때 발생하는 예외(dao에서)
		try{
			lNo = bd.getLastBoardNo();
		}catch(IndexOutOfBoundsException e) {  
			lNo = 1;
		}
		Board b = new Board(lNo, title, author, today, content);  //예외처리
		bd.writeBoard(b);
		System.out.println("새 게시글이 등록되었습니다.");
	}
	
	public void displayAllList() {
		// BoardDao의 displayAllList() 메소드를 호출하여 ArrayList를 전달받음
		// Iterator를 이용하여 list 에 기록된 정보를 모두 화면에 출력시킴
		
		ArrayList<Board> alist = bd.displayAllList();
		System.out.println(alist.size());
		Iterator i = alist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	public void displayBoard() {
		// “조회할 글 번호 : “ >> 입력 받음
		// BoardDao의 displayBoard() 메소드에 글 번호를 전달하여
		//=> 해당 글 번호의 게시글 전달 받아 출력하고
		// 조회수를 올리기 위해 BoardDao의 upReadCount() 메소드에 해당 글 번호 전달
		// 만약 없을 경우 “조회된 글이 없습니다.” 출력
				
		System.out.println("조회할 글 번호 : ");
		int no = sc.nextInt();
		sc.nextLine();
		
		Board b = bd.displayBoard(no);  
		
		if(b != null) {
			System.out.println(b);
			bd.upReadCount(no);
		}else {
			System.out.println("조회된 글이 없습니다.");
		}	
	}
	
	public void modifyTitle() {
		// “수정할 글 번호 : “ >> 입력 받음
		// BoardDao의 displayBoard() 메소드에 글 번호를 전달하여
		//=> 해당 글 번호의 게시글 전달 받아 출력하고
		// “변경할 글 제목 : “ >> 입력 받음
		// BoardDao의 modifyTitle() 메소드에 해당 글 번호와 변경할 제목 전달
		// 만약 없을 경우 “조회된 글이 없습니다.” 출력
		
		System.out.println("수정할 글 번호 : ");
		int no = sc.nextInt();
		sc.nextLine();
		
		Board b = bd.displayBoard(no);
		if(b != null) {
			System.out.println(b);  //출력
			
			System.out.println("변경할 글 제목 : ");
			String title = sc.nextLine();  
			bd.modifyTitle(no, title);
			System.out.println("게시글의 제목이 변경되었습니다.");
			
		}else {
			System.out.println("조회된 글이 없습니다.");
		}
	}
	
	public void modifyContent() {
		System.out.println("수정할 글 번호 : ");
		int no = sc.nextInt();
		sc.nextLine();
		
		Board b = bd.displayBoard(no);
		if(b != null) {
			System.out.println(b);  //출력
			
			System.out.println("변경할 글 내용 : ");
			String title = "";
			while(true){
				String input = sc.nextLine();
				if(input.equals("exit")) {
					break;
				}else {
					title += input + "\n";
				}
			}
			bd.modifyContent(no, title);
			System.out.println("게시글의 내용이 변경되었습니다.");
			
		}else {
			System.out.println("조회된 글이 없습니다.");
		}
	}
	
	public void deleteBoard() {
		// “삭제할 글 번호 : “ >> 입력 받음
		// BoardDao의 displayBoard() 메소드를 호출하여 해당 글 번호의 게시글 전달 받아 출력
		// 만약 없을 경우 “조회된 글이 없습니다.” 출력
		// 있을 경우 “정말로 삭제하시겠습니까? (y/n) : “ >> 입력 받음
		// 대소문자 관계없이 Y 일 경우 BoardDao의 deleteBoard() 메소드에 해당 글 번호 전달
		
		System.out.println("삭제할 글 번호 : ");
		int no = sc.nextInt();
		sc.nextLine();
		
		Board b = bd.displayBoard(no);  //***이거 계속 반복, 반복 피할 수 있는 방법은 없나?
		if(b != null) {
			System.out.println(b);
			System.out.println("정말로 삭제하시겠습니까?(y/n)");
			if(sc.nextLine().toUpperCase().equals("Y")) {
				bd.deleteBoard(no);
			}
			System.out.println("게시글이 삭제되었습니다.");
		}else {
			System.out.println("조회된 글이 없습니다.");
		}
	}
	
	public void searchBoard() {
		// “검색할 제목 : “ >> 입력 받음
		// BoardDao의 searchBoaard() 메소드에 입력 값 전달
		// 제목은 중복될 수 있기 때문에 결과값 다중  list로 결과값 전달받음
		// 결과값이 없으면 “검색 결과가 없습니다.” 출력
		// 결과값이 있으면 list출력
		System.out.println("검색할 제목 : ");
		String title = sc.nextLine();
		
		ArrayList<Board> blist = bd.searchBoard(title);
		if(blist != null) {
			for(Board b : blist) 
				System.out.println(b);
			//조회수 증가
		}else {
			System.out.println("검색 결과가 없습니다.");
		}
	}
	
	public void saveListFile() {
		bd.saveListFile();
		System.out.println("파일에 저장이 완료되었습니다.");
	}
	
	public void sortList(int item, Boolean isDesc) {
		ArrayList<Board> allList =bd.displayAllList();
		switch(item) {
		case 1:
			if(isDesc) 
				allList.sort(new DescBoardNo());
			else
				allList.sort(new AscBoardNo());
		case 2:
			if(isDesc)
				allList.sort(new DescBoardDate());
			else
				allList.sort(new AscBoardDate());
		case 3:
			if(isDesc)
				allList.sort(new DescBoardTitle());
			else
				allList.sort(new AscBoardTitle());
		}
		
		for(Board b : allList) {
			System.out.println(b);
		}
	}
}
