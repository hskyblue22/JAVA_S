package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class D_Overlap {

	//중복제거
	public void method1() {
		int[] arr = new int[5];
		
		Scanner sc =new Scanner(System.in);
		
		for(int i=0; i<=arr.length; i++) {
			System.out.print(i + "번째 정수값 : ");
			arr[i] = sc.nextInt();
		
			for(int j=0; j<i; j++) {
				
				System.out.println(i + "    " + j);
				if(arr[i] == arr[j]) {
					System.out.println("중복값이 존재합니다.");
					i--;    //중복값있을 경우 다시 입력하도록 함
					break;  //가장 가까운 for문 빠져나가서 다시 바깥for문으로 가서 정수값 입력하도록 함
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void method2() {
		int[] arr = new int[5];
		
		//임의의 1부터 10사이의 난수를 발생시켜 중복없이 출력
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10 + 1);
		
			for(int j=0; j<i; j++) {
				
				//System.out.println(i + "    " + j);
				if(arr[i] == arr[j]) {
					i--;    //중복값있을 경우 다시 입력하도록 함
					break;  //가장 가까운 for문 빠져나가서 다시 바깥for문으로 가서 정수값 입력하도록 함
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public void method3() {
		
		//배열을 10칸, 난수100, 중복제거하고, 오름차순
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100 + 1);
			
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
public void method4() {
		
		//배열을 10칸, 난수100, 중복제거하고, 내림차순
		int[] arr = new int[10];
		
		//중복제거
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100 + 1);
			
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		//내림차순
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
