package com.kh.part02.personMVC.controller;

import com.kh.part02.personMVC.model.vo.Person;

public class PersonController {

	private Person[] people = new Person[3]; //3명의 회원정보를 관리하기 위한 객체배열
	private int count = 0; //현재 추가된 사람수를 나타내는 변수
	
	
	//전달받은 회원의 이름, 나이, 재산을 가지고 Person객체를 생성 후 해당배열에 초기화시켜주는 메소드
	public boolean insertPerson(String name, int age, int wealth) {
		
		if(count < people.length) { //추가 가능
			people[count++] = new Person(name, age, wealth);
			return true;
		}else { //추가안됨
			return false;
		}
	}

	//현재 회원이 몇명 존재하는지 반환을 해주는 메소드
	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}

	//현재 회원정보가 담겨있는 배열을 반환해주는 메소드
	public Person[] getPeople() {
		return people;
	}

	//전달받은 검색어로 검색된 회원객체를 반환해주는 메소드(단, 검색된 회원이 없는경우 null을 반환)
	public Person searchPerson(String search) {
		for(int i=0; i<count; i++) {
			if(people[i].getName().equals(search)) {
				return people[i];
			}
		}		
		return null;
	}

	public String avgWealth() {
		int sum = 0;
		
		for(int i=0; i<count; i++) {
			sum += people[i].getWealth();
		}
		
		double avg = (double)sum/count;
		
		String avg1 = String.format("%.3f", avg);
		String avg2 = String.format("%.2f", avg);
		
		return String.valueOf(avg) + "%.3f :"+avg1 +"%.2f :"+avg2;
	}

}
