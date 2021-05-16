package mvc.view;

import java.util.Scanner;

import mvc.controller.MemberController;
import mvc.model.vo.Member;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("====== 회원 관리 메뉴 ======");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("6. 회원 정보 정렬");
			System.out.println("9. 프로그램 종료");
			
			System.out.println("메뉴번호 입력 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				insertMember();
				break;
			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAllMember();
				break;
			case 6:
				sortMember();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default : 
				System.out.println("잘못 입력하였습니다. 다시 입력하세요");
				break;
			}
		}
	}

	private void searchMember() {
//		// 메뉴 출력 >> 반복 실행 처리함
//		====== 회원 정보 검색 ======
//		1. 아이디로 검색하기
//		2. 이름으로 검색하기
//		3. 이메일로 검색하기
//		9. 이전 메뉴로
//		메뉴 선택 : >> 키보드로 입력 받기 (menu : int)
//		검색 내용 : >> 키보드로 입력 받기 (search : String)
//		// 1. MemberController의 searchMember() 메소드로 menu와 search 문자열 전달 >> 결과 값
//		// 1_1. 결과 값이 null인 경우 즉, 검색 결과가 없는 경우 >> “검색된 결과가 없습니다.” 출력
//		// 1_2. 결과 값이 null이 아닌 경우 즉, 검색 결과가 존재하는 경우 >> 회원 정보 출력
		
		while(true) {
			System.out.println("====== 회원 정보 검색 ======");
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 이전 메뉴로");
			
			System.out.println("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if(menu == 9) {
				return;
			}
			
			System.out.println("검색 내용 : ");
			String search = sc.nextLine();
			
			Member m = mc.searchMember(menu,search);
			if(m == null) {
				System.out.println("검색된 결과가 없습니다.");
			} else {
				System.out.println(m.information());
			}
		}	
	}

	private void insertMember() {
		
		if(mc.getMemberCount() >= MemberController.SIZE) {
			System.out.println("입력 가능 인원을 초과하였습니다.");
			return;
		} else {
			System.out.println("ID를 입력하세요 : ");
			String userId = sc.nextLine();
			
			Member id_same = mc.checkId(userId);
			if(id_same != null) {
				System.out.println("동일한 아이디가 존재합니다. 회원등록 실패");
			} else {
				System.out.println("비밀번호를 입력하세요 : ");
				String userPwd = sc.nextLine();
				System.out.println("이름 입력하세요 : ");
				String name = sc.nextLine();
				System.out.println("나이를 입력하세요 : ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.println("성별을 입력하세요 : ");
				char gender = sc.nextLine().charAt(0);
				System.out.println("이메일을 입력하세요 : ");
				String email = sc.nextLine();
				
				mc.insertMember(new Member(userId,userPwd,name,age,gender,email));
				System.out.println("성공적으로 회원 등록이 되었습니다.");
				System.out.println("memberCount : " + mc.getMemberCount());
			}
 		}
	}
	
	public void updateMember() {
		// 메뉴 출력 >> 반복 실행 처리함
//		====== 회원 정보 수정 ======
//		1. 비밀번호 수정
//		2. 이름 수정
//		3. 이메일 수정
//		9. 이전 메뉴로
//		메뉴 선택 : >> 키보드로 입력 받기 (menu : int)
//		변경할 회원 아이디 : >> 키보드로 입력 받기 (userId : String)
		// 1. MemberController의 checkId()로 userId 전달 >> 결과 값 (m : Member)
		// 1_2. 결과 값이 null인경우 >> “변경할 회원이 존재하지 않습니다” 출력
		// 1_2. 결과 값이 null이 아닌 경우 기존 정보 출력 후
		// 변경내용(update : String) 입력 받고
		// MemberController의 updateMember()에 m, menu, update 전달
		// “회원의 정보가 변경되었습니다.” 출력
		
		
		while(true) {
			System.out.println("====== 회원 정보 수정 ======");
			System.out.println("1. 비밀번호 수정");
			System.out.println("2. 이름 수정");
			System.out.println("3. 이메일 수정");
			System.out.println("9. 이전 메뉴로");
			
			System.out.println("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if(menu == 9) {
				return;
			}
			
			System.out.println("변경할 회원 아이디 : ");
			String userId = sc.nextLine();
			
			Member mem_ID = mc.checkId(userId);
			
			if(mem_ID == null) {
				System.out.println("변경할 회원이 존재하지 않습니다.");
			} else {
				System.out.println("변경할 내용을 입력하세요 : ");
				String update = sc.nextLine();
				
				mc.updateMember(mem_ID, menu, update);
				System.out.println("회원의 정보가 변경되었습니다.");
			}
		}
	}
	
	public void deleteMember() {
//		삭제할 회원 아이디 : >> 키보드로 입력 받기 (userId : String)
		// 1. MemberController의 checkId()에 userId 전달 >> 결과 값 (m : Member)
		// 1_1. 결과 값이 null인 경우 “삭제할 회원이 존재하지 않습니다.” 출력
		// 1_2. 결과 값이 null이 아닌 경우 기존 정보 출력
		// “정말 삭제하시겠습니까? (y/n) : “ >> 키보드로 입력 받기
		// 대소문자 구분 없이 ‘Y’인 경우 MemberController의 deleteMember()에 userId 전달
		// “회원의 정보가 삭제되었습니다.” 출력
		
		System.out.println("삭제할 회원 아이디 : ");
		String userId = sc.nextLine();
		
		Member m = mc.checkId(userId);
		if(m == null) {
			System.out.println("삭제할 회원이 존재하지 않습니다.");
		}else {
			System.out.println(m.information());
			System.out.println("정말 삭제하시겠습니까? (y/n)");
			if(sc.nextLine().toUpperCase().equals("Y")) {
				mc.deleteMember(userId);
				System.out.println("회원의 정보가 삭제되었습니다.");
			}
		}
		
		
	}
	public void printAllMember() {  //nullpointerException오류
		// MemberController의 getMem() 메소드 호출 >> 결과 값 (mem : Member[])
		// 반복문을 통해 결과 값 안의 존재하는 회원들 정보 출력
		Member[] mem = mc.getMem();
		for(int i=0; i<mc.getMemberCount(); i++) {
			System.out.println(mem[i].information());
		}
	}
	
	public void sortMember() {
		Member[] sortMem = null; // 정렬 결과를 받아 줄 객체배열 초기화
		// 메뉴 출력 >> 반복 실행 처리함
//		====== 회원 정보 정렬 ======
//		1. 아이디 오름차순 정렬 >> MemberController의 sortIdAsc() 결과 sortMem에 대입
//		2. 아이디 내림차순 정렬 >> sortIdDesc() 결과 sortMem에 대입
//		3. 나이 오름차순 정렬 >> sortAgeAsc() 결과 sortMem에 대입
//		4. 나이 내림차순 정렬 >> sortAgeDesc() 결과 sortMem에 대입
//		5. 성별 내림차순 정렬(남여순) >> sortGenderDesc() 결과 sortMem에 대입
//		9. 이전 메뉴로
//		메뉴 선택 : >> 키보드로 입력 받기 (menu : int)
		// 반복문을 통해 sortMem 객체 배열 출력
		
		while(true) {
			System.out.println("====== 회원 정보 정렬 ======");
			System.out.println("1. 아이디 오름차순 정렬");
			System.out.println("2. 아이디 내림차순 정렬");
			System.out.println("3. 나이 오름차순 정렬");
			System.out.println("4. 나이 내림차순 정렬");
			System.out.println("5. 성별 내림차순 정렬(남여순)");
			System.out.println("9. 이전 메뉴로");
			
			System.out.println("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				sortMem = mc.sortIdAsc();
				break;
			case 2:
				sortMem = mc.sortIdDesc();
				break;
			case 3:
				sortMem = mc.sortAgeAsc();
				break;
			case 4:
				sortMem = mc.sortAgeDesc();
				break;
			case 5:
				sortMem = mc.sortGenderDesc();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default : 
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
			
			printAllMember();
		}
	}
	
}
