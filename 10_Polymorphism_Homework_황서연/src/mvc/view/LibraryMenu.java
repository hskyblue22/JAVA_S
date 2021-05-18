package mvc.view;

import java.util.Scanner;

import mvc.controller.LibraryManager;
import mvc.model.vo.AniBook;
import mvc.model.vo.CookBook;
import mvc.model.vo.Book;
import mvc.model.vo.Member;

public class LibraryMenu {

	private Scanner sc = new Scanner(System.in);
	private LibraryManager lm = new LibraryManager();

//	mainMenu() : void
//	selectAll() : void
//	searchBook () : void
//	rentBook() : void

	
	public void mainMenu() {
		// 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
		// LibraryManager의 insertMember() 메소드에 전달
//		==== 메뉴 ==== // 무한 반복 실행
//		1. 마이페이지 // LibraryManager의 myInfo() 호출한 후 그 결과값 출력
//		2. 도서 전체 조회 // LibraryMenu의 selectAll() 호출
//		3. 도서 검색 // LibraryMenu의 searchBook() 호출
//		4. 도서 대여하기 // LibraryMenu의 rentBook() 호출
//		0. 프로그램 종료하기
		
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();
		System.out.println("나이 입력 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("성별 입력(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		Member mem = new Member(name, age, gender);
		lm.insertMember(mem);
		
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지 ");
			System.out.println("2. 도서 전체 조회 ");
			System.out.println("3. 도서 검색 ");
			System.out.println("4. 도서 대여하기");
			System.out.println("0. 프로그램 종료하기 ");
			
			System.out.println("메뉴 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 0 :
				System.out.println("프로그램을 종료합니다.");
				return;
			case 1 :
				System.out.println(lm.myInfo());
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			default : 
				System.out.println("잘못 입력하셨습니다.");
				break;
			
			}
		}
	}

	public void selectAll() {
//		// LibraryManager의 selectAll() 메소드 호출하여 결 과 값 Book[] 자 료형에 담 기
//		 Book[] bList = lm.selectAll();
//		// for문 이용하여 bList의 모든 도서 목록 출력
//		// 단, i를 이용하여 인덱스도 같이 출력  대 여할 때 도 서번호를 알 기 위 해
//		ex )
//		0번도서 : 백종원의 집밥 / 백종원 / tvN / true
		
		Book[] bList = lm.selectAll();
		for(int i=0; i<bList.length; i++) {
			System.out.print(i+"번도서 : ");
			System.out.println(bList[i].toString());
		}
	}

	public void searchBook() {
//		// “검색할 제목 키워드 : “ >> 입력 받음 (keyword : String)
//		// LibraryManager의 searchBook() 메소드에 전달
//		// 그 결과 값을 Book[] 자료형으로 받기
//		 Book[] searchList = lm.searchBook(keyword);
//		// for each문(향상된 for문)을 이용하여 검색 결과의 도서 목록 출력
//		// NullPointerException 발생 시 오류 해결하시오 ㅎㅎ
		
		System.out.println("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		
		Book[] bk = lm.searchBook(keyword);
		for(Book b : bk) {
			if(b != null) {
				System.out.println(b.toString());				
			} else {
				continue;
			}
			
		}
		
	}

	public void rentBook() {
//		// 도서 대여를 위해 도서번호를 알아야 된다.
//		
//		selectAll() 메 소드 호 출 을 통해 도서 리스트 한번 출력 해주고
//		// “대여할 도서 번호 선택 : ” >> 입력 받음 (num : int)
//		// LibraryManager의 rentBook(num) 메소드에 전달
//		// 그 결과 값을 result로 받고 그 result가
//		// 0일 경우  성공 적으로 대 여되었습니다 ..” 출 력
//		1 일 경 우  나 이 제 한으로 대 여 불 가능입 니 다 ..” 출 력
//		// 2 일 경 우  성 공적으로 대 여되었습니다 . 요 리학원 쿠 폰이 발 급되었습니다
//		마 이페이지를 통 해 확 인하세요 ” 출 력
		
		selectAll();
		System.out.println("대여할 도서 번호 선택 : ");
		int num = sc.nextInt();
		
		int result = lm.rentBook(num);
		
		switch(result) {
		case 0 : 
			System.out.println("성공적으로 대여되었습니다.");
			break;
		case 1:
			System.out.println("나이제한으로 대여불가능입니다.");
			break;
		case 2:
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요.");
			break;	
		}
		
	}

}
