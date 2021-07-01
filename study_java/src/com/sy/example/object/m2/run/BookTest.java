package com.sy.example.object.m2.run;

import com.sy.example.object.m2.Book;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1 = new Book();
		Book b2 = new Book("자바의 정석",20000,0.2,"윤상섭");
		
		System.out.println(b1.information());
		System.out.println(b2.information());
		
		System.out.println("===============================");
	
		b1.setTitle("C언어");
		b1.setPrice(30000);
		b1.setDiscountRate(0.1);
		b1.setAuthor("윤상섭");
		
		System.out.println("수정된 결과 확인");
		System.out.println(b2.information());
		
		System.out.println("===============================");
		
		System.out.printf("도서명 = %s\n", b1.getTitle());
		System.out.printf("도서명 = %d원\n", (int)(b1.getPrice()*(1-b1.getDiscountRate())));
		System.out.printf("도서명 = %s\n", b2.getTitle());
		System.out.printf("도서명 = %d원\n", (int)(b2.getPrice()*(1-b2.getDiscountRate())));
	}
}
