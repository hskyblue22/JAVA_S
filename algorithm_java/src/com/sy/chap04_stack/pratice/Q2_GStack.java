package com.sy.chap04_stack.pratice;

public class Q2_GStack<E> {
	
	private int max;
	private int ptr;
	private E[] stk;
	
	//실행 시 예외 : 스택이 비어있음
	public class EmptyGStackException extends RuntimeException{
		public EmptyGStackException() {/*System.out.println("스택이 비었습니다.");*/}
	}
	
	//실행 시 예외 : 스택이 가득 참
	public class OverflowGStackException extends RuntimeException{
		public OverflowGStackException() {}
	}
	
	//생성자 -> 본체용 배열을 생성하는 등 준비작업 수행
	public Q2_GStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			//stk = new E[max];		   		//cannot create generic array
			stk = (E[]) new Object[max];
		}catch (OutOfMemoryError e) {  		//배열 본체 생성할 수 없음 -> max : 0
			max = 0;
		}
	}
	
	//스택에 x 를 푸시
	public E push(E x)  throws OverflowGStackException {
		if(ptr >= max) 			 //스택이 가득 참 -> ==보다 프로그램 안정성 up
			throw new OverflowGStackException();
		return stk[ptr++] = x;	//return문이 반환하는 것 -> stk[ptr]의 값
	}
	
	
	//스택에서 데이터를 팝
	public E pop() throws EmptyGStackException {
		if(ptr <= 0)
			throw new EmptyGStackException();
		return stk[--ptr];
	}
	
	//스택에서 데이터를 피크(정상에 있는 데이터 들여다봄)
	public E peek() throws EmptyGStackException {
		if(ptr <= 0)
			throw new EmptyGStackException();
		return stk[ptr-1];
	}
	
	public int indexOf(E x) {
		for(int i= ptr-1; i>=0; i--) {
			if(stk[i].equals(x))  //객체 비교
				return i;
		}
		return -1;
	}
	
	//스택 비우기
	public void clear() {
		ptr = 0;
	}
	
	//스택의 용량을 반환
	public int capacity() {
		return max;
	}
	
	//스택에 쌓여있는 데이터 수 반환
	public int size() {
		return ptr;
	}
	
	//스택이 비어있는지
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	//스택이 가득 찼는지
	public boolean isFull() {
		return ptr >= max;
	}
	
	//스택 모든 데이터 바닥부터 출력
	public void dump() {
		if(ptr <= 0)
			System.out.println("스택이 비어있습니다.");
		else {
			for(int i=0; i<ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}


}
