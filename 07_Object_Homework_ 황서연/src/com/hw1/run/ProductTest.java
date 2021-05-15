package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1. 매개변수 생성자를 이용하여 3개의 객체 생성 후 출력
		Product p1 = new Product("ssgnote9","갤럭시노트9","경기도 수원",960000,10.0);
		System.out.println(p1.information());
		
		Product p2 = new Product("Igxnote5","LG스마트폰5","경기도 평택",780000,0.7);
		System.out.println(p2.information());
		
		Product p3 = new Product("ktsnote3","KT스마트폰3","서울시 강남",250000,0.3);
		System.out.println(p3.information());
		
		System.out.println("===============================================");
		
		//2. setter메소드를 이용하여 가격을 모두 120만원으로 수정, 부가세율도 모두 0.05로 수정 후 출력
		p1.setprice(1200000);
		p2.setprice(1200000);
		p3.setprice(1200000);
		
		p1.settax(0.05);
		p2.settax(0.05);
		p3.settax(0.05);
		
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		
		System.out.println("===============================================");
		
		//3. getter 메소드를 이용하여 각 객체의 가격에 부가세율을 적용한 실제 가격을 계산해서 출력
		System.out.println("상품명 = "+p1.getproductName());
		System.out.println("부가세 포함 가격 = " + (int)(p1.getprice() + p1.getprice()*p1.gettax()) +"원" );
		
		System.out.println("상품명 = "+p2.getproductName());
		System.out.println("부가세 포함 가격 = " + (int)(p2.getprice() + p2.getprice()*p2.gettax()) +"원" );
		
		System.out.println("상품명 = "+p3.getproductName());
		System.out.println("부가세 포함 가격 = " + (int)(p3.getprice() + p3.getprice()*p3.gettax()) +"원" );
		
		
		
	}

}
