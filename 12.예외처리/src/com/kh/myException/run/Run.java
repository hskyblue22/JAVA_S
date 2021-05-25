package com.kh.myException.run;

import java.util.Scanner;

import com.kh.myException.exception.MyException;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 하나 입력하세요");
		
		int num =sc.nextInt();
		
		try {
			checkNum(num);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //예외처리 (던지지 않고)
	}
	
	//checkNum
	//10보다 작은 수일 경우 : MyException("10보다 작은 수입니다")발생시킴
	//아닌 경우 sysout : 10보다 크거나 같은 수구나!
	
	private static void checkNum(int num) throws MyException {
		// TODO Auto-generated method stub
		if (num < 10) {
			throw new MyException(num + "은 10보다 작은 수입니다.");
		} else {
			System.out.println(num + "은 10보다 크거나 같은 수구나!");
		}
		
	}

	
}
