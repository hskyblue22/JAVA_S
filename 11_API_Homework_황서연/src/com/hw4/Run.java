package com.hw4;

import com.hw4.controller.EmpTest;

public class Run {

	public static void main(String[] args) {
		
		EmpTest et = new EmpTest();
		
		// setEmp()를 실행 해 기존 사원들 등록 및 입력을 통한 사원 한명 정보 등록
		et.setEmp();
		
		System.out.println("------------------------정렬 이전------------------------");
		
		// printEmp()를 실행 해 사원들 출력
		// nameSortPrint()를 통해 사원들의 이름을 오름차순으로 출력
		et.printEmp();
		
		
		System.out.println("------------------------정렬 이후------------------------");
		
		// printEmp()를 실행 해 사원들 출력
		et.nameSortPrint();

	}

}
