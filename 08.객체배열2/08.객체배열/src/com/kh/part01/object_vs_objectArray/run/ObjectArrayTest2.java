package com.kh.part01.object_vs_objectArray.run;

import java.util.Scanner;

import com.kh.part01.object_vs_objectArray.model.vo.Product;

public class ObjectArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//제품을 담을  Product객체 배열 할당 - 3개제품을 받도록 & 정보출력은 for문으로
		
		Product[] arr = new Product[3];
		
		arr[0] = new Product("갤럭시","삼성",100000);
		arr[1] = new Product("아이폰","애플",500000);
		arr[2] = new Product("라즈베리","ㅇ", 250000);
		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(i+1 + " 제품 이름 : ");
//			String name = sc.nextLine();
//			
//			System.out.println(i+1 + " 제품 브랜드 : ");
//			String brand = sc.nextLine();
//			
//			System.out.println(i+1 + " 제품 가격 : ");
//			int price = sc.nextInt();
//			sc.nextLine();
//			
//			arr[i] = new Product(name, brand, price);
//		}
		
		for(Product pro : arr) {
			System.out.println(pro.information());
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].information());
		}
	
	}

}
