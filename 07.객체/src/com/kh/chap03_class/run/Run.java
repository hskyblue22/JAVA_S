package com.kh.chap03_class.run;

import java.util.Scanner;

import com.kh.chap03_class.model.vo.Person;  //다른 패키지여서 import한다.
import com.kh.chap03_class.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//객체 생성
		Person p = new Person();
		
		p.setId("user01");
		p.setPwd("pass");
		p.setName("이효리");
		p.setAge(29);
		p.setGender('F');
		p.setPhone("010-1234-5678");
		p.setEmail("lee@kh.com");
		
		//출력
		System.out.println(p.information());

		
		Scanner sc = new Scanner(System.in);
		System.out.println("변경할 이름 : ");
		
		String name = sc.nextLine();
		p.setName(name);
		
		System.out.println(p.information());
		
		
		
		//======================================
		
		Product a = new Product();
		
		a.setBrand("삼성");
		a.setPrice(1000000);
		a.setPname("갤럭시");
		
		
		Product b = new Product();
		
		b.setBrand("애플");
		b.setPrice(2000000);
		b.setPname("아이폰");
		
		
		System.out.println(a.information());
		System.out.println(b.information());
		
		
		//DftProduct d = new DftProduct();  default class -> 다른 패키지라서 에러
		
	}

}
