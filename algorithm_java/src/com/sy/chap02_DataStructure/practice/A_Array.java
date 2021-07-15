package com.sy.chap02_DataStructure.practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class A_Array {
	
	Scanner sc = new Scanner(System.in);
	
	public int maxOf(int[] a) {
		int max = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		return max;
	}
	
	//Q1. 난수 생성
	public void practice1(){
		Random rand = new Random();  //난수 생성을 위함 -> 이렇게 두면 미리 컴퓨터가 계산해둔 결과를 가지고 난수를 생성 -> seed를 매번 다르게 전달해야함
		
		int leng = 1 + rand.nextInt(11);
		int[] height = new int[leng];
		
		System.out.println("키 값은 아래와 같습니다.");
		for(int i=0; i<height.length; i++) {
			height[i] = 100 + rand.nextInt(100);
			System.out.println("height["+i+"] : "+height[i]);
		}
		System.out.println("최댓값은 "+maxOf(height)+"입니다.");
	}
	
	//Q2. 배열요소 역순 정렬
	public void practice2() {
		int[] arr = {5,10,73,2,-5,42};

		for(int i=0; i<arr.length/2; i++) {
			System.out.println(Arrays.toString(arr));
			int index1 = i;
			int index2 = arr.length-i-1;
			System.out.printf("a[%d]과(와) a[%d]를 교환합니다.\n",index1, index2);
			swap(arr,index1, index2);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("역순 정렬을 마쳤습니다.");
	}
	
	public void swap(int[] a, int i1, int i2) {
		int temp = a[i1];
		a[i1] = a[i2];
		a[i2] = temp;		
	}
	
	//Q3. 배열 모든요소 합계 반환
	public int practice3(int[] a) {
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	//Q4. 배열 b의 모든요소를 배열 a에 복사
	public void practice4(int[] a, int[] b) {
		if(a.length >= b.length) {
			for(int i=0; i<b.length; i++) {
				a[i] = b[i];
			}
			System.out.println("뒤 배열의 배열요소 -> 앞의 배열로 복사 완료");
			System.out.println(Arrays.toString(a));
		}else {
			System.out.println("복사 불가능");
		}
	}
	
	//Q5. 배열 b의 모든요소 -> 배열 a에 역순으로 복사
	public void practice5(int[] a, int[] b) {
		if(a.length >= b.length) {
			for(int i=0; i<b.length; i++){
				a[i] = b[b.length-1-i];
			}
			System.out.println("뒤 배열의 배열요소 -> 앞의 배열로 복사 완료");
			System.out.println(Arrays.toString(a));
		}else {
			System.out.println("복사 불가능");
		}
	}
	
	//실습2-8
	public int cardConvRev(int x, int r, char[] d){
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x%r);
			x /= r;
		}while(x != 0);
		return digits;
	}
	
	public void cardConvRev2() {
		int num;
		int cd;
		int retry;
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.println("변환하는 음이 아닌 정수 : ");
				num = sc.nextInt();
			}while(num<0);
			
			do {
				System.out.println("어떤 진수로 변환할까요?");
				cd = sc.nextInt();
			}while(cd < 2|| cd > 36);
			
			char[] cno = new char[32];
			
			int digits = cardConvRev(num, cd, cno);
			
			System.out.print(cd+"진수로는 ");
			
			for(int i = digits-1; i>=0; i--) {
				System.out.print(cno[i]);
			}
			System.out.println("입니다.");
			
			System.out.println("한 번 더 할까요?(1.예/0.아니오)");
			retry =sc.nextInt();
			
		}while(retry == 1);
	}

	// Q6 배열 앞쪽에 윗자리 넣어두는 메소드
	public int practice6(int x, int r, char[] d) {
		int digits = 0;
		int rest;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUWXYZ";

		do {
			rest = x % r;
			x /= r;

//			for (int i = digits - 1; i >= 0; i--) { // 배열 앞에 윗자리 넣기
//				d[i + 1] = d[i];
//			}
//			d[0] = dchar.charAt(rest);
//			digits++;
			
			d[digits++] = dchar.charAt(rest);

		} while (x != 0); // 몫이 0이 아닐때까지 반복
		
		for(int i=0; i<digits/2; i++) {
			char temp = d[i];
			d[i] = d[digits-1-i];
			d[digits-1-i] = temp;
		}
		return digits;
	}

	// Q7.
	public void practice7() {
		System.out.println("10진수를 기수 변환합니다.");
		char[] d = new char[32]; // 변환한 값 담을 배열
		int num;
		do {
			System.out.print("변환하는 음이 아닌 정수 : ");
			num = sc.nextInt();
		}while(num<0);
		
		int cd;
		do {
			System.out.println("어떤 진수로 변환할까요?(2-36)");
			cd = sc.nextInt();
		}while(cd<2 || cd>36);
		
		int leng = practice6(num, cd, d);
		
		int digits = 0;
		int rest;

		while(true) {
			if(digits==0) {
				System.out.println(cd +"|    "+num);
			} else {
				rest = num % cd;
				num /= cd;
				if(num != 0) {
					System.out.println(cd + "|    " + num + " ... " + rest);
				}else if(num == 0) {
					System.out.println("      0" +" ... "+rest);
					break;
				}	
			}
			System.out.println("+--------");
			digits++;
		}
		System.out.print(cd + "진수로 ");
		for(int i=0; i<leng; i++) {
			System.out.print(d[i]);
		}
		System.out.println("입니다.");
	}
	
	//실습 2-11 제곱근 이하의 소수 이용하여 1000이하 소수판별
	public void primeNumber3() {
		int ptr = 0;
		int[] pArr = new int[500];
		
		pArr[ptr++] = 2;  //ptr=1 pArr[0] = 2
		pArr[ptr++] = 3;
	
		for(int n=5; n<=1000; n+=2) {
			
			boolean check = false;

			for(int k=1; pArr[k]*pArr[k]<=n ; k++) {
				if(n % pArr[k] == 0) {
					check = true;
					break;
				}
			}
			if(!check) {
				pArr[ptr++] = n;
			}
		}
		
		for(int j=0; j<ptr; j++) {
			System.out.println("pArr[j]"+pArr[j]);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
