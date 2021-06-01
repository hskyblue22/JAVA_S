package com.kh.part03_control.run;

import com.kh.part03_control.model.thread.InterruptSample;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Thread4 th4 = new Thread4();
//		Thread th = new Thread(th4);
//		
//		th.start();
		
		
		InterruptSample is = new InterruptSample();
		is.sleepInterrupt();
	}

}
