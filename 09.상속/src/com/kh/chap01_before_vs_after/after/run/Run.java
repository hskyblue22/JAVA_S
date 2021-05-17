package com.kh.chap01_before_vs_after.after.run;

import com.kh.chap01_before_vs_after.after.model.vo.Desktop;
import com.kh.chap01_before_vs_after.after.model.vo.Smartphone;
import com.kh.chap01_before_vs_after.after.model.vo.Tv;

public class Run {
	/* 상속
	 *  [접근제어자][기타제어자] class 클래스명 extends 상위 클래스명 [implements 인터페이스]
	 *  
	 *  # this,super ==> static 메소드에서는 사용 할 수 없다.
	 *  super : 상위 클래스를 가르키는 레퍼런스 변수, 은닉변수를 불러온다.
	 *  this : 클래스 인스턴스 나 자신을 나타내는 레퍼런스 변수
	 *  
	 *  this(),super() : 생성자 호출 : 생성자 내에 첫번째 줄에서 사용
	 *  
	 *  상속의 잠정
	 *  - 보다 적은 양의 코드로 새로운 클래스를 작성 가능
	 *  - 코드를 공통적으로 관리하기 때문에 코드의 추가, 변경에 용이
	 *  - 코드의 중복을 제거해서 프로그램의 생산성과 유지보수에 크게 기여
	 *  
	 *  상속의 특징
	 *  - 클래스가 상속은 단일상속만 가능 (다중상속 불가능) extends Product, SmartPhone 불가능
	 *  - 명시되어 있지 않지만 모든 클래스는 object 클래스의 후손이다. --> 즉 object 클래스가 제공하는 메소드를 오버라이딩하여 메소드 재정의를 할 수 있다.
	 *  - 부모클래스의 생성자와 초기화 블록은 상속이 불가능하다 (자식 클래스 생성시 부모클래스 생성자가 먼저실행)
	 *  - 부모의 private 멤버(필드, 메소드)는 상속은 되지만 직접 접근은 불가능하다 (단, protected로 하게 되면 후손클래스가 직접 접근이 가능하다.)
	 *  
	 *  
	 */
	
	public static void main(String[] args) {
		
		Desktop d = new Desktop("삼성","d_01","KH데스크탑",1000000,true);
		
		Smartphone s = new Smartphone("애플","s_01","KH아이폰",2000000,"SK");
		
		Tv t = new Tv("LG", "t_01", "KH티비", 3000000, 46);
		
		System.out.println(d.information());
		System.out.println(s.information());
		System.out.println(t.information());
		
		t.setBrand("삼성");
		System.out.println(t.information());
		
		//실행하고자 하는 메소드가 자식에 없으면 -> 부모메소드 실행
		//단, 자식에 메소드가 동일하게 작성되어있으면 자식 메소드가 우선권을 가짐
		//오버라이딩 : 부모클래스의 메소드를 자식클래스에서 재정의해서 사용하는 것
		d.print();  //Desktop에 print()없으면 Product에 있는 print()메소드 실행
					
		
	}

}
