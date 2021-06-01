package com.kh.part01_thread.model.thread;

//스레드 생성
//1. Thread 상속받기
public class Thread1 extends Thread {

	@Override
	public void run() {  //새로운 스레드의 메인메소드로 생각하자
		// TODO Auto-generated method stub
		for(int i=1; i<10; i++) {
			System.out.println("스레드1 ["+ i +"]");
		}
	}

	
}
