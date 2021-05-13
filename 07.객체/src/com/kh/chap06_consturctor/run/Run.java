package com.kh.chap06_consturctor.run;

import com.kh.chap06_consturctor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1.기본생성자로 객체 생성 직후 해당 객체의 정보 출력
		User u1 = new User();
		System.out.println(u1.information());
		
		//2.매개변수 3개짜리 생성자로 객체생성
		User u2 = new User("user02","pass02","유야호");
		System.out.println(u2.information());
		
		//3.다른 매개변수 생성자로 객체 생성 -> 오버로딩
		User u3 = new User("user03","user03","유야호",20,'M');
		System.out.println(u3.information());
	
	}

}
