package com.hw5.controller;

import java.util.Scanner;

public class NumberOk {
//	사용자에게
//	숫자를 입력 받
//	고 입력 받은 숫자가 임의
//	의 난수와 비교 했을 때 작
//	은지 큰지 , 몇 번 만에 맞추
//	는지 맞추면 계속 할지 끝
//	낼지 묻는 메소드
	
	public NumberOk() {
		// TODO Auto-generated constructor stub
	}
	
	public void numGame() {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			int numRandom = (int)( Math.random()*100+1);
			
			int count = 1;
			
			while(true) {
				
				System.out.println("1부터 100 사이의 정수를 하나 입력하세요 : ");
				int num = sc.nextInt();
				sc.nextLine();
			
				if(numRandom > num) {
					System.out.printf("%d보다 큽니다. %d번째 실패!!\n", num, count++); 
					
				} else if(numRandom < num){
					System.out.printf("%d보다 작습니다. %d번째 실패!!\n", num, count++);
				} else {
					break;
				}
			}
			
			System.out.printf("%d번 만에 맞췄습니다!", count);
			
			while(true) {
				System.out.println("계속 하시겠습니까?(y/n) : ");
				String answer = sc.nextLine();
				
				if(answer.equalsIgnoreCase("y")) {
					System.out.println("새로운 게임을 시작합니다!!");
					break;
				} else if (answer.equalsIgnoreCase("n")) {
					System.out.println("게임을 종료합니다.");
					return;
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					continue; 
				} 
				
			}
		}
		
		
	}

	
}
