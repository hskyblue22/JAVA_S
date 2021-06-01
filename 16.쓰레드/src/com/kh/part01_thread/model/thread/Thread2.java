package com.kh.part01_thread.model.thread;

//2. Runnable 인터페이스 구현하기
public class Thread2 implements Runnable {

	@Override
	public void run() {  //꼭 구현해 줘야 한다.
		// TODO Auto-generated method stub
		
		for(int i=1; i<10; i++) {
			System.out.println("스레드2 ["+ i +"]#############");
		}
	}

}
