package com.sy.chap04_stack.exercise;

public class IntStack {

	private int max;
	private int ptr;
	private int[] stk;
	
	//실행 시 예외 : 스택이 비어있음
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	
	//실행 시 예외 : 스택이 가득 참
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	
	//생성자 -> 본체용 배열을 생성하는 등 준비작업 수행
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];		   //스택 본체용 배열을 생성
		}catch (OutOfMemoryError e) {  //배열 본체 생성할 수 없음 -> max : 0
			max = 0;
		}
	}
	
	//스택에 x 를 푸시
	public int push(int x)  throws OverflowIntStackException {
		if(ptr >= max)  //스택이 가득 참 -> ==보다 프로그램 안정성 up
			throw new OverflowIntStackException();
		return stk[ptr++] = x;	//return문이 반환하는 것 -> stk[ptr]의 값
	}
	
	
	//스택에서 데이터를 팝
	public int pop() throws EmptyIntStackException {
		if(ptr <= 0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
