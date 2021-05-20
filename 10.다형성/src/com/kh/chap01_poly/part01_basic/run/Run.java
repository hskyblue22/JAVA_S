package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class Run {

	public static void main(String[] args) {
		//지금까지 배운것은 '='대입연산자의 양옆 자료형(타입)은 같아야한다.
	
	
		//1. 부모타입 레퍼런스(참조변수)로 부모 객체 다루는 경우
	
		System.out.println("1. 부모타입 레퍼런스로 부모객체 다루는 경우");
		Parent p1 = new Parent();
		p1.printParent();
		//p1 레퍼런스변수로 Parent접근가능
		
		
		//2. 자식타입 레퍼런스로 자식 객체 다루는 경우
		
		System.out.println("2. 자식타입 레퍼런스로 자식 객체 다루는 경우");
		Child1 c1 = new Child1();
		/*((Parent)c1)*/c1.printParent();
		c1.printChild1();
		//c1레퍼런스로 Parent,Child1 둘다 접근가능(Parent접근시 자동으로 형변환되어 진행되었던 것)
		//형변환 생략 가능 --> upcasting (자식레퍼런스.부모메소드)
		
		
		//3. 부모타입 레퍼런스로 자식 객체 다루는 경우
		
		Parent p2 = new Child1();
		p2.printParent();
		((Child1)p2).printChild1();
		//p2레퍼런스는 Parent만 접근가능
		//하지만 Child 접근하고 싶을때 형변환을 해야한다. (명시적(강제) 형변환) --> down casting (부모레퍼런스.자식메소드)
		//기본형 변수처럼 참조형 변수도 형변환이 가능함
		//단, 서로 상속관계에 있는 클래스 사이에서만 -> 참조형변수 형변환 가능
		
		
//		child1 c2 = new Parent(); --> 자식기능이 부모기능보다 많아서 안됨
//		Child1 c2 = (Child1) new Parent();
		
		
		
		//상속구조의 클래스들 간에는 형변환이 가능하다.
		
		// 1. UpCasting
		// 자식타입 ---> 부모타입으로 형변환
		// 생략이 가능하다 (자동 형변환)
		// 따라서 자식.부모메소드() 사용 가능했던 것
		
		// 2. DownCasting
		// 부모타입 ---> 자식타입으로 형변환
		// 생략이 불가능하다 (반드시 명시해줘야 한다)
		// ((자식)부모).자식메소드() 로 명시적 형변환 해야함
		
		// 3. 불가능한 경우 : 다형성의 정의는 부모타입으로 부터 파생된 여러가지 타입의 자식 객체를 부모 클래스 타입 하나로 다룰 수 있는 기술
		// Child1 c2 = new Parent(); // 컴파일에러 : 소스상의 문법 오류 (타입이 맞지않아 생기는 오류)
		// Child1 c2 = (Child1) new Parent(); // 명시적 다운 캐스팅 해주고 프로그램 실행
		// c2.printParent(); // 런타임에러 : 프로그램이 실행시 발생하는 오류
		
	
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1,2,4);
		arr1[1] = new Child1(2,3,5);
	
	
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(2,1,5);
		arr2[1] = new Child2(5,7,2);
	
	
		//다형성이 적용된 경우
		
		Parent[] arr = new Parent[4];
		arr[0] = new Child1(1,2,4);
		arr[1] = new Child2(2,1,5);
		arr[2] = new Child1(2,3,5);
		arr[3] = new Child2(5,7,2);
		
		//하나의 부모타입으로 다양한 자식들을 생성
		//--> 자식들에게 접근할 때 하나의 부모타입으로 접근할 수 있다.(코드길이가 감소, 유연한 코딩 가능)
	
		//각각의 자식 메소드를 실행 -> 자식 타입으로 형변환을 해서 자식 메소드를 실행
		//단, 이때 각 인덱스별로 실제 참조하고 있는 실제 자식 자료형으로 형변환을 해줘야 함
		
		((Child1)arr[0]).printChild1();  //실제 참조하고있는 타입으로 형변환
		((Child2)arr[1]).printChild2();
		((Child1)arr[2]).printChild1();
		((Child2)arr[3]).printChild2();
		
		System.out.println("반복문을 이용하여 출력");
		
		for(int i=0; i<arr.length; i++) {
			//instanceof 연산자
			// 현재 레퍼런스가 실제 어떤 클래스형의 주소를 참조하고 있는지 확인할 때 사용
			// 클래스 타입이 일치 -> true, 아니면 false --> 조건식 이용
			
			// 레퍼런스            클래스명(타입)
			if(arr[i] instanceof Child1) {   //해당 인덱스에 실제 Child1 타입을 참조하고 있으면 true
				((Child1)arr[i]).printChild1();  //자식1 형변환
			} else {
				((Child2)arr[i]).printChild2();  //자식2 형변환
			}
			arr[i].print();
			
			// 오버라이딩 개념을 접목하게 되면 자동으로 내가 실제 참고하고있는 클래스 메소드를 찾아가서 실행
			// 동적바인딩 : 프로그램이 실행 되기전에 컴파일이 되면서 모든 메소드는 정적바인딩이 된다.
			// 컴파일시에 정적 바인딩된 메소드를 실행할 당시의 객체 타입을 기준으로 바인딩 되는 것을 동적 바인딩이라고 하고
			// 상속 관계로 이루어져 (다형성 적용) 메소드 오버라이딩이 되어 있으면
			// 정적 바인딩 된 메소드 코드보다 오버라이딩 된 메소드를 우선적으로 실행한다.
			
			System.out.println("반복문(for each)을 이용하여 출력");
			
			for(Parent p : arr) {
				if(p instanceof Child1) {   //해당 인덱스에 실제 Child1 타입을 참조하고 있으면 true
					((Child1)p).printChild1();  //자식1 형변환
				} else {
					((Child2)p).printChild2();  //자식2 형변환
				}
				arr[i].print();
			}
			
		}
		
	}
	
}
