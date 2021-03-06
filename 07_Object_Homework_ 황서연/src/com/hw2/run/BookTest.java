package com.hw2.run;

import com.hw2.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1. 기본생성자를 이용한 객체생성, 매개변수를 이용한 객체생성 후 출력
		Book b1 = new Book();
		Book b2 = new Book("자바의정석", 20000, 0.2, "윤상섭");
		
		System.out.println(b1.information());
		System.out.println(b2.information());
		
		System.out.println("===========================================");
			
		// 2. 첫번째 객체가 가진 값을 setter를 이용해서 수정 후 출력
		b1.setTitle("C언어");
		b1.setPrice(30000);
		b1.setDiscountRate(0.1);
		b1.setAuthor("홍길동");
		
		System.out.println("수정된 결과 확인");
		System.out.println(b1.information());
		
		System.out.println("===========================================");
		
		// 3. getter를 이용하여 두 객체 각각 할인율을 적용한 책 가격을 계산해서 출력함
		System.out.println("도서명 = " + b1.getTitle());
		System.out.println("할인된 가격 = "+ (int)(b1.getPrice()-b1.getPrice()*b1.getDiscountRate()) + "원");
		System.out.println("도서명 = " + b2.getTitle());
		System.out.println("할인된 가격 = "+ (int)(b2.getPrice()-b2.getPrice()*b2.getDiscountRate()) + "원");
		
		
	}

}
