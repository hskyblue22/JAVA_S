package com.hw6.controller;

import java.util.Calendar;

public class DateCalculator {

//	+
//	DateCalculator
//	+
//	leapDate () : long
//	+
//	isLeapYear year:int ) : boolean
	
	public DateCalculator() {
		// TODO Auto-generated constructor stub
	}
	
	public long leapDate() {
//		1년 1 월 1 일부터 오늘까지의 총 날 수를 계산
//		1년부터 현재 연도까지 각 연도가 윤년이면 총 날수에 366
//		일을 평년이면 365 일을 더함
//		해당현재 연도가 윤년이면 2월을 29 일로 평년이면 28 일로더함
//		월의
//		날짜 수를 더함
//		(31일 : 1, 3, 5, 7, 8, 10, 12 월
//		30일 4, 6, 9, 11 월
		
		Calendar today = Calendar.getInstance();
	
		int nowYear = today.get(today.YEAR);
		int nowMon = today.get(today.MONTH)+1;
		int nowDay = today.get(today.DATE);
		
		long daySum = 0;
		for(int i=1; i<nowYear; i++) {  //올해년도 전까지 일자 더하기
			boolean isLeap = isLeapYear(i);
			
			if(isLeap = true) {
				daySum += 366;
			} else {
				daySum += 355;
			}
		}
		
		for(int i=1; i< nowMon; i++) {  //올해년도 1월 1일~ 전 달말일까지
			switch(i) {
			case 1 :
			case 3 :	
			case 5 :	
			case 7 :	
			case 8 :	
			case 10 :
			case 12 :
				daySum += 31;
				break;
			case 4 :
			case 6 :	
			case 9 :	
			case 11 :	
				daySum += 30;
				break;	
			case 2:
				
				break;
			}
		}
		return daySum+nowDay;  //현재 달의 오늘일자(5월 21이면 +21)
	}
	
	public boolean isLeapYear(int year) {
//		연도가 윤년이면 true, 평년이면 false 리턴
//		(윤년 연도가 4 의 배수이면서 100 의 배수가 아니거나 400의배수가 되는 해
	
		if( (year%4==0 && year%100!=0) || (year % 4 ==0)) {
			return true;
		} 
		return false;
	}
	
}
