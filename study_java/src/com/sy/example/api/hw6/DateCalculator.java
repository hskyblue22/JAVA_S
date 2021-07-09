package com.sy.example.api.hw6;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateCalculator {

	public DateCalculator() {
		// TODO Auto-generated constructor stub
	}
	
	public long leapDate() {
//		1년 1 월 1 일부터 오늘까지의
//		총 날 수를 계산
//		1년부터 현재 연도까지 각 연
//		도가 윤년이면 총 날수에 366
//		일을 평년이면 365 일을 더함
//		해당
//		현재 연도가 윤년이면 2
//		월을 29 일로 평년이면 28 일로
//		더함
//		월의
//		날짜 수를 더함
//		(31
//		일 : 1, 3, 5, 7, 8, 10, 12 월
//		30
//		일 4, 6, 9, 11 월
		
		Calendar now = Calendar.getInstance();  //현재날짜, 시간
		
		int year = now.get(GregorianCalendar.YEAR);  //년도
		int month = now.get(GregorianCalendar.MONTH)+1; //월
		int day = now.get(GregorianCalendar.DATE);  //몇 일
		long days = 0;
		
		//1년 ~ 작년(2020)까지 총 날짜 수
		for(int i=1; i<2021; i++) {
			if (isLeapYear(i)) {
				days += 366;
			}else {
				days += 365;
			}
		}

		//(2021)올해 01.01~현재까지 날짜수
		int m = 1;  //1월부터 시작
		while(m<month) {  //month : 7
			if(m == month) {
				
			}else {
				switch(m) { //m : 1,2,3,4,5,6
				case 1: 
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12: days += 31; break;
				case 4: 
				case 6:
				case 9:
				case 11: days += 30; break;
				case 2: 
					if(isLeapYear(year)) {
						days += 29;
					}else {
						days += 28;
					} break;
				}
			}
			m++;
		}
		
		return days+day;  //07.09 -> 9더하기
	}
	
	public boolean isLeapYear(int year) {
//		연도가
//		윤년이면 true, 평년이
//		면 false 리턴
//		(
//		윤년 연도가 4 의 배수이면서
//		100 의 배수가 아니거나 400 의
//		배수가 되는 해
		
		if((year%4==0 && year%100!=0) || year%400 == 0) {
			return true;
		}return false;
		
	}
	
}
