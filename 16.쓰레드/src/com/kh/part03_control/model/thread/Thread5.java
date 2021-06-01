package com.kh.part03_control.model.thread;

public class Thread5 implements Runnable{

	@Override
	public void run() {
		
		int cnt = 0;
		while(cnt < 10) {
			
			try {
				Thread.sleep(1000);  //static메소드
				System.out.println((++cnt) + " 초");
			} catch (InterruptedException e) {
				
				System.out.println(" 예외발생했니?");
				System.out.println(cnt + " 초에 카운트종료");
				cnt = 10;
			}
			
		}
		
		System.out.println("=====카운트 종료=====");
		
	}

}
