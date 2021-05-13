package com.kh.chap05_initBlock.run;

import com.kh.chap05_initBlock.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p = new Product();
		System.out.println(p.information());
		
		
		// 순서
				// 1. JVM이 정한 기본값으로 객체 생성됨 
				// 2. 명시적 초기화 ex) String name = "홍길동";
				// 3. 클래스 초기화 블럭
				// 4. 인스턴스 초기화 블럭
				
				// 클래스 변수의 초기화 순서
				// JVM이 정한 기본값 -> 명시적 초기값 -> 초기화 블록(static블록, 인스턴스블록)
				
				// 인스턴스 변수의 초기화 순서
				// JVM이 정한 기본값 -> 명시적 초기값 -> 초기화 블록(인스턴스 블록) -> 매개변수가 있는 생성자
		
	}

}
