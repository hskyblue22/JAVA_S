package com.sy.chap04_stack.pratice;

public class Q3_Dual {
	
	private int max;
	private int ptr0;
	private int ptr1;
	private int[] stk;

	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {/*System.out.println("스택이 비었습니다.");*/}
	}
	
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	
	public Q3_Dual(int capacity) {
		ptr0 = 0;
		ptr1 = capacity-1;
		
		max = capacity;
		try {
			stk = new int[max];		  
		}catch (OutOfMemoryError e) {  
			max = 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
