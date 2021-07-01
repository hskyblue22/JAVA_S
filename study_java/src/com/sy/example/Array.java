package com.sy.example;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	
	Scanner sc = new Scanner(System.in);

	public void method1() {
		//문제1
		//배열의 용도와 배열을 선언하는 방법에 대해서 작성 해보시오
		//아래 코드에서 배열의 생성이 틀린 것 을 찾아보시오
		//이 문제는 배열의 개념과 역할 그리고 배열을 사용하기 위해 선언하는 방법에 대해서 아는지 를 묻는 문제이다
		
		/*
		1. 같은 자료형의 값들을 모아서 객체로 만들어서 사용하기 위해 배열을 쓴다. 
		1-1. 배열을 선언하는 방법
			int[] arr1;
			int arr2[];
		1-2. 배열을 할당하는 방법
			: 배열에 들어갈 값이 몇개인지 배열할당으로 크기를 지정해준다.
		arr1 = new int[100];
		2. 배열의 생성이 틀린 것이 없다! 
		*/
	}
		
	public void method2() {
		//문제2
		//배열과 인덱스의 관계에 대해서 설명하고 배열의 초깃값은 어떻게 셋팅되는지 말해보시오
		//크기 10 의 정수형 배열을 생성 하고 인덱스로 배열 공간의 값을 출력 해보시오
		//이 문제는 자바의 배열 및 인덱스 사용법 그리고 배열 생성시 초깃값이 어떻게 정해지는지를 묻는 문제 이다
	
		/*
		1. 배열의 값은 인덱스(0이상의 양수)로 접근할 수 있다. 
		1-1. 배열의 값을 초기화하지 않으면 jvm이 지정한 자료형의 기본값으로 초기화한다.
			String[] : null / int[] : 0 / double[] : 0.0
		2. System.out.println( arr1[index] )
		int[] arr1 = new int[10];
		for(int i=0; i<arr1.length; i++) {
			System.out.prnitln(arr1[i]);
		}
		3. 초기화를 하지 않았으므로 각 인덱스의 값은 모두 0이다.
		*/
	}
	
	public void method3() {
		//문제3
		int[] arr3 = new int[6];
		arr3[0] = 3;
		
		for(int i=1; i<5; i++) {
			arr3[i] = 11*i;
		}
		
		arr3[5] = 44;
	}
	
	public void method4() {	
		//문제4
		int[] arr4 = new int[] {55,88,60,100,90};
		int[] arr4_1 = {55,88,60,100,90};
		
		//잘못된 코드
		int[] s;
//		s = {55,80,60};  --> new연산자를 통해 객체를 생성해주어야 element를 초기화할 수 있다.
	}
	
	public void method5() {	
		//문제5
		int[] arr4 = new int[] {55,88,60,100,90};
		for(int i=0; i<arr4.length; i++) {
			System.out.println(arr4[i]);
		}
	}	
	
	public void method6() {
		int[] arr1 = new int[5];
		double arr2[] = new double[5];
		
		System.out.println(arr1.hashCode());
		System.out.println(arr1.hashCode());
	}
	
	public void method7() {
		int[] arr4 = new int[] {55,88,60,100,90};
		System.out.println(Arrays.toString(arr4));
	}
	
	//다중배열 선언
	public void method8() {
		int[] a,b,c;     //ok
		int d[],e[],f[]; //ok
		int g[],h,i;     //nope
	}
	
	public void method9() {
		int[] origin = new int[] {55,88,60,100,90};
		int[] copy;
		
		copy = Arrays.copyOf(origin, 7);
		
		for(int i=0; i<copy.length; i++) {
			System.out.println(copy[i]);
		}
	}
	
	public void method10() {
		System.out.println("행의 갯수를 입력하고 [enter]치세요 = ");
		int row = sc.nextInt();
		System.out.println("열의 갯수를 입력하고 [enter]치세요 = ");
		int col = sc.nextInt();
		sc.nextLine();
		
		char[][] arr = new char[row][col];
		
		for(int i=0; i<row; i++) {
			System.out.println(i+1 + "번째 행에 입력할 문자" + col + "개를 차례대로 입력하고 [enter]치세요 =");
			String str = sc.nextLine();  //위에 col
			
			for(int j=0; j<col; j++) {
				arr[i][j] = str.charAt(j);
			}
		}

		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("---------------------");
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice5() {
		int row = 0;
		int col = 0;
		
		while(true) {
			System.out.println("행의 갯수를 입력하고 [enter]치세요 = ");
			row = sc.nextInt();
			System.out.println("열의 갯수를 입력하고 [enter]치세요 = ");
			col = sc.nextInt();
			
			if(row>0 && row<11 && col>0 && col<11) {
				break;
			}
			System.out.println("1~10사이의 정수를 입력해야 합니다.");
		}
		char[][] arr = new char[row][col];
		
		for(int i=0; i<row; i++) {  
			for(int j=0; j<col; j++) {  
				arr[i][j] = (char)(Math.random()*26+65);
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice6() {
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원",
			"열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(strArr[j][i] + " ");
			}
		}
	}
	
	public void practice15() {
		System.out.println("문자열 : ");
		String str = sc.nextLine();
		System.out.println("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		char[] cArr = new char[str.length()];
		for(int i=0; i<cArr.length; i++) {
			cArr[i] = str.charAt(i);
		}
		
		int count = 0;
		
		System.out.print(str + "에 "+ ch +"가 존재하는 위치(인덱스) : ");
		for(int i=0; i<cArr.length; i++) {
			if(cArr[i] == ch) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\n"+ch + " 개수 : " + count);
	}
	
	public void practice12() {
		int[] iArr = new int[10];
		
		for(int i=0; i<10; i++) { 
			iArr[i] = (int)(Math.random()*10+1); 
			
			for(int k=0; k<i; k++) {  
				if(iArr[i] == iArr[k]) { 
					i--;  
					break; 
				}
			}
		}
		for(int i=0; i<iArr.length; i++) {
			System.out.print(iArr[i] +" ");
		}
	}
}
