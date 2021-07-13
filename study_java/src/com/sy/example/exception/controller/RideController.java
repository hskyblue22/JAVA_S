package com.sy.example.exception.controller;

import com.sy.example.exception.model.vo.Guests;
import com.sy.example.exception.model.vo.RollerCoaster;

public class RideController {
	
	protected Guests[] gs = new Guests[4];
	protected Guests[] onboard = new Guests[2];
	
	public RideController() {
		// TODO Auto-generated constructor stub
	}
	
	public void cutGuests() {
		gs[0] = new Guests("홍길동",17,'M',120.2);
		gs[1] = new Guests("유관순",20,'F',102.3);
		gs[2] = new Guests("김유신",23,'M',110.4);
		gs[3] = new Guests("김흥부",21,'M',112.5);
		
		int count = 0;
		
		try {
			for(int i=0; i<gs.length; i++) {
				if(gs[i].getHeight() > RollerCoaster.PERMITNUMBER) {
					onboard[count++] = gs[i]; 
				}
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.print("문제가 발생한 해당 배열의 인덱스 번호 : ");
			System.out.println(e.getMessage());
//			System.out.println(e.toString());
//			e.printStackTrace();
		}finally {
			
			System.out.println("인원이 가득 찼습니다. 다음 차례를 기다리세요");
			System.out.println("이번 차례 탑승명단");
			
			for(int i=0; i<onboard.length; i++) {
				System.out.println(onboard[i].toString());
			}
			int charge = RollerCoaster.PRICE*onboard.length;
			System.out.println("탑승자 요금 : "+charge);
		}
		
	}
}
