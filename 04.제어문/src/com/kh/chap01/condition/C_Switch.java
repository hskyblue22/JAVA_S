package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {
	/*
	 * * switch문
	 * 
	 *  switch(동등비교할대상자){ // 여기서 동등비교할 대상자는 반드시 int값이나, char, String 만가능!!
	 *  case 값1 : 실행코드1; break;
	 *  case 값2 : 실행코드2; break;
	 *  case 값3 : 실행코드3; break;
	 *  ...
	 *  default : 위의 조건에 다 만족하지 않을 경우 실행할 코드; 
	 *  }
	 *  
	 *  비교할대상자 == 값1 인 경우 실행코드1을 실행하고 break를 만나 빠져나간다. 
	 *  if-else if문과 달리 실행코드 실행하고 자동으로 빠져나가지 못함.. break를 걸어줘야됨
	 */
	
	public void method1() {
		//1~3 사이의 정수를 입력받아
		//1의 경우 "빨간색입니다"
		//2인 경우 "파란색입니다"
		//3인 경우 "초록색입니다"
		//잘못입력했을 경우 "잘못 입력하였습니다"
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		/*
		if (num == 1) {
			System.out.println("빨간색입니다");
		}else if (num == 2) {
			System.out.println("파란색입니다");
		}else if (num == 3) {
			System.out.println("초록색입니다");
		}else {
			System.out.println("잘못 입력하였습니다");
		}
		*/
	
		switch (num) {  //switch 소문자로 시작
		case 1:
			System.out.println("빨간색입니다");
			break;
		case 2:
			System.out.println("파란색입니다");
			break;
		case 3:
			System.out.println("초록색입니다");
			break;
		default:
			System.out.println("잘못 입력하였습니다");
			return;
		}
	}
	
	public void method2() {
		
		//키보드로 과일 이름을 입력받아서 
		//fruit + " 가격은" + price +"입니다"
		
		Scanner sc = new Scanner(System.in);
		System.out.print("과일 이름을 입력하세요 : ");
		String fruit = sc.nextLine();
		
		int price = 0;   //가격 초기화
		
		switch (fruit) {
		
		case "딸기" :
			price = 1000;
			break;
		case "사과" :
			price = 2000;
			break;
		case "키위" :
			price = 3000;
			break;
		case "바나나" :
			price = 4000;
			break;
		default :
			System.out.println("잘못 입력하였습니다.");
			//break;
			return;   //메소드 종료
		}
		
		System.out.println(fruit + "의 가격은" + price +"입니다");
	}
	
	public void method3() {
		//1~12월까지 입력받아 해당하는 달의 마지막 날짜를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12월 까지중 하나를 입력하세요 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println("입력하신 월은 31일 까지입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("입력하신 월은 31일 까지입니다.");
			break;
		case 2:
			System.out.println("입력하신 월은 28일 혹은 28일까지입니다.");
			break;
		default:
			System.out.println("반드시 1~12월 중 하나를 입력해야 합니다");
			break;
			//return;
		}	
	}
}
