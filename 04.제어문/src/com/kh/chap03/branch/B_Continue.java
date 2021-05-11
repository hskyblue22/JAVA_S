package com.kh.chap03.branch;

public class B_Continue {
	//continue: 반복문 안에서만 사용가능하며 continue를 만나면 그 다음구문은 
	//실행하지 않고 가장 가까운 반복문(증감식)으로 올라가라는 의미
	
	public void method1() {
		//1부터 10까지 홀수를 출력
		
		for(int i =1; i <= 10; i++) {
			if(i % 2 == 0) {
				continue;
				//continue아래 문장은 수행될 수 없는 unreachable code이다.
			}
			System.out.print(i + " ");
		}
	}
	
	public void method2() {
		//1부터 100까지의 정수들의 합 출력
		//단 6의 배수는 제외하고 덧셈연산 계산
		
		int sum = 0;
		
		for(int i =1; i<=100; i++) {
			if(i % 6 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("sum : "+ sum);
	}
	
	public void method3() {
		//2~9단까지의 구구단 출력 중
		//4의 배수단을 빼고 출력하시오
		
		for(int i=2; i<=9; i++) {
			if(i % 4 == 0) {
				continue;
			}
			System.out.println("===== " + i + "단 =====");
			for(int j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}
	}
	
	public void method4() {
		//2~9단 까지의 구구단을 출력하는데 단*수에서 수가 짝수인 것을 제외하고 출력하세요
		
		for(int i =2; i<=9; i++) {
			System.out.println("===== " + i + "단 =====");
			for(int j =2; j<=9; j++) {
				if(j % 2 == 0) {
					continue;
				}
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
	}
	
	
	
	
	
	
	
	
	
}
