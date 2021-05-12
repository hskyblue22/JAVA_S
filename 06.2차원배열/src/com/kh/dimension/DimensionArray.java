package com.kh.dimension;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DimensionArray {

	//이차원배열 : 일차원배열 여러개를 하나로 묶은 것
	
	public void method1() {
		
		/* 1. 이차원 배열 선언
		 * 자료형 배열명[][];
		 * 자료형[] 배열명[];
		 * 자료형[][] 배열명;
		 * 
		 * */
		
		int arr1[][];
		int[] arr2[];
		int[][] arr;
		
		
		
		/* 2. 이차원 배열 할당
		 * 배열명 = new 자료형[행크기][열크기];
		 * 
		 * */
		
		arr = new int[3][5];
		
		//행의 길이
		System.out.println("행의 길이 : " + arr.length);
		
		//열의 길이 - 행에 접근해서 찾아야 함
		System.out.println("열의 길이 : " + arr[0].length);
		System.out.println("열의 길이 : " + arr[1].length);
		System.out.println("열의 길이 : " + arr[2].length);
		
		
		//*****
		//*****
		//*****
		
		
		//바깥쪽 for문 --> 행의 갯수만큼 반복
		//안쪽 for문  --> 열의 갯수만큼 반복
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void method2() {
		int[][] arr = new int[3][5];
		
		//1 2 3 4 5
		//6 7 8 9 10
		//11 12 13 14 15
		
		//값 기록
		//1. 인덱스에 접근해 값 기록
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
		arr[0][4] = 5;
		
		arr[1][0] = 6;
		arr[1][1] = 7;
		arr[1][2] = 8;
		arr[1][3] = 9;
		arr[1][4] = 10;
		
		arr[2][0] = 11;
		arr[2][1] = 12;
		arr[2][2] = 13;
		arr[2][3] = 14;
		arr[2][4] = 15;
		
		
		//중첩 for문 이용하여 값 기록
		
		int value = 1; 
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++;
				
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%2d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void method3() {
		//이차원 배열에 할당과 동시에 초기화
		
		int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void method4() {
		//가변배열
		//행은 정해졌으나 각 행에 대한 열의 갯수가 정해지지 않은 상태
		//자료형이 같은 1차원 배열 여러개를 하나로 묶은게 --> 2차원 배열
		//묶여있는 1차원 배열의 길이가 꼭 같을 필요는 없다.
		
		
		int[][] arr = new int[3][];  //가변배열 할당(행의 크기는 3행)
		
		
		arr[0] = new int[2];  //0행은 2열    각행마다 주소값 다르게 존재
		arr[1] = new int[1];  //1행은 1열
		arr[2] = new int[3];  //2행은 3열
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		//값 초기화
		//1. 인덱스 접근
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		
//		arr[1][0] = 3;
//		
//		arr[2][0] = 4;
//		arr[2][1] = 5;
//		arr[2][2] = 6;
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%2d", arr[i][j]);
			}
			System.out.println();
		}
		
		//2.중첩for문을 이용하여 값 기록
		int value = 1; 
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++;
				
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%2d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void method5() {
		//가변배열을 할당과 동시에 초기화
		
		int[][] arr = {{1,2},{3},{4,5,6}};
	}
	
	public void method6() {
		//Scanner이용 국어점수, 영어점수 3번 찍어서 평균을 구하시오.
		//double[][] arr = new double[2][4];
		
		Scanner sc = new Scanner(System.in);
		
		double[][] arr = new double[2][4];
		
		double sum =0; 
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(j<3) {
					System.out.print("점수 : ");
					arr[i][j] = sc.nextDouble();
					sum += arr[i][j];
				}else {
					arr[i][j] = sum;
				}
			}
			sum =0;
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void method6_1() {
		//Scanner이용 국어점수, 영어점수 3번 찍어서 평균을 구하시오.
		//double[][] arr = new double[2][4];
		Scanner sc = new Scanner(System.in);
		
		
		double[][] arr = new double[2][4];
		
		
		int arrIlght = 0; //각 행의 열의 길이
		
		
		for(int i=0; i<arr.length; i++) {
			
			double sum =0; 
			arrIlght = arr[i].length-1;
			
			for(int j=0; j<arr[i].length-1; j++) {
				if(i==0) {
					System.out.print("국어점수 : ");
				}else {
					System.out.print("영어점수 : ");
				}
				
				arr[i][j] = sc.nextDouble();
				sum += arr[i][j];
			}
			arr[i][arrIlght] = sum;
			System.out.println("합 ---> " + arr[i][arrIlght]);
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		DecimalFormat f1 = new DecimalFormat("0.00");  //반환되는 타입 -> String
		System.out.println("국어점수 평균 : " + arr[0][arrIlght]/arrIlght);
		System.out.println("영어점수 평균 : " + arr[1][arrIlght]/arrIlght);
	
		System.out.println("영어점수 평균 : " + f1.format(arr[1][arrIlght]/arrIlght));
	}
	
	public void method7() {
		//1~10사이의 랜덤값을 3행 3열에 값을 넣으려고 한다.
		//중복을 제거해서 넣어보세요
		
		int[] arr1 = new int[9];  //3행 3열 총 9개에 넣기 때문에 9개로 한다.
		
		for(int i=0; i<arr1.length; i++) {
			
			arr1[i] = (int)(Math.random()*10+1);
			
			for(int j=0; j<i; j++) {
				if(arr1[i] == arr1[j]) {
					i--;
					break;
				}
			}
		}
		
		int[][] arr2 = new int[3][3];
		
		int num =0; //1차원 배열의 0번부터 마지막 인덱스까지 접근하기 위한 변수
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				arr2[i][j] = arr1[num++];
			}
		}
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	//빙고게임
	public void bingo() {
		Scanner sc = new Scanner(System.in);
		
		//1차원배열로 중복제거한 25개 값 구해놓고
		
		int[] temArr = new int[25];
		
		for(int i=0; i<temArr.length; i++) {
			
			temArr[i] = (int)(Math.random()*25+1);
			
			for(int j=0; j<i; j++) {
				if(temArr[i] == temArr[j]) {
					i--;
					break;
				}
			}
		}
		
		int[][] arr = new int[5][5];
		
		int index =0;
		
		//arr[5][5] 이차원 배열에 랜덤값 넣기
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				arr[i][j] = temArr[index++];
			}
		}
		
		//arr[5][5] 출력
		for(int i=0; i < arr.length ; i++) {
			for(int k=0; k < arr[i].length; k++) {
				System.out.printf("%4d",arr[i][k]);
			}
			System.out.println();
		}
		
		int count =0;  //숫자 입력한 횟수 저장을 위해서 만든 변수
		System.out.println("========빙고게임시작========");
		
		while(true) {
			
			System.out.print("정수를 입력하세요 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			count++;  //입력횟수 1증가
			
			//입력한 숫자와 배열[][]값 중 같은 것 있는지 찾기
			for(int i=0; i<5; i++) {
				for(int k=0; k<5; k++) {
					
					if(arr[i][k] == num) {
						arr[i][k] = 0;  //일치하는 위치에 0으로 표시
					}
					
					System.out.printf("%4d",arr[i][k]);
				}
				System.out.println();
			}
			
			System.out.println("게임을 끝내시겠습니까(y/n) : ");
			char ch = sc.nextLine().toUpperCase().charAt(0);
			if(ch == 'Y') {
				break;
			}
		}
		
		System.out.println(count + "번 입력하였습니다.");
	}
	
	
}
