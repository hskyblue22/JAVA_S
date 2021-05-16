package com.kh.part01.object_vs_objectArray.run;

import java.util.Scanner;

import com.kh.part01.object_vs_objectArray.model.vo.Book;

public class ObjectArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[3];
		arr[0]=1;
		arr[1]=1;
		arr[2]=1;
		
		System.out.println(arr);    //참조변수 -> 주소값
		System.out.println(arr[0]); 
		
		//arr의 자료형 : int[] --> 레퍼런스변수 ==주소값을 가지는 변수
		//arr[index]의 자료형 : int --> 일반변수 ==값을 가지는 변수
		
		
		Book[] books = new Book[3];
		
		//books의 자료형 : Book[] -->레퍼런스 변수 == 주소값을 가지는 변수
		//books[index]의 자료형 : Book --> 일반변수 == 실제값을 가지는 변수
		//books[index] = 객체생성;
		
		books[0] = new Book();
		books[1] = new Book();
		books[2] = new Book();
		
		System.out.println(books);
		System.out.println(books[0]);
		System.out.println(books[0].getPrice());
		
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<books.length; i++) {
			System.out.println(i+1 +"번째 도서정보 입력");
			System.out.println("제목 : ");
			String title = sc.nextLine();
			
			System.out.println("저자 : ");
			String author = sc.nextLine();
			
			System.out.println("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.println("출판사 : ");
			String publisher = sc.nextLine();
			
			
			books[i] = new Book(title,author,price,publisher);
		}  //객체 생성끝
		
		//도서정보 조회
		for(int i=0; i<books.length; i++) {
			System.out.println(books[i].information());
		}
		//도서제목 검색
		System.out.println("검색할 책제목");
		String search = sc.nextLine();
		
		//반복문을 통해 각 인덱스의 제목과 비교
		for(int i=0; i<books.length; i++) {
			if(books[i].getTitle().equals(search)) {
				System.out.println(books[i].information());
			}
		}
		
		
		
		//일반 for문 --> forloop문
		//for each문(향상된 for문)
		
		for(int num : arr) {
			System.out.println("num : " + num);  //해당 배열만큼 반복하면서 반복문이 실행될 때마다 0번째 인덱스부터 마지막 인덱스까지 값이 num에 담긴다.
		}
		
		for( Book b :books) {  //초기값이 없어도 자동으로 JVM이 할당해줌
			System.out.println("b : " + b.information());
		}
		
		
	}

}
