package com.sy.example.inherit.p1.run;

import java.util.Scanner;

import com.sy.example.inherit.p1.model.vo.Employee;
import com.sy.example.inherit.p1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Student[] stu = new Student[3];
		stu[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		stu[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		stu[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

		for (Student s : stu) {
			System.out.println(s.information());
		}

		
		Employee[] emp = new Employee[10];
		
		int count = 0;
		
		while(true) {
			System.out.print("추가하시겠습니까? (y/n)");
			String answer = sc.nextLine();
			
			if(answer.toUpperCase().equals("Y")) {
				
				System.out.print("이름 : ");
				String name = sc.nextLine();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("신장 : ");
				double h = sc.nextDouble();
				System.out.print("몸무게 : ");
				double w = sc.nextDouble();
				System.out.print("급여 : ");
				int s = sc.nextInt();
				sc.nextLine();
				System.out.print("부서 : ");
				String de = sc.nextLine();
				
				emp[count++] = new Employee(name,age,h,w,s,de);
			
			}else if(answer.toUpperCase().equals("N")){
				break;
			}else {
				System.out.println("잘못 입력하였습니다.");
			}
			
			if(count ==  10) {
				break;
			}
		}
		
		for (Employee e : emp) {
			if(e != null) {
				System.out.println(e.information());
			}
		}
		
	}

}
