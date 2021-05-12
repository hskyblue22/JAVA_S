package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice2() {
		int[] arr = new int[10];
		
		for(int i=0; i < arr.length; i++) {
			arr[i] = arr.length-i;
		}
		
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice2_1() {
		
		int arr[] = new int[10];
		
		//오름차순 값 저장
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		
		int[] arr = new int[sc.nextInt()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print((i+1) + " ");
		}
	}
	
	public void practice4 () {
		String[] fruit = {"사과","귤","포도","복숭아","참외"};
		System.out.println(fruit[1]);
	}

	public void practice5() {
		Scanner sc= new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		System.out.print("문자 : ");
		char s1 = sc.nextLine().charAt(0);
		
		int count= 0;
		String index = "";
		
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == s1) {
				index += i + " ";
				count++;
			}
		}
		System.out.print(str + "에 " + s1 + "가 존재하는 위치(인덱스) : " + index);
		System.out.printf("\n%s 개수 : %d",s1, count);	
	}

	public void practice6() {
		String[] arr = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0~6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num>= 0 && num<=6) {
			System.out.println(arr[num]);
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}	
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		
		int[] arr = new int[sc.nextInt()];
		
		int sum =0;
		
		for(int i=0; i< arr.length; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n총합 : " + sum);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			int x = 0;
			
			if(num%2 == 1 && num >=3) {
				int[] arr = new int[num];
				
				for(int i=0; i<arr.length; i++) {
					if(i <= arr.length/2) {
						arr[i] = ++x;
					}else {
						arr[i] = --x;
					}
				}	
				System.out.println(Arrays.toString(arr));
				break;
				
			}else {
				System.out.println("다시입력하세요.");
				continue;
			}
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		String[] menu = {"후라이드","양념","간장","어니언크림"};
		
		System.out.println("치킨 이름을 입력하세요 : ");
		String chiken = sc.nextLine();
		
		for(int i=0; i<menu.length; i++) {
			
			if(chiken.equals(menu[i])) {
				System.out.printf("%s치킨 배달가능", chiken);
				return;
			}
		}
		System.out.printf("%s치킨은 없는 메뉴입니다", chiken);
	}
	
	public void practice10() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10 +1);
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice11() {
		int[] arr = new int[10];
		
		int max = 1;
		int min = 10;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10 +1);
			System.out.print(arr[i] + " ");
			
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + min);	
	}
	
	public void practice11_1() {
		int[] arr = new int[10];
	
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10 +1);
			System.out.print(arr[i] + " ");
		}
		
		Arrays.sort(arr);
		System.out.println("\n최대값 : " + arr[9]);
		System.out.println("최소값 : " + arr[0]);	
	}
	
	
	public void practice12() { 
		
		int[] arr = new int[10];

		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			
			for(int j=0; j<i; j++) {
				if(arr[j] == arr[i]) {
					i--;
					break;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice13() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String id = sc.nextLine();
		
		char[] arr = new char[id.length()];
		
		for(int i=0; i<arr.length; i++) {  
			
			arr[i] = id.charAt(i);   //간단하게 바꾸기! (if, else 모두 쓸 필요 없다.)
			
			if(i >= 8) {
				arr[i] = '*';
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	
	public void practice14() {
		
		int[] arr = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*45+1);
			
			for(int j =0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
