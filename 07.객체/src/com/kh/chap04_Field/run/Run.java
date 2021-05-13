package com.kh.chap04_Field.run;

import com.kh.chap04_Field.model.vo.FieldTest2;
import com.kh.chap04_Field.model.vo.FieldTest3;
import com.kh.chap04_Field.model.vo.Fieldtest4;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//--------------1.FieldTest1
		
//		FieldTest1 f1 = new FieldTest1();
//		f1.test(2);  //매개변수 반드시 입력해주어야 함
		
		
		//--------------2.FieldTest2
		
		FieldTest2 f2 = new FieldTest2();
		
		//public --> 어디서든 접근 가능
		System.out.println(f2.pub);
		
		//protected --> 같은 패키지 내, 상속구조에서만 접근가능
		//System.out.println(f2.pro); --> 다른 패키지이면서 상속구조가 아니기 때문에 접근불가
		System.out.println(f2.getPro());  //getter메소드를 통해 값을 알아올 수 있다.
		
		
		//defaul --> 같은 패키지 내에서만 접근가능
		//System.out.println(f2.def); --> 다른 패키지이기때문에 접근불가
		System.out.println(f2.getDef());  //getter메소드를 통해 값을 알아올 수 있다.
		
		//private --> 같은 클래스 내에서만 접근 가능
		//System.out.println(f2.pri); --> 다른 패키지이기때문에 접근불가
		System.out.println(f2.getPri());  //getter메소드를 통해 값을 알아올 수 있다.
		
		
		//--------------3.FieldTest3
		
		//FieldTest3 f3 = new FieldTest3();
		
		//public static
		System.out.println(FieldTest3.pubsta);  //객체 생성필요없이 바로 [클래스명.]으로 접근이 가능하다.
		
		//private static
//		System.out.println(FieldTest3.prista);  //private이기 때문에 바로 접근이 안된다.
		System.out.println(FieldTest3.getPrista());
		
		
		//--------------4.FieldTest4
		
		System.out.println(Fieldtest4.NUM); //객체생성할 필요없이 바로 .으로 접근 가능
		
		System.out.println(Math.PI);  //고정됨, 변경할 수 없음
		
	}

}
