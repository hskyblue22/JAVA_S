package com.sy.example.object.nonstatic2.run;

import com.sy.example.object.nonstatic2.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonStaticSample ns = new NonStaticSample();
		int[] iArr = ns.intArrayAllocation(5);
		
		System.out.print("크기가 "+iArr.length +"인 배열의 랜덤값 : ");
		for(int i=0; i<iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
		System.out.println();
		
		System.out.print("내림차순 출력 : ");
		ns.sortDescending(iArr);
		System.out.print("오름차순 출력 : ");
		ns.sortAscending(iArr);
		
		int num = ns.countChar("apple", 'p');
		System.out.println(num);
		
		System.out.println(ns.totalValue(13, 7));
		
		
		System.out.println(ns.pCharAt("programming", 3));
		
		
		System.out.println(ns.pConcat("JAVA", "programming"));
	}

}
