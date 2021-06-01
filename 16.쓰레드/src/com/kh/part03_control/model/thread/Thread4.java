package com.kh.part03_control.model.thread;

public class Thread4 implements Runnable {
	//sleep() : 지정한 시간만큼 스레드를 실행정지상태로 만든다
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);  //1000->1초
				
				System.out.println(i+ " 초");  //1초씩 간격을 두고 출력된다.
			
			} catch (InterruptedException e) {  //프로그램이 무한지연될 수 있기 때문에 발생하는 예외, 
												//Interrupt호출로 Thread가 중단되었을 때 발생하는 예외
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		}
	}
	
}
