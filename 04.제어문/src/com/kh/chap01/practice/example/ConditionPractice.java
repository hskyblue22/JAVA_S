package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 번호를 입력하세요 : ");
		int select = sc.nextInt();
		
		//내가 처음 했던 방법
//		switch(select) {
//		case 1:
//			System.out.println("입력 메뉴입니다.");
//			break;
//		case 2:
//			System.out.println("수정 메뉴입니다.");
//			break;
//		case 3:
//			System.out.println("조회 메뉴입니다.");
//			break;
//		case 4:
//			System.out.println("삭제 메뉴입니다.");
//			break;
//		case 9:
//			System.out.println("종료 메뉴입니다.");
//			break;
//		default :
//			System.out.println("잘못 입력하였습니다.");
//			return;
//		}
		
		String str = "";
		
		//좀더 간단한 방법
		switch(select) {
		case 1: str = "입력"; break;
		case 2: str = "수정"; break;
		case 3: str = "조회"; break;
		case 4: str = "삭제"; break;
		case 9: str = "종료"; break;
		default: System.out.println("잘못 입력하셨습니다."); return;	
		}
		
		System.out.println(str + "메뉴입니다.");  //case 1,2,3,4,9 수행 후 출력
											   //default 수행 후 return되므로 이 문장은 출력 X
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int select = sc.nextInt();
		
		//내가 처음 했던 방법
//		if(select > 0 && select % 2 == 0) {
//			System.out.println("짝수다");
//		}else if(select > 0 && select % 2 == 1) {
//			System.out.println("홀수다");
//		}else {
//			System.out.println("양수만 입력해주세요.");
//		}
		
		//좀더 간단한 방법
		if(select>0) {
			if(select % 2 == 0) {
				System.out.println("짝수다.");
			}else {
				System.out.println("홀수다.");
			}
		}else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum /3;
		
		if(kor>=40 && math>=40 && eng>=40 && avg>=60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : "+sum);
			System.out.println("평균 : "+avg);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}	
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		String season = null; 
		
		switch(month) {
		case 1:
		case 2:
		case 12:
			season = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		default:
			season = "잘못입력된 달";
			break;
		}
		
		System.out.println(month + "월은 " + season + "입니다."); //프린트문 한번만 적기 가능
	}
	
	public void practice5() {
		
		String id = "user1";
		String pw = "1234";
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String user_id = sc.nextLine();	
		System.out.print("비밀번호 : ");
		String user_pw = sc.nextLine();
		
//		if(id.equals(user_id) && pw == user_pw) {
//			System.out.println("로그인 성공");
//		}else if(!id.equals(user_id) && pw == user_pw) {
//			System.out.println("아이디가 틀렸습니다.");
//		}else if(id.equals(user_id) && pw != user_pw) {
//			System.out.println("비밀번호가 틀렸습니다.");
//		}else {
//			System.out.println("모두 틀렸습니다.");
//		}	
		
		if(id.equals(user_id)) {
			if(pw.equals(user_pw)) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			if(pw.equals(user_pw)) {
				System.out.println("아이디가 틀렸습니다.");
			}else {
				System.out.println("모두 틀렸습니다.");
			}
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");

		switch(sc.nextLine()) { //이렇게 바로 입력해서 비교할 수도 있음!
		case "관리자":
			System.out.println("회원관리, 게시글 관리");
		case "회원" :
			System.out.println("게시글 작성, 댓글 작성");
		case "비회원" :
			System.out.println("게시글 조회");
			break;
		default :
			System.out.println("잘못 입력했습니다.");
			return;  //break;도 가능
		}
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height*height);
		System.out.println("BMI 지수 : "+ bmi);
		
		if (bmi < 18.5) {
			System.out.println("저체중");
		}else if (bmi < 23) {
			System.out.println("정상체중");
		}else if (bmi < 25) {
			System.out.println("과체중");
		}else if (bmi < 30) {
			System.out.println("비만");
		}else {
			System.out.println("고도비만");
		}
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("피연산자1 입력: ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자2 입력: ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%): ");
		char op = sc.nextLine().charAt(0);
		
		int result = 0;  //연산기호에 맞춰서 산술 연산한 결과를 담아줄 변수 셋팅!
		
		if(num1 > 0 && num2 >0) {
			switch(op) {
			case '+' : result = num1 + num2; break;
			//	System.out.printf("%d + %d = %d", num1, num2,num1+num2);  //하나하나 다 쓰지 말자!
			
			case '-' : result = num1 - num2; break;
			//	System.out.printf("%d - %d = %d", num1, num2,num1-num2);	
			
			case '*' : result = num1 * num2; break;
			case '/' : result = num1 / num2; break;
			case '%' : result = num1 % num2; break;
			default:
				System.out.println("연산자를 잘못 입력하셨습니다. 프로그램을 종료합니다.");	
			}
		}else {
			System.out.println("양수가 아닌 값을 입력하셨습니다. 프로그램을 종료합니다.");
		}
		
		//출력문은 여기에 단 한번만 기술함!!
		System.out.printf("%d %c %d = %d", num1, op, num2, result);
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("중간 고사 점수: ");
		int mid = sc.nextInt();
		System.out.print("기말 고사 점수: ");
		int fin = sc.nextInt();
		System.out.print("과제 점수: ");
		int work= sc.nextInt();
		System.out.print("출석 회수: ");
		int attend= sc.nextInt();
		
		double total = mid*0.2 + fin*0.3 + work*0.3 + attend;
//		
//		if (total >= 70 && attend >= 20*0.7) {
//			System.out.println("========결과========");
//			System.out.println("중간 고사 점수(20) : "+ mid*0.2);
//			System.out.println("기말 고사 점수(30) : "+ fin*0.3);
//			System.out.println("과제 점수    (30) : "+ work*0.3);
//			System.out.println("출석 점수    (20) : "+ attend*1.0);
//			System.out.println("총점 : " + total);
//			System.out.println("PASS");
//		}else if(total >= 70 ){
//			System.out.println("========결과========");
//			System.out.println("FAIL [출석 횟수 부족] (" + attend + "/20)");
//		}else if(total < 70 && attend >= 20*0.7) {
//			System.out.println("========결과========");
//			System.out.println("FAIL [점수 미달] (총점 " + total + ")");
//		}else {
//			System.out.println("========결과========");
//			System.out.println("FAIL [출석 횟수 부족] (" + attend + "/20)");
//			System.out.println("FAIL [점수 미달] (총점 " + total + ")");
//		}
		
		System.out.println("========결과========");
		
		if(total>=70 && attend >= 20*0.7) {
			System.out.println("========결과========");
			System.out.println("중간 고사 점수(20) : "+ mid*0.2);
			System.out.println("기말 고사 점수(30) : "+ fin*0.3);
			System.out.println("과제 점수    (30) : "+ work*0.3);
			System.out.println("출석 점수    (20) : "+ attend*1.0);
			System.out.println("총점 : " + total);
			System.out.println("PASS");
			
		}else {  //총점이 부족할 수도 있고, 출석 횟수가 부족할 수도 있고, 아니면 둘다 부족할 수도 있음
			if(attend < 20*0.7) {
				System.out.println("FAIL [출석 횟수 부족] (" + attend + "/20)");
			}
			
			// 위아래 조건문 각각 별개 --> 만일 둘다 부족할 경우 둘 다 실행될 것!
			
			if(total < 70) {
				System.out.println("FAIL [점수 미달] (총점 " + total + ")");
			}
		}
	}
	
	public void practice10() {
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass/Fail");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("선택 : ");
		int select = sc.nextInt();
		
		switch(select) {
		case 1:practice1();break;
		case 2:practice2();break;
		case 3:practice3();break;
		case 4:practice4();break;
		case 5:practice5();break;
		case 6:practice6();break;
		case 7:practice7();break;
		case 8:practice8();break;
		case 9:practice9();break;
		default: System.out.println("잘못 입력하셨습니다.");
		}
	}
}
