package com.kh.part03_control.model.thread;

import java.util.Scanner;

public class InterruptSample {

	public void sleepInterrupt() {
		Thread5 th5= new Thread5();        //Runnable객체 생성
		Thread thread5 = new Thread(th5);  //Thread객체 생성
		thread5.start();                   //start() -> 스레드 실행
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아무값이나 입력하세요 : ");
		
		String input = sc.nextLine();
		System.out.println("입력된 값 : "+input);
		thread5.interrupt();  //static메소드
		//interrupt() : sleep()에 의해 일시정지 상태인 스레드를 실행대기 상태로 만든다.
		//인터럽트를 호출하게 되면 스레드에 인터럽트가 예약되고, 아무때나 중단되는 것이 아닌
		//sleep()이나 join()등의 메소드를 만나면 즉시 interruptedException을 발생시켜
		//일시정지를 벗어나게 된다.
		
	}
	
	
}
