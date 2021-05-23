package com.kh.chap03_stringTokenizer.run;

import java.util.StringTokenizer;

public class Run {

	public static void main(String[] args) {
		//StringTokenizer
		//: String(문자열)을 어떤 특수기호를 기준으로 Token단위로 나눠서 처리할 때 쓰임
		//split 메소드와 유사하나 split메소드를 쓰면 String배열로 처리, StringTokenizer는 자체 클래스로 저장
		

		String str = "김남길,유산슬,유야호,카놀라유,로운";
		StringTokenizer st = new StringTokenizer(str, ",");
		
		System.out.println(st.countTokens());  //토큰개수 리턴
		int i=0;
		while(st.hasMoreTokens()) {  //커서다음에 토큰이 있는지 확인
			String whStr = st.nextToken();
			System.out.println(whStr);
			System.out.println(st.countTokens());
		}
		
		
	}

}
