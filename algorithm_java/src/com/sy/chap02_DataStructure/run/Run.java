package com.sy.chap02_DataStructure.run;

import com.sy.chap02_DataStructure.practice.A_Array;
import com.sy.chap02_DataStructure.practice.B_Array;
import com.sy.chap02_DataStructure.practice.C_DayofYear;
import com.sy.chap02_DataStructure.practice.D_Clone;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new C_DayofYear().main();
	}
	
	public static void a_array() {
		A_Array arr = new A_Array();
		int[] a = {1,5,7,9,65};
		int[] b = {4,11,9,50};
		char[] d = new char[32];
//		arr.practice1();
//		arr.practice2();
//		System.out.println(arr.practice3(a));
//		arr.practice4(a, b);
//		arr.practice5(a, b);
//		arr.cardConvRev2();
		arr.practice7();
//		System.out.println(arr.practice6(59, 2, d));
//		System.out.println(Arrays.toString(d));
//		arr.primeNumber3();
	}

	public static void b_array(){
//		B_Array.primeNumber2();
		B_Array.erat();
	}
	
	
}
