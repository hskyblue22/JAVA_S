package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class Run {

	public static void main(String[] args) {
		//file : 파일을 제어하기 위한 클래스로 입출력 기능을 제공하지 않는다.
		//파일의 입출력은 스트림을 사용해야 한다.
		
		
		try {
			//1. 경로지정을 딱히 하지 않으면 현재 project폴더에 생성이 된다.
			File f1 = new File("test.txt");  //메모리상에 존재, 객체로 있는 상태 
//			f1.createNewFile();  //새로운 파일 생성
			
			//2. 존재하는 기본 드라이브나 폴더에 파일생성
			//D드라이브에는 폴더없이 파일생성 가능
			File f2 = new File("C:\\test1\\test.txt");
			f2.createNewFile();
			
			//File f3 = new File("C:\\test\\test.txt"); //폴더생성이 바로 안됨 IOException발생
			//f3.createNewFile();
			
			
			File testFolder = new File("C:\\test");
			testFolder.mkdir();  //폴더생성
			File f3 = new File("C:\\test\\test.txt"); //위에서 만들어진 폴더에 test파일 생성
			f3.createNewFile();
			
			System.out.println(f3.exists()); //존재여부 확인
			System.out.println(f1.exists());
			System.out.println(testFolder.exists());
			
			System.out.println(f3.isFile());  //파일인지 확인
			System.out.println(testFolder.isFile());
			
			File folder = new File("parent");
			folder.mkdir();  //자바프로젝트 내 폴더 생성
			
			File file = new File("parent\\person.txt");
			file.createNewFile();
			
			System.out.println("파일명 : "+ file.getName());
			System.out.println("절대경로 : "+file.getAbsolutePath());
			System.out.println("상대경로 : "+file.getPath());  //폴더명기준 경로
			System.out.println("파일용량 : "+file.length());
			System.out.println("상위폴더 : "+file.getParent());
			
			
		} catch (IOException e) { //createNewFile -> thorws IOException
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
