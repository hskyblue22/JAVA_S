package com.kh.part01_thread.run;

import com.kh.part01_thread.model.thread.Thread1;
import com.kh.part01_thread.model.thread.Thread2;

public class Run {
	// Runnable 인터페이스 vs Thread 클래스의 차이점
	// - Runnable 인터페이스는 스레드화 될 수 있는 메소드 run() 메소드를 가지고있다.
	// - Thread 클래스는 Runnable 인터페이스를 구현하고 있으며 스레드를 활성화 하는 start() 메소드를 가지고있다.
	// - Thread 클래스는 Thread 상태를 제어 할 수 있는 메소드를 가지고 있다.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//스레드를 만드는 조건
		//main메소드에서
		//1. Thread 객체 필요
		//2. run() 필요
		//3. start() 필요
		
		Thread1 th1 = new Thread1();
		
		Thread2 th2 = new Thread2();
		Thread th = new Thread(th2); //Runnable 타입이므로 생성한 객체를 스레드로 생성한다.
		// - Runnable : run()만 있음 / start는 없음 --> 객체는 매개체로 해서 thread써서 스레드 만들어줘야함
	
		//스레드 실행X run 만 호출한거임
		//th1.run();
		//th.run();
		
		
		th1.start();
		th.start();  //스레드실행 - 언제실행될지는 알 수 없다.즉 실행시킬때마다 바뀜
		
		System.out.println(" 메인메소드 ");
		
//		th1.start();  --> 에러발생: 한번 start해서 사용한 객체는 다시 사용할 수 없다.-> 새로객체생성해서 사용
	
	}

}
