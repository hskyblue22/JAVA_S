package com.kh.dimension.practice;

import java.util.Scanner;

public class DimensionPractice {

	public void practice1() {
		
		int[][] arr = new int[4][4];
		
		int num =1; 
		
		//값 저장
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k < arr[i].length; k++) {
				arr[i][k] = num++;
			}
		}
		
		//값 출력
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k < arr[i].length; k++) {
				System.out.printf("%3d",arr[i][k]);
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		int[][] arr = new int[4][4];
		
		int num =16; 
		
		//값 저장
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k < arr[i].length; k++) {
				arr[i][k] = num--;
			}
		}
		
		//값 출력
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k < arr[i].length; k++) {
				System.out.printf("%3d",arr[i][k]);
			}
			System.out.println();
		}
	
	}
	
	public void practice3() {
		String[][] arr = new String[3][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k<arr[i].length; k++) {
				arr[i][k] = "("+ i +", "+ k +")";
				System.out.print(arr[i][k]);
			}
			System.out.println();
		}
	}
	
	public void practice4() {
		int[][] arr = new int[4][4];
		
		for(int i=0; i<arr.length-1; i++) {
			for(int k=0; k<arr[i].length-1; k++) {
				arr[i][k] = (int)(Math.random()*10 + 1);
				
				arr[i][3] += arr[i][k];
				arr[3][k] += arr[i][k];
				
				arr[3][3] += arr[i][k];
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k < arr[i].length; k++) {
				System.out.printf("%3d",arr[i][k]);
			}
			System.out.println();
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 크기 : ");
		int tuple = sc.nextInt();
		
		System.out.print("열 크기 : ");
		int colum= sc.nextInt();
		
		char[][] arr = new char[tuple][colum];
		
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k<arr[i].length; k++) {
				arr[i][k] = (char)(Math.random()*26 + 65);
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k < arr[i].length; k++) {
				System.out.print(arr[i][k] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice6() {
		String[][] strArr = new String[][] {{"이","까","왔","앞","힘"},{"차","지","습","으","냅"},
			{"원","열","니","로","시"},{"배","심","다","좀","다"},{"열","히","!","더","!!"}};
		
		for(int i=0; i<5; i++) {
			for(int k=0; k<5; k++) {
				System.out.print(strArr[k][i] + " ");
			}
			System.out.println();
		}
 	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 크기 : ");
		int t_num = sc.nextInt();
		
		char[][] arr = new char[t_num][];
		
		for(int i=0; i< t_num; i++) {
			System.out.print(i+ "행의 크기 : ");
			arr[i] = new char[sc.nextInt()];
		}
		
		//값 저장 & 출력
		char ch = 'a';
		
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k < arr[i].length; k++) {
				arr[i][k] = ch++;
				System.out.print(arr[i][k]+ " ");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		
		String sArr[] = {"강건강","남나나","도대담","류라라","문미미","박보배",
				"송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		
		int index = 0;
		int index2 = 6;
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		for(int i=0; i<arr1.length; i++) {
			for(int k=0; k < arr1[i].length; k++) {
				arr1[i][k] = sArr[index++];
				arr2[i][k] = sArr[index2++];
			}
		}
		
		for(int i=1; i<=2; i++) {
			System.out.println("== " + i + " 분단 ==");
			for(int j=0; j<arr1.length; j++) {
				for(int k=0; k < arr1[i].length; k++) {
					if(i==1) {
						System.out.print(arr1[j][k] +" ");
					}else {
						System.out.print(arr2[j][k] +" ");
					}
				}
				System.out.println();
			}
		}
	}
	
	public void practice9() {
		
		String sArr[] = {"강건강","남나나","도대담","류라라","문미미","박보배",
				"송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		
		int index = 0;
		int index2 = 6;
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		for(int i=0; i<arr1.length; i++) {
			for(int k=0; k < arr1[i].length; k++) {
				arr1[i][k] = sArr[index++];
				arr2[i][k] = sArr[index2++];
			}
		}
		
		for(int i=1; i<=2; i++) {
			System.out.println("== " + i + " 분단 ==");
			for(int j=0; j<arr1.length; j++) { //행
				for(int k=0; k < arr1[i].length; k++) {  //열
					if(i==1) {
						System.out.print(arr1[j][k] +" ");
					}else {
						System.out.print(arr2[j][k] +" ");
					}
				}
				System.out.println();
			}
		}
		Scanner sc = new Scanner(System.in);
		
		System.out.println("========================");
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		int line = 0;
		int tuple = 0;
		String w = "";
		
		for(int i=0; i<arr1.length; i++) {
			for(int k=0; k<arr1[i].length; k++) {
				
				if(arr1[i][k].equals(name)) {
					line = 1;
					tuple = i+1;
					
					if(k == 1) {
						w = "오른쪽";
					}else {
						w = "왼쪽";
					}
				}
			}
		}
		
		for(int i=0; i<arr2.length; i++) {
			for(int k=0; k<arr2[i].length; k++) {
				if(arr2[i][k].equals(name)) {
					line = 2;
					tuple = i+1;
					
					if(k == 1) {
						w = "오른쪽";
					}else {
						w = "왼쪽";
					}
				}
			}
		}
		
		System.out.printf("검색하신 %s 학생은 %d분단 %d번째 줄 %s에 있습니다.",
				name, line, tuple, w);
		
	}
}
