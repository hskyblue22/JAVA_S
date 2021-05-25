package com.hw1.controller;

import com.hw1.model.vo.Guests;
import com.hw1.model.vo.RollerCoaster;

public class RideController {
	
	Guests[] gs = new Guests[4];	
	Guests[] onBoard = new Guests[RollerCoaster.PERMITNUMBER];
	
	public RideController() {
		// TODO Auto-generated constructor stub
	}
	
	public void cutGuests() {
		// 4명의 탑승 대기자를 생성자를 통한 Guest객체 배열 초기화 (Guests[] gs)
		// RollerCoaster 클래스의 허용인원 상수값 크기의 또 다른 객체 배열 생성
		// (Guests[] onBoard)

		gs[0] = new Guests("홍길동",17,'M',120.2);
		gs[1] = new Guests("유관순",20,'F',102.3);
		gs[2] = new Guests("김유신",23,'M',110.4);
		gs[3] = new Guests("김흥부",21,'M',112.5);
		
			
		int index =0;
		try {
			
			for(int i=0; i<gs.length; i++) {
				if(gs[i].getHeigth() > RollerCoaster.CUTHEIGHT) {
					onBoard[index++] = gs[i];
				}
			}
		// for문과 if문을 통해 RollerCoaster 클래스의 허용키 상수값 크기
		// 이상인 사람을 Guests객체 배열 onBoard에 담는다.
		}catch(ArrayIndexOutOfBoundsException e) {
			char pIndex =e.getMessage().charAt(e.getMessage().length()-1);
			System.out.println("문제가 발생한 해당 배열의 인덱스 번호 : " + pIndex);
//		// 문제가 발생한 해당 배열의 인덱스 번호가 몇번에서 발생하는지
//		// Throwable클래스의 getMessage()메소드를 통해 출력
		}finally {
			System.out.println("인원이 가득 찼습니다. 다음 차례를 기다리세요");
			System.out.println("이번 차례 탑승 명단 ");
			
			for(int i=0; i < onBoard.length; i++) {
				System.out.println("이름 : "+onBoard[i].getName() + ",키 : "+onBoard[i].getHeigth());
			}
			
			System.out.println("탑승자 요금 : "+RollerCoaster.PRICE*2);
//		// "인원이 가득 찼습니다. 다음 차례를 기다리세요"
//		// "이번 차례 탑승 명단"
//		// 탑승자 각각의 이름, 키를 출력하고 두 탑승자의 요금합계를 출력 하시오
		}
	
	}
	
	
			
			
			
}
