package com.kh.array;

import java.util.Scanner;

public class A_Array {

	public void method1() {
		
		//일반변수 선언
		int i;  //메모리공간에 값을 기록해놓기 위한 공간 --> 그 메모리 중 Stack영역에 할당
		
		//1.배열 선언
		int[] iArr;  //배열을 선언하게 되면 변수선언과 마찬가지로 stack영역에 박스가 생김, 이 박스는 실제 값이 아닌 주소를 보관하는 공간
		
		double[] dArr;
		
		/*
		 * 
		 * 따라서 값을 담는 변수는 그냥 변수라고 하고
		 * 주소값을 담는 변수는 레퍼런스 변수(참조 변수)라고 표현한다.
		 * 
		 * 기본 자료형(boolean, char, byte, short, int, long, float, double) 로 선언한 변수
		 * ->> 진짜 값(리터럴)을 담는 변수--> 변수
		 * 
		 * 
		 * 그 외 자료형(String, int[], char[]....)
		 * --> 주소값을 담는 변수 --> 레퍼런스 변수(참조변수)
		 * 
		 */
		
		/*2.배열 할당
		 * 배열에 담을 값들이 몇개 들어갈지 배열할당으로 크기를 반드시 지정해두어야 한다.
		 * 
		 * iArr = new int[];  <--크기를 지정하지 않으면 에러발생
		 */
		iArr = new int[5];
		dArr = new double[10];
		
		//다음과 같이 new라는 연산자를 통해서 배열을 할당하게 되면 메모리의 heap영역에 해당배열의 크기만큼 공간이 만들어지고
		//그때 해당공간에 고유한 주소값도 같이 부여되어 주소값을 stack영역의 레퍼런스 변수에 저장하게 된다.
		//따라서 해당배열에 값을 넣거나 수정할 때 해당주소를 참조해서 사용하게 된다.
		
		
		//3.배열선언과 할당을 동시에 
		int[] iArr2 = new int[5];
		double[] dArr2 = new double[10];
		
		
		System.out.println("iArr : " + iArr);
		System.out.println("dArr : " + dArr);
		System.out.println("iArr2 : " + iArr2);
		System.out.println("dArr2 : " + dArr2);
		
		//주소값이 출력
		//heap 영역의 메모리에는 변수를 만든다거나 직접적으로 접근하지 못하는 영역이고 주소값을 통해서 찾아갈 수 있다.
	}
	
	public void method2() {
		
		double[] dArr = new double[3];
		int[] iArr = new int[5];
		
		for(int i=0; i<dArr.length; i++) {
			System.out.println(dArr[i]);
		}
		
		System.out.println("=========================");
		
		for(int i=0; i<iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		/* 배열을 따로 초기화하지 않는다면 JVM이 지정한 자료형의 기본값으로 배열을 초기화한다.
		 * heap 영역에는 값이 없는 공간이 존재할 수 없다. ---> JVM이 자동으로 초기값부여
		 * 
		 * 
		 * 문자열의 길이 : length()
		 * 배열의 길이 : length
		 * 
		 * */
		
		System.out.println("dArr의 길아 : " + dArr.length);
		System.out.println("iArr의 길아 : " + iArr.length);
	}
	
	public void method3() {
		
		//배열의 선언 및 할당
		int[] iArr = new int[5];
		
		//배열의 초기화(직접적으로)
		/* 
		 * iArr[0] = 1;
		 * iArr[1] = 2;
		 * iArr[2] = 3;
		 * iArr[3] = 4;
		 * iArr[4] = 5;
		 * */
		
		//반복문을 통해서
		for(int i =0; i<iArr.length; i++) {
			iArr[i] = i+1;
		}
		
		for(int i =0; i<iArr.length; i++) {
			System.out.println("iArr[" + i + "] : " + iArr[i]);
		}
		
		System.out.println("iArr의 주소값 : " + iArr ); //주소값
		System.out.println("iArr의 해쉬코드 : " + iArr.hashCode()); //주소값의 십진수 값
		
	}
	
	public void method4() {
		//사용자가 입력한 정수값으로 배열의 길이를 지정해보자
		
		Scanner sc = new Scanner(System.in);
		System.out.println("새로 할당할 배열의 길이 : ");
		int i = sc.nextInt();
		
		double[] dArr = new double[i];
		System.out.println(dArr);
		System.out.println("dArr의 길이 : " + dArr.length);
		
	}
	
	public void method5() {
		//배열선언과 동시에 초기화하기
		
		int[] arr1 = {1,2,3,4};
		//중괄호 블럭을 사용하는 경우 --> new연산자 사용 X,내부적으로 수행
	
		int[] arr2 = new int[] {1,2,3,4};
		
		System.out.println("arr1의 길이 : " + arr1.length);
		System.out.println("arr2의 길이 : " + arr2.length);
	
		System.out.println(arr1 == arr2); //false
		//arr1,arr2값의 같지만 레퍼런스(참조)변수이기 때문에 주소값이 같을 수 없다.
		
	}
	
	public void method6() {
		
		String[] sArr = new String[5];
		
//		for(int i=0; i<sArr.length; i++) {
//			System.out.println(sArr[i]);  //참조 자료형 String의 JVM이 부여하는 초기값 null
//		}
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<sArr.length; i++) {
			System.out.print("과일 : ");
			sArr[i] = sc.nextLine();
		}
		
		for(int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i]);
		}	
	}
	
	public void method7() {
		//크기가 10짜리 정수형 배열을 만들고, 랜덤값을 발생시켜서 담아서 출력하도록
		//랜덤값 1~100
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100+1);
		}
	
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] : " +arr[i]);;
		}
			
	}
	
	public void method8() {
		//정수 배열크기5, 1~10 사이의 짝수 담기
		
		int[] arr = new int[5];
		
		int num=0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = num+=2;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("arr의 길이 : " + arr.length);         //길이
		System.out.println("arr의 해시코드 : " + arr.hashCode());  //주소값
	
		arr = new int[10];
		
		System.out.println("======= 크기변경 후 arr =======");
		System.out.println("arr의 길이 : " + arr.length);         
		System.out.println("arr의 해시코드 : " + arr.hashCode());  //주소 완전히 새로 만들어짐
		
		arr = null;  //삭제
//		System.out.println("======= 삭제 후 arr =======");
//		System.out.println("arr의 길이 : " + arr.length);         //nullpointer error -> 빈 배열임!
//		System.out.println("arr의 해시코드 : " + arr.hashCode());  //nullpointer error -> 빈 배열임! 
		
		
	}
	
}
