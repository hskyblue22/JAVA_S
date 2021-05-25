package com.kh.chap04_assist.part01_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {

	public void fileSave() {
		
		//1. 기반스트림 생성(어떤 외부 매체와 데이터를 주고받을 것이냐를 선택해주는 메인(기반)스트림 반드시 필요) - FileWriter
		
		/*
		BufferedWriter bw = null;
		
		try {
			//2. 보조스트림 생성(기반스트림의 성능을 좀더 향상시키고자함, 매개변수로 기반스트림을 사용) - BufferedWriter
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
		
			bw.write("안녕하세요.\n");
			bw.write("반갑습니다.\n");
			bw.newLine();
			bw.write("감사합니다.\n");
		
			//bufferedWriter의 장점 : 2byte단위로 데이터가 출력될때 버퍼라는 공간에 계속 쌓고 한번에 출력해줌
			//                      기반스트림에서는 제공해주지 않는 newLine()메소드 제공(개행시켜줌)
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
		} */
		
		//try with resource구문 -> try(스트림객체생성구문을 작성) : 다 사용하고나서 알아서 닫아준다 close()
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))) {
			bw.write("안녕하세요.\n");
			bw.write("반갑습니다.\n");
			bw.newLine();
			bw.write("감사합니다.\n");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fileOpen() {
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))) {
			
			/*System.out.println(br.readLine());  마지막에  null이 나옴
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());*/ 
			
			String temp = null;
			while((temp = br.readLine()) != null) {
				System.out.println(temp);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
