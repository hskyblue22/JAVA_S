package com.kh.chap02_abstractAndInterface.model.vo;

public abstract class Sports {  //abstract 명시되어야 함

	private int people;
	
	public Sports() {
		// TODO Auto-generated constructor stub
	}

	public Sports(int people) {
		super();
		this.people = people;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Sports [People = " + people +"]";
	}
	
	public abstract void rule();
	//추상메소드(미완성된 메소드로 내용이 구현되지 않은 메소드)
	//--> {} 몸통부가 아직 구현되지 않은 상태
	
	//--> 미완성된 추상 메소드가 있다는 것은 이 클래스 또한 미완성 클래스라는 것 
	//--> 상단에 추상클래스라고 명시를 해줘야 함 (public abstract class Sports)
	
	
	
}
