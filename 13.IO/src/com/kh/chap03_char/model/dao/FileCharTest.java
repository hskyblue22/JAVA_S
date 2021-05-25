package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharTest {

	//프로그램 --> 파일(출력 : 프로그램내에서 파일 내보내기)
	public void fileSave() {
		//FileWriter : 파일로 데이터를 2byte단위로 출력하기(한글이 깨지지 않는다.)
		
		//1. FileWriter 객체 생성 --> 해당파일이 없으면 자동으로 만들어지고 연결통로를 만들어준다. 해당파일이 기존에 있으면 연결통로만 연결
		
		FileWriter fw = null;
		
		
		try {
			fw = new FileWriter("b_char.txt",true);  //파일 생성
			
			//2. write메소드를 사용해서 출력하고자 하는 데이터를 내보냄, 2byte단위이므로 문자열 전송가능(즉 문자로 하나씩 전송되는개념)
			
			fw.write("와 재밌다");
			fw.write('A');
			fw.write(' ');
			fw.write('\n');
			
			char[] cArr = {'a', 'p', 'p', 'l','e'};
			fw.write(cArr);
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(fw != null) fw.close();  //IOExeption이 발생하여 catch에 잡히더라고 close해줘야하므로 finally에 작성
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	//파일 --> 프로그램(입력 : 파일로부터 데이터 받아오기)
	public void fileOpen() {
		
		//FileReader  : 파일로부터 데이터를 2byte단위로 입력받기
		//1. FileReader 객체생성 --> 연결통로 만들어짐
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("b_char.txt");
			
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}
