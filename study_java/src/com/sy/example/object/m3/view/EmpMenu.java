package com.sy.example.object.m3.view;

import java.util.Scanner;

import com.sy.example.object.m3.model.vo.Employee;

public class EmpMenu {

	Scanner sc = new Scanner(System.in);
	
	public EmpMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("===== 사원 정보 관리 프로그램 =====");
			System.out.println("1. 새 사원 정보 입력");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 출력");
			System.out.println("9. 프로그램 종료");
			
			System.out.println("메뉴번호를 입력하세요");
			int menu = sc.nextInt();
			sc.nextLine();
			
			// 메뉴 화면 출력 --> 반복 실행 처리
//			1. 새 사원 정보 입력 // inputEmployee() 실행 -> 반환 값으로 emp 초기화
//			2. 사원 정보 수정 // modifyEmployee() 실행
//			3. 사원 정보 삭제 // 가비지 컬렉터가 지워주게끔
//			4. 사원 정보 출력 // Employee의 information() 사용
//			9. 프로그램 종료 // return 처리
//			메뉴 번호 선택 : >> 입력 받음
			
			Employee emp = new Employee();
			
			switch(menu) {
			case 1: inputEmployee(); break;
			case 2: modifyEmployee(emp); break;
			case 3: //객체 내용 삭제 이렇게도 가능하군!
				emp = null; 
				System.out.println("사원정보가 삭제");
				break;
			case 4: System.out.println(emp.information()); break;
			case 9: System.out.println("프로그램 종료"); return;
			default: System.out.println("잘못 입력"); break;
			}
		}
		
	}
	
	public Employee inputEmployee() {
		System.out.println("사원 이름 : ");
		String name = sc.nextLine();
		System.out.println("사원 부서 : ");
		String dept = sc.nextLine();
		System.out.println("사원 직급 : ");
		String job = sc.nextLine();
		System.out.println("사원 나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("사원 성별 : ");
		char gender = sc.nextLine().charAt(0);
		System.out.println("사원 급여 : ");
		int salary = sc.nextInt();
		System.out.println("사원 보너스포인트 : ");
		double bonusPoint = sc.nextDouble();
		sc.nextLine();
		System.out.println("사원 전화번호 : ");
		String phone = sc.nextLine();
		System.out.println("사원 주소 : ");
		String address = sc.nextLine();
		
		Employee emp = new Employee(name, dept, job, age, gender, salary, bonusPoint, phone, address);
		return emp;
	}
	
	public void modifyEmployee(Employee emp) {
		while(true) {
			System.out.println("====== 사원 정보 수정 메뉴 =====");
			System.out.println("1. 이름 변경");
			System.out.println("2. 급여 변경");
			System.out.println("3. 부서 변경");
			System.out.println("4. 직급 변경");
			System.out.println("9. 이전메뉴로");
			
			System.out.print("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1: 
				System.out.println("변경할 이름 : ");
				emp.setEmpName(sc.nextLine());break;
			case 2:
				System.out.println("변경할 급여 : ");
				emp.setSalary(sc.nextInt());
				sc.nextLine();break;
			case 3:
				System.out.println("변경할 부서 : ");
				emp.setDept(sc.nextLine());break;
			case 4:
				System.out.println("변경할 직급 : ");
				emp.setJob(sc.nextLine());break;
			case 9:
				System.out.println("이전 메뉴로");
				return;
			default :
				System.out.println("잘못 입력");break;
			}
		}
	}
}
