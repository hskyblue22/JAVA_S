package com.sy.example.object.m1;

import com.sy.example.object.m1.Product;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p1 = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		Product p2 = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		Product p3 = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
	
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		
		System.out.println("=======================================================");
	
		p1.setTax(0.05);
		p2.setTax(0.05);
		p3.setTax(0.05);

		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		
		System.out.println("=======================================================");
	
		System.out.println("상품명 = "+p1.getProductName());
		System.out.println("부가세 포함 가격 = " + (int)(p1.getPrice() + p1.getPrice()*p1.getTax()) +"원" );
		
		System.out.println("상품명 = "+p2.getProductName());
		System.out.println("부가세 포함 가격 = " + (int)(p2.getPrice() + p2.getPrice()*p2.getTax()) +"원" );
		
		System.out.println("상품명 = "+p3.getProductName());
		System.out.println("부가세 포함 가격 = " + (int)(p3.getPrice() + p3.getPrice()*p3.getTax()) +"원" );
	
	}

}
