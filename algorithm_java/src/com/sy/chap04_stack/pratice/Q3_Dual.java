package com.sy.chap04_stack.pratice;

public class Q3_Dual {
	
	private int max;
	private int ptr_1;  //0
	private int ptr_2;  //1
	private int[] stk;

	public static class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
		public EmptyIntStackException(String message) {super(message);}
	}
	
	public static class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	
	public Q3_Dual(int capacity) {
		ptr_1 = 0;
		ptr_2 = capacity-1;
		
		max = capacity;
		try {
			stk = new int[max];		  
		}catch (OutOfMemoryError e) {  
			max = 0;
		}
	}
	
	public int push(int choice, int push) throws OverflowIntStackException{
		if(ptr_1>=max || ptr_2 < 0)
			throw new OverflowIntStackException();
		if(choice == 0)
			return stk[ptr_1++] = push;
		else
			return stk[ptr_2--] = push;
	}
	
	public int pop(int choice) throws EmptyIntStackException{
		if(ptr_1 >= max || ptr_2<=0){
			throw new EmptyIntStackException("스택이 비었습니다.");
		}else {
			if(choice == 0) {
				return stk[--ptr_1];
			}else {
				return stk[++ptr_2];
			}
		}
		
	}
	
	public int peek(int choice) throws EmptyIntStackException{
		if(ptr_1 >= max || ptr_2<=0){
			throw new EmptyIntStackException("스택이 비었습니다.");
		}else {
			if(choice == 0) {
				return stk[ptr_1-1];
			}else {
				return stk[ptr_2+1];
			}
		}
	}
	
	public int indexOf(int choice, int x) { 
		
		switch(choice) {
		case 0 : 
			for(int i= ptr_1-1; i>=0; i--) {  
				if(stk[i] == x)
					return i;
			}
			break;
		case 1 : 
			for(int i= ptr_2+1; i<max; i++) {  
				if(stk[i] == x)
					return i;
			}
			break;
		}

		return -1;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size(int choice) { //ptr 데이터의 수
		int count = 0;
		switch(choice) {
		case 0:
			count = ptr_1;
			break;
		case 1: 
			count = max -ptr_2 -1;
			break;
		default:
			count = -1;
			break;
		}
		return count;
	}
	
	public boolean isEmpty(int choice) {
		switch(choice) {
		case 0:
			return (ptr_1 <=0);
		case 1:
			return (ptr_2 >= max-1);
		}
		return false;
	}
	
	public boolean isFull() {
		return ptr_1 + ptr_2 >= max-1 ? true : false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
