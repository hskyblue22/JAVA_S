package com.sy.chap02_DataStructure.practice;

import java.util.Scanner;

public class C_DayofYear {
	//Q8 메서드 dayOfYear를 변수 i와 days없이 구현. while문 사용
	
	int[][] mdays= {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},  //평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}   //윤년
	};
	
	public void main(){
		System.out.println("그 해 경과일 수를 구합니다.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("년 : ");
		int y = sc.nextInt();
		System.out.println("월 : ");
		int m = sc.nextInt();
		System.out.println("일 : ");
		int d = sc.nextInt();
		
		System.out.println("그해 " + dayOfyear(y,m,d) + "일째입니다.");
		System.out.println("그해 남은 일 수는 "+leftDayofYear(y, m, d)+"일입니다.");
	}
	
	public int isLeap(int year) {
		return (year%4==0 & year%100!=0 || year % 400 ==0)? 1: 0;
	}
	
	public int dayOfyear(int y, int m, int d) {
		//m=4인경우 m=1,2,3월 더해야 하므로 
		//-> int[평년/윤년][0]+int[평년/윤년][1]+int[평년/윤년][2] 더하면 된다.
		
		while(m-2 >= 0) {
			d += mdays[isLeap(y)][m-2];
			m--;
		}
		return d;
	}
	
	public int leftDayofYear(int y, int m, int d) {

		int left_day = mdays[isLeap(y)][m-1]-d;
		
		while(m<12) {
			left_day += mdays[isLeap(y)][m++];
		}
		
		return left_day;
	}
}
