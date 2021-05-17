package com.kh.chap01_before_vs_after.before.run;

import com.kh.chap01_before_vs_after.before.model.vo.Desktop;
import com.kh.chap01_before_vs_after.before.model.vo.Smartphone;
import com.kh.chap01_before_vs_after.before.model.vo.Tv;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Desktop d = new Desktop("삼성","d_01","KH데스크탑",1000000,true);
		
		Smartphone s = new Smartphone("애플","s_01","KH아이폰",2000000,"SK");
		
		Tv t = new Tv("LG", "t_01", "KH티비", 3000000, 46);
		
		System.out.println(d.information());
		System.out.println(s.information());
		System.out.println(t.information());
		
		
		//공통적으로 가지고 있는 필드 --> 제조사, 상품번호, 상품명, 가격 ==> Product 부모 클래스
		
	}

}
