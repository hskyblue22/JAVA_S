package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Student[] st = new Student[10];
		int count = 0;
		
		
		while(true) {
			System.out.println("학년 : ");
			int grade = sc.nextInt();
			System.out.println("반 : ");
			int classroom = sc.nextInt();
			sc.nextLine();
			System.out.println("이름 : ");
			String name = sc.nextLine();
			System.out.println("국어점수 : ");
			int kor = sc.nextInt();
			System.out.println("영어점수: ");
			int eng = sc.nextInt();
			System.out.println("수학점수 : ");
			int math = sc.nextInt();
			sc.nextLine();
			
			//배열의 count인덱스에 매개변수 생성자를 통해 객체 생성
			st[count++] = new Student(grade, classroom, name, kor, eng, math);
			
			System.out.println("계속 추가하시겠습니까?(Y/N)");
			String answer = sc.nextLine();
			if(answer.toUpperCase().equals("N")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
					
		}
		
		for(int i=0; i<count; i++) {
			System.out.println(st[i].information());
		}
	}

}
