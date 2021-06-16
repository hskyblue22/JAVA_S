package com.hw6.run;

import com.hw6.controller.DateCalculator;

public class ShowDate {

	public static void main(String[] args) {
		
		DateCalculator totalDay = new DateCalculator();
		// Calendar클래스를 이용한다.
		// 평년인지 윤년인지 isLeapYear()를 통해서 출력한다.
		// 평년과 윤년을 고려해 leapDate()로 총 날짜 수를 출력한다.
		
		boolean leapY = totalDay.isLeapYear(2021);
		if (leapY) {
			System.out.println("올해는 윤년입니다.");
		} else {
			System.out.println("올해는 평년입니다.");
		}
		
		System.out.println("총 날짜 수 : " + totalDay.leapDate());

	}

}
