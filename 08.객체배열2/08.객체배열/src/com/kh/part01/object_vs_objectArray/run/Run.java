package com.kh.part01.object_vs_objectArray.run;

import java.util.Scanner;

import com.kh.part01.object_vs_objectArray.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book bk1 = null;  //전역변수 - 클래스 내에서 여기저기 쓰는 것들
		Book bk2 = null;  //for문에서 생성하면 for문 밖에서 print할 수 없음
		Book bk3 = null;
	
		Scanner sc = new Scanner(System.in);  //전역변수
		
		for(int i=0; i<3; i++ ) {
			System.out.println(i+1 +"번째 도서정보 입력");
			System.out.println("제목 : ");
			String title = sc.nextLine();
			
			System.out.println("저자 : ");
			String author = sc.nextLine();
			
			System.out.println("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.println("출판사 : ");
			String publisher = sc.nextLine();
			
			
			if(i == 0) {
				bk1 = new Book(title, author, price, publisher);
			}else if(i==1) {
				bk2 = new Book(title, author, price, publisher);
			}else if(i==2) {
				bk3 = new Book(title, author, price, publisher);
			}
		}//객체생성끝
		
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		
		//도서제목 검색
		System.out.println("검색할 책제목 : ");
		String search = sc.nextLine();
		if(search.equals(bk1.getTitle())) {
			System.out.println(bk1.information());
			
		}else if(search.equals(bk2.getTitle())) {
			System.out.println(bk2.information());
			
		}else if(search.equals(bk3.getTitle())) {
			System.out.println(bk3.information());
			
		}else {
			System.out.println("검색되는 도서는 없습니다.");
		}
		
	}

}
