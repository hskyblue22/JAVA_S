package com.sy.example.io.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Scanner;

import com.sy.example.io.model.vo.Book;

public class BookManager {
	
	Scanner sc = new Scanner(System.in);  //접근제한자 default -> 적으면 안됨?
	
	public BookManager() {
		// TODO Auto-generated constructor stub
	}
	
	public void fileSave() {
		Book[] bk = new Book[5];
		
		bk[0] = new Book("C언어","김씨",10000, setCalendar(2012,2,2),0.1);
		bk[1] = new Book("자바","이씨",20000, setCalendar(2013,3,3),0.2);
		bk[2] = new Book("C++","박씨",30000, setCalendar(2014,4,4),0.3);
		bk[3] = new Book("넛지","서씨",40000, setCalendar(2015,5,5),0.4);
		bk[4] = new Book("개미","최씨",50000, setCalendar(2016,6,6),0.5);
	
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.dat"))){
			for(int i=0; i<bk.length; i++) {
				if(bk[i] != null) {
					oos.writeObject(bk[i]);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Calendar setCalendar(int year, int month, int date) {
		
		Calendar cal = Calendar.getInstance();    // 현재 시간을 받음.
	    
	    cal.set(Calendar.YEAR , year);
	    cal.set(Calendar.MONTH , month-1);
	    cal.set(Calendar.DATE , date);
	    
	    return cal;
	}
	
	public void fileRead() {
		// try with resource 구문 (FileNotFoundException과 ClassNotFoundException,
		// EOFException, IOException 처리)
		// 으로 “books.dat”파일을 불러오게 ObjectInputStream과
		// FileInputStream을 생성
		// 반복문을 통해 값을 다 읽어 들인 후 “books.dat 읽기 완료!” 출력
		// (EOFException 활용)
		
		Book[] readBook = new Book[10];
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.dat"))){
			
			Book b;
			int count = 0;
			
			while((b=(Book)ois.readObject()) != null) {
				readBook[count] = b;
				System.out.println(readBook[count++]);
			}
			
		} catch(EOFException e) {
			System.out.println("books.dat 읽기 완료!");
			return;
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {  
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
