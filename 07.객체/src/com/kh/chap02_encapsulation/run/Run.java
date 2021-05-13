package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;

public class Run {

	/*
	 * 7. 캡슐화 과정을 통해서 완벽한 클래스의 형태를 갖춤
	 * 
	 * 캡슐화 : 추상화를 통해서 정의된 속성들과 기능들을 하나로 묶어서 관리하는 기법중 하나로
	 * 		 클래스의 가장 중요한 목적인 "데이터 접근 제한"을 원칙으로 하여 외부로부터 "데이터의 직접 접근을 막고"
	 * 		 대신에 간접적으로 처리 (값을 담거나, 조회하거나)하는 메소드들을 클래스 내부에 작성하여 관리하는 방법
	 * 
	 * 1) 정보은닉 : private
	 *  		  추상화를 통해 선정된 속성들을 외부로부터 직접 접근을 막기위해 public 대신에 private 접근 제한자를 사용
	 *  
	 * ex> 학생들이 자기 성적을 조회한다고 해서 성적을 바꾸면 될까?---> 절대안됨
	 *	    내가 다른 학생들 성적이 궁금하다고 해서 직접 그 학생의 성적을 조회 할 수 있을까?---> 안됨
	 *
	 * 따라서 보안처리를 위해 private 접근 제한자를 붙여야 한다.
	 * 
	 * 2) setter/getter 메소드
	 * 
	 * private을 하는 순간 그 멤버 변수에 더 이상 접근 불가
	 * 따라서 간접적으로 접근해서 값을 담거나 변경, 값을 가져 올 수 있는 메소드가 setter/getter 이다.
	 * 
	 * ex> 선생님들은 학생들의 성적을 기록하고 조회 할 수 있는 권한이 있다.
	 * --> 간접적으로 접근 할 수 있는 메소드를 통해서 값을 기록(대입)하고 조회 해오는 메소드를 추가하면 된다.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student u = new Student();
		
		u.setName("유야호");
		u.setAge(20);
		u.setHeight(175.02);
		u.setKor(80);
		u.setMath(50);
		
		//System.out.println(u.name + "님의 나이는 "+u.age+"이고, 국어점수는"+u.kor+"이고, 수학점수는 "+u.math+"이다.");
	//직접접근 불가
		
		String name = u.getName();
		System.out.println(u.getName() + "님의 나이는 " + u.getAge());
	
		String ifo = u.information();
		System.out.println(ifo);
		
	}

}
