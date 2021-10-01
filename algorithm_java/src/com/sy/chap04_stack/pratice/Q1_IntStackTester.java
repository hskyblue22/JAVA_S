package com.sy.chap04_stack.pratice;

import java.util.Scanner;

import com.sy.chap04_stack.exercise.IntStack;

public class Q1_IntStackTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		IntStack stack = new IntStack(5);
		
		while(true){
			System.out.println("현재 데이터 수 : " + stack.size() + " / " +stack.capacity());
			System.out.println("1. 푸시");
			System.out.println("2. 팝");
			System.out.println("3. 피크");
			System.out.println("4. 덤프");
			System.out.println("5. 값 검색");
			System.out.println("6. 스택 비우기");
			System.out.println("7. 스택 비었는지 확인");
			System.out.println("8. 스택 가득찼는지 확인");
			System.out.println("0. 종료");
			
			System.out.println("메뉴번호 입력 : ");
			int menu = sc.nextInt();
			if(menu == 0) break;
			
			int x;
			switch(menu) {
			case 1: //푸쉬
				System.out.print("데이터 입력：");
				x = sc.nextInt();
				try {
					stack.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
			case 2: //팝
				int pop = stack.pop();
				System.out.println("pop한 값은 " + pop +"입니다.");
				break;
			case 3: //peek
				int last = stack.peek();
				System.out.println("스택의 꼭대기에 있는 값은 " + last + "입니다.");
				break;
			case 4: //dump
				stack.dump();
				break;
			case 5: //값 검색
				System.out.println("찾을 값 : ");
				x = sc.nextInt();
				int index = stack.indexOf(x);
				if(index < 0) {
					System.out.println("찾는 값이 없습니다.");
				}else {
					System.out.println("찾는 값 " + x + "은 " + (index+1) + "번째에 있습니다.");
				}
				break;
			case 6:  //스택 비우기
				stack.clear();
				System.out.println("stack을 비웠습니다.");
				break;
			case 7:  //스택 비었는지 확인
				System.out.println(stack.isEmpty() ? "stack이 비었습니다." : "stack에 값이 있습니다.");
				break;
			case 8:  //스택 가득찼는지 확인
				boolean isFull = stack.isFull();
				if(isFull) {
					System.out.println("stack이 가득 찼습니다.");
				}else {
					System.out.println("stack이 가득차지 않았습니다.");
				}
				break;
//			case 1:
//				System.out.print("데이터 입력：");
//				x = sc.nextInt();
//				try {
//					s.push(x);
//				} catch (IntStack.OverflowIntStackException e) {
//					System.out.println("스택이 가득 찼습니다.");
//				}
//				break;
//				
//			case 2:
//				try {
//					x = s.pop();
//					System.out.println("팝한 데이터는 " + x + "입니다.");
//				} catch (IntStack.EmptyIntStackException e) {
//					System.out.println("스택이 비었습니다.");
//				}
//				break;
//				
//			case 3:
//				try {
//					x = s.peek();
//					System.out.println("피크한 데이터는 " + x + "입니다.");
//				} catch (IntStack.EmptyIntStackException e) {
//					System.out.println("스택이 비었습니다.");
//				}
//				break;
//				
//			case 4: 
//				s.dump();
//				break;
//
//			case 5:
//				System.out.print("검색할 값 입력：");
//				x = sc.nextInt();
//				int n = s.indexOf(x);
//				if (n >= 0)
//					System.out.println(x +"는 " + (n+1) + "번째에 있습니다.");
//				else
//					System.out.println("데이터 없음");
//				break;
//
//			case 6: 
//				s.clear();
//				System.out.println("스택의 값을 비웠습니다.");
//				break;
//
//			case 7: 
//				if(s.isEmpty())
//					System.out.println("스택은 비어있습니다.");
//				else
//					System.out.println("스택은 비어있지 않습니다.");
//				break;	
//				
//			case 8: 
//				System.out.println("가득 " + (s.isFull() ? "찼습니다." : "차지 않았습니다."));
//				break;	
				
			}
		}

	}

}
