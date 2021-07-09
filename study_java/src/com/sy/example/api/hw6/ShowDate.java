package com.sy.example.api.hw6;

import java.util.Scanner;

public class ShowDate {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		// Calendar클래스를 이용한다.
		// 평년인지 윤년인지 isLeapYear()를 통해서 출력한다.
		// 평년과 윤년을 고려해 leapDate()로 총 날짜 수를 출력한다.
		
		DateCalculator totalDay = new DateCalculator();
		
		System.out.println("년도를 입력하세요 : ");
		int year = sc.nextInt();
		
		Boolean isleap = totalDay.isLeapYear(year);
		
		if(isleap) {
			System.out.println(year + "년은 윤년입니다.");
		}else {
			System.out.println(year + "년은 평년입니다.");
		}
		
		long days = totalDay.leapDate();
		System.out.println("총 날짜 수 : "+days);
	}

}
