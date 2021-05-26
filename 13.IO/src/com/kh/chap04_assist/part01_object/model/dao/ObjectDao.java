package com.kh.chap04_assist.part01_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part01_object.model.vo.Phone;

public class ObjectDao {

	public void fileSava() {
		
		//객체를 파일에 출력할 때 사용되는 스트림
		//FileOutputStream : 파일출력에 사용되는 기반 바이트 스트림 클래스
		//ObjectOutputStream : 객체단위로 출력시 사용되는 보조바이트 스트림
		
		Phone ph = new Phone("삼성", 200000);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Phone.txt"))) {
			
			oos.writeObject(ph);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fildOpen() {
		
		//FileInputStream : 파일로부터 데이터를 읽어들이기 위해 사용되는 기반 바이트 스트림
		//ObjectInputStream : 스트림으로부터 객체단위로 읽어들이기 위해 사용되는 보조바이트 스트림
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Phone.txt"))) {
			
			Phone ph = (Phone) ois.readObject();
			System.out.println(ph.toString());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {  //Phone ph = (Phone) ois.readObject();발생
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
