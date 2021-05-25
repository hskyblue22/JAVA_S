package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
	//CheckedException 반드시 예외처리 해줘야 한다.
	//조건문, 소스코드 수정으로 해결이 안된다. -- 예측불가
	//주로 외부 매개체의 입출력시 발생 
	
	
	//IOException 입출력과정중 문제가 생겼을 때 던지는 예외
	
	public void method1() {  //여기서 에러 잡아줘야 한다. 끝까지 던지면 안됨
		try {
			method4();
		} catch (IOException e) {  //IOException 안됨 / nullpointerException은 runtime이라서
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("종료!!");
		}
	}

	public void method2() throws IOException {
		
		/*1.try ~ catch()처리 : 이 구문에서 바로 예외처리를 하겠다. 
		 * 
		 * try : 예외가 발생할 가능성이 있는 코드를 블록내에 작성
		 * catch(발생될 예외클래스 매개변수) : try구문에서 예외가 발생하면 어떻게 처리할 것인지 작성
		 * finally : try~catch문 수행후 반드시 꼭 실행되어야 하는 코드 작성
		 * */
		byte[] aa = {'a','b','c'};
		//write() 라는 메소드는 byte를 출력하거나, 아스키 코드 등을 출력할때 씀
		try {
			System.out.write(aa);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		//2. throws : 지금 이 메소드에서 예외처리를 하지않고 현재 이 메소드를 호출한 곳으로 위임하겠다
	}
	
	public void practice2() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(""));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(br != null)br.close();
			//br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void method3() {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(""));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			//br.close() -> IOException 발생
			try {
				if(br != null) br.close(); //-> nullpointerException 발생 -> if문으로 처리
				/* 실행시 FileNotFoundException(없는 파일을 읽어서 실행하려고 하니) 발생시키고 
				 * catch에서 printStackTrace();출력되고
				 * finally블럭에서 레퍼런스 변수(br)에 초기값 null이 그대로 들어가 있는 상태이기 때문에
				 * null을 참조하는 레퍼런스 변수에 close()를 사용했기때문에 NullPointerException이 발생 -> 그래서 if문으로 처리
				 * */
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
				System.out.println(e.getMessage());
			}
			System.out.println("꼭 출력되어야 합니다.");
		}
		
	}
	
	public void method4() throws IOException {
		//try~with~resource : 반납할 close자원이 있는 경우 처리 -> try()괄호안에 객체를 생성할 수 있고 이괄호 안에서 
		//													생성한 객체는 close해주지 않아도 자동 close된다.
		
		try(BufferedReader br = new BufferedReader(new FileReader(""));) {
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	

	public void method5() throws Exception{
		// InputStreamReader: 바이트 스트림을 문자 스트림으로 연결시켜주는 역할을 하는 보조스트림
		// system 클래스의 inputStream System.in --> byte단위 표준인풋스트림키보드입력
		// outputStream System.out --> 표준 아웃풋 스트림 화면출력
		// BufferedReader는 문자 입력 스트림에 연결되어 버퍼를 제공해 주는 보조 스트림이다.
		// BufferedReader는 입력 소스로부터 자신의 내부 버퍼 크기만큼 데이터를 미리 읽고 버퍼에 저장해 둔다.
		// 프로그램은 외부의 입력 소스로부터 직접 읽는 대신 버퍼로부터 읽음으로써 읽기 성능이 향상된다
		//readLine(); 한줄씩 읽은 만큼 반환
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("아무 문자열을 입력해주세요");
		
		/*try {
			String str = br.readLine();
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}*/
		
		String str = br.readLine();
		System.out.println(str);
		
		if(str.equals("a")) {  //에러 발생시킬 수 있다.
			throw new Exception("에러 발생했다!");
		}
	}
	
	
	
}
