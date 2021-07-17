package com.sy.run;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Run_temp {

	public static void main(String[] args) {
		
		char_input();
		char_output();
	}
	
	public static void byte_input() {
		// file : 파일을 제어하기 위한 클래스
		// 입출력 기능 제공X

		FileOutputStream fout = null;
		// 1. FileOutputStream 객체 생성시 연결통로가 만들어짐

		try {

			// true 미작성시 : 기존에 해당파일이 있을 경우 덮어씌어짐(기본값 false)
			// true 작성시 : 기존에 파일이 있는 경우 이어서 작성됨(append)
			fout = new FileOutputStream("a_byte.txt"); // FileNotFoundException발생: 없는 경로 제시시

			// 2. 파일에 데이터를 출력하고자 할때 write()메소드를 사용//IOException 발생
			// 1byte단위로 출력이 되기 때문에 -128 ~ 127까지의 숫자만 출력이 가능
			// (단, 파일에는 해당숫자의 고유한 문자가 기록됨)
			fout.write(97);
			fout.write('b');
			fout.write('강'); // 한글은 2byte이기때문에 깨져서 저장된다. -> 바이트 스트림으로는 제한이 있음

			byte[] bArr = { 99, 100, 101 };
			fout.write(bArr); // cde출력

			// write(byte[] b, int off, int len) : off인덱스 부터 len개만큼 출력
			fout.write(bArr, 0, 1); // c출력

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) { // fout.write(97);적고 두번째 catch선택
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// 3. 반드시 스트림 다 이용했으면 반납해야한다.
				if (fout != null)
					fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void byte_output() {
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a_byte.txt"))) {
			
			int n=0;
			while((n=bis.read()) != -1) {
				System.out.println((char) n);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void char_input() {
		// FileWriter : 파일로 데이터를 2byte단위로 출력하기(한글이 깨지지 않는다.)

		// 1. FileWriter 객체 생성 --> 해당파일이 없으면 자동으로 만들어지고 연결통로를 만들어준다. 해당파일이 기존에 있으면 연결통로만
		// 연결

		FileWriter fw = null;

		try {
			fw = new FileWriter("b_char.txt" /*, true*/); // 파일 생성

			// 2. write메소드를 사용해서 출력하고자 하는 데이터를 내보냄, 2byte단위이므로 문자열 전송가능(즉 문자로 하나씩 전송되는개념)

			fw.write("와 재밌다");
			fw.write('A');
			fw.write(' ');
			fw.write('\n');

			char[] cArr = { 'a', 'p', 'p', 'l', 'e' };
			fw.write(cArr);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fw != null)
					fw.close(); // IOExeption이 발생하여 catch에 잡히더라고 close해줘야하므로 finally에 작성
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// 파일 --> 프로그램(입력 : 파일로부터 데이터 받아오기)
	public static void char_output() {

		// FileReader : 파일로부터 데이터를 2byte단위로 입력받기
		// 1. FileReader 객체생성 --> 연결통로 만들어짐

		FileReader fr = null;

		try {
			fr = new FileReader("b_char.txt");

			int value = 0;
			while ((value = fr.read()) != -1) {
				System.out.print((char) value);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	

}
