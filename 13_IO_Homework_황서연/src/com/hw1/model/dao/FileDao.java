package com.hw1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDao {

	Scanner sc = new Scanner(System.in);
	
	public FileDao() {
		// TODO Auto-generated constructor stub
	}
	
	public void fileSave() {
		
		StringBuilder sb = new StringBuilder();
		System.out.println("파일에 저장할 내용을 반복해서 입력하시오(“exit”을 입력하면 내용 입력 끝) :");
		
		while (true) {
			// “파일에 저장할 내용을 반복해서 입력하시오("exit"을 입력하면 내용 입력 끝) :”
			// 값을 Scanner로 입력 받고 해당 입력 값이 “exit”일 경우 반복문 빠져나감
			// 아닐 경우 sb에 추가

			String input = sc.nextLine(); 
			
			if (input.equals("exit")) {
				break;
			} else {
				sb.append(input).append("\n");
			}
		}
		// “저장하시겠습니까? (y/n)”
		// 입력 받은 값이 대문자이든 소문자이든 상관없이 “y”이면,
		// 저장할 파일명을 입력 받음
		System.out.println("저장하시겠습니까? (y/n)");
		String answer = sc.nextLine();
		
		if(answer.equalsIgnoreCase("Y")) {
			
			System.out.println("저장할 파일명을 입력하시오 : ");
			String fileName = sc.nextLine()+".txt";
			
			BufferedWriter bw = null;
			
			try {
				// BufferedWriter와 FileWriter 스트림 사용
				// “입력받은 파일명.txt” 파일에 해당 sb 데이터출력
				// “입력받은 파일명.txt 파일에 성공적으로 저장하였습니다.” 콘솔창 출력
				bw = new BufferedWriter(new FileWriter(fileName));
				bw.write(sb.toString());
				System.out.println("입력받은 "+fileName+"파일에 성공적으로 저장하였습니다.");
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} finally {
				try {
					if(bw != null) bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else {
			// 입력 받은 값이 y가 아니면 “다시 메뉴로 돌아갑니다.” 출력하고 메뉴로..
			System.out.println("다시 메뉴로 돌아갑니다.");
			return;
		}

	}

	
	public void fileOpen() {
		// “열기 할 파일명 : “
		// 파일명을 Scanner로 입력 받아, BufferedReader와 FileReader 스트림 사용
		System.out.println("열기 할 파일명 : ");
		String fileName = sc.nextLine() + ".txt";
		
		BufferedReader br = null;
		try {
			// try구문 안에서 readLine()메소드를 통해 한줄씩 콘솔로 입력받은 값 출력
			
			br = new BufferedReader(new FileReader(fileName));
			
			String temp = "";
			while((temp = br.readLine()) != null ) {
				System.out.println(temp);
			}
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			// 존재하지 않은 파일 명 입력했을 때 해당 예외처리구문이 실행됨
			// “존재하는 파일이 없습니다.”
			
			System.out.println("존재하는 파일이 없습니다.");
//			e1.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void fileEdit() {
//		// “수정 할 파일명 : “
//		// 파일명을 입력받아 BufferedReader와 BufferedWriter, FileReader와 FileWriter
//		// 스트림 사용
		System.out.println("수정할 파일명 : ");
		String fileName = sc.nextLine() + ".txt";
		
		StringBuilder sb = new StringBuilder();
		
		BufferedWriter bw = null;
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
			// 반복문을 통해 해당 파일의 내용을 readLine()메소드를 통해 콘솔에 출력
			// “파일에 추가할 내용을 입력하시오 : “
			// 사용자가 “exit”을 입력하기 전까지 내용을 StringBuilder에 담기
			// “변경된 내용을 파일에 추가하시겠습니까? (y/n)”
			// 입력 받은 값이 대문자이든 소문자이든 상관없이 “y”이면,
			// “입력받은 파일명.txt 파일의의 내용이 변경되었습니다.”
			
			bw = new BufferedWriter(new FileWriter(fileName, true));
			
			String temp = "";
			while((temp = br.readLine()) != null ) {
				System.out.println(temp);
			}
			
			System.out.println("파일에 추가할 내용을 입력하시오 : ");
			
			while(true) {
				String input = sc.nextLine();

				if (input.equals("exit")) {
					break;
				} else {
					sb.append(input).append("\n");
				}
			}
			
			System.out.println("변경된 내용을 파일에 추가하시겠습니까? (y/n)");
			
			String answer = sc.nextLine();
			if(answer.equalsIgnoreCase("Y")) {
				bw.write(sb.toString());
				System.out.println("입력받은 "+fileName+"파일에 성공적으로 저장하였습니다.");
			} else {
				System.out.println("이전 메뉴로 돌아갑니다.");
				return;
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
