package com.kh.part02.personMVC.view;

import java.util.Scanner;

import com.kh.part02.personMVC.controller.PersonController;
import com.kh.part02.personMVC.model.vo.Person;

public class PersonMenu {

	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	
	public PersonMenu() {
		// TODO Auto-generated constructor stub
	}

	public void mainMenu() {
		while(true) {
			System.out.println("========메뉴========");
			System.out.println("1. 회원추가");
			System.out.println("2. 회원전체조회");
			System.out.println("3. 회원이름검색");
			System.out.println("4. 회원평균재산조회");
			System.out.println("9. 프로그램 종료");
		    System.out.println("메뉴선택 : ");
		    
		    int menu = sc.nextInt();
		    sc.hasNextLine();
		    
		    switch(menu) {
		    case 1:
		    	insertPerson();
		    	break;
		    case 2:
		    	printPerson();
		    	break;
		    case 3:
		    	searchPerson();
		    	break;
		    case 4:
		    	System.out.println("평균재산 : "+pc.avgWealth());
		    	break;
		    case 9 :
		    	System.out.println("프로그램을 종료합니다.");
		    	return;
		    default :
		    	break;
		    }
			
		}
	}

	private void searchPerson() {
		System.out.println("===사원정보검색===");
		
		System.out.println("검색할 이름 : ");
		sc.nextLine();
		String search = sc.nextLine();
		
		Person searchPerson = pc.searchPerson(search);
		
		if(searchPerson == null) {
			System.out.println("검색된 사람이 없습니다.");
		}else {
			System.out.println(searchPerson.information());
		}
		
	}


	private void printPerson() {
		
		System.out.println("===사원정보조회===");
		
		int cnt = pc.getCount();  //현재 회원수
		if(cnt == 0) {
			System.out.println("현재 추가된 회원이 없습니다.");
		} else {
			Person[] peo = pc.getPeople();  //import해줌
			
			for(int i=0; i<cnt; i++) {
				System.out.println(peo[i].information());
			}
			//for each문으로 출력해보기
//			for(Person per : peo) { //배열인덱스자료형   변수  :  배열이름
//				System.out.println(per.information());
//			}
		}
		
	}


	private void insertPerson() {
		
		System.out.println("===사원 정보 입력===");
		sc.nextLine();
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		System.out.println("재산 : ");
		int wealth = sc.nextInt();
		sc.nextLine();
		
		boolean a = pc.insertPerson(name,age,wealth);
		if(!a) { //false일 경우
			System.out.println("더이상 추가할 수 없습니다.");
		}
		
	}
	
	
	
	
}
