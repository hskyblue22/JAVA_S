package com.sy.chap02_DataStructure.practice;

import java.util.Scanner;

//Q11. 서기 년월일을 필드로 갖는 클래스
//생성자와 메서드 정의
class YMD {  
	//인스턴스 변수: 객체가 생성될때 생성되며 객체가 삭제될 때 삭제
	//heap메모리에 저장, 각 객체의 정보를 저장하는 멤버변수
	int y;  //년
	int m;  //월(1~12)
	int d;  //일(1~31)
	
	public YMD() {
		
	}
	
	YMD(int y, int m, int d) {
		super();
		this.y = y;
		this.m = m;
		this.d = d;
	}
	
	int[][] mdays= {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},  //평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}   //윤년
	};
	
	public int isLeap(int year) {
		return (year%4==0 & year%100!=0 || year % 400 ==0)? 1: 0;
	}

	YMD after(int n) {
		YMD ymd = new YMD(this.y, this.m, this.d);
		
		ymd.d = ymd.d+n;  //2021.01.15 + 20 ->35
		
		while(ymd.d> mdays[isLeap(ymd.y)][ymd.m-1]) { //해당 달의 마지막일보다 클경우 반복하며 줄여준다.
			ymd.d -= mdays[isLeap(ymd.y)][ymd.m-1];  //4
			ymd.m++; //02 

			if(ymd.m > 12) {
				ymd.y++;
				ymd.m = 1;
			}
		}
		return ymd;		
	}
	
	YMD before(int n) {
		YMD ymd = new YMD(this.y, this.m, this.d);
		
		ymd.d = ymd.d-n;  //2021.01.15 -20 ->-5
		
		while(ymd.d < 0) {
			ymd.m--;  //0
			
			if(ymd.m < 1) {
				ymd.y--;
				ymd.m = 12;
			}
			ymd.d += mdays[isLeap(ymd.y)][ymd.m-1];  //-5+31 ->26
		}
		return ymd;		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("******** 년,월,일 입력 ********");
		System.out.print("년 : ");
		int y = sc.nextInt();
		System.out.print("월 : ");
		int m = sc.nextInt();
		System.out.print("일 : ");
		int d = sc.nextInt();
		
		YMD days = new YMD(y,m,d);   //days 객체 안에 필드 y,m,d 저장
		
		System.out.println("몇 일 뒤의 날짜를 반환할까요? ");
		YMD daysAfter = days.after(sc.nextInt());
		System.out.println(daysAfter.y + ". "+daysAfter.m + ". "+daysAfter.d +".");
		
		System.out.println("몇 일 앞의 날짜를 반환할까요? ");
		YMD daysBefore = days.before(sc.nextInt());
		System.out.println(daysBefore.y + ". "+daysBefore.m + ". "+daysBefore.d +".");
		
	}

}
