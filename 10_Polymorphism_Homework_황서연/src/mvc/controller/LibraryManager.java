package mvc.controller;

import mvc.model.vo.AniBook;
import mvc.model.vo.Book;
import mvc.model.vo.CookBook;
import mvc.model.vo.Member;

public class LibraryManager {

	private Member mem;
	private Book[] bList = new Book[5];
	
	{ // 초기화 블록을 이용하여 샘플 데이터 초기화
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	
//	insertMember(mem:Member) : void
//	myInfo() : Member
//	selectAll() : Book[]
//	searchBook() : Book[]
//	rentBook(index:int ) : int
	
	public void insertMember(Member mem) {
		// 전달받은 mem 주소 값을 해당 회원 레퍼런스(mem)에 대입
		this.mem = mem;	
	}
	
	public Member myInfo() {
		// 회원 레퍼런스(mem) 주소 값 리턴
		return mem;
	}

	public Book[] selectAll() {
		// 도서 목록 레퍼런스(bList) 주소 값 리턴
		return bList;
	}

	public Book[] searchBook(String keyword) {
		// 검색 결과를 담아줄 새로운 Book 객체 배열 생성
		// 검색 결과 도서 목록이 최대 5개일 수 있으니 임의로 크기 5 할당
		// for문을 이용하여 bList 도서 목록들의 도서명과 전달받은 keyword 비교
		// 전달받은 keyword를 포함하고 있으면  HINT : String 클 래스 의 contains() 참 고
		// 검 색결과 의 도 서목록에 담 기  HINT : count 이 용
		// 해 당 검 색 결 과의 도 서목록 주 소 값 리 턴
		Book[] bk = new Book[5];
		int count = 0;
		
		for(int i=0; i<bList.length; i++) {
			if(bList[i].getTitle().contains(keyword)) {
				bk[count] = new Book(bList[i].getTitle(),bList[i].getAuthor(),bList[i].getPublisher());
			}
		}
		
		return bk;
		
	}
	
	public int rentBook(int index) {
		int result = 0;
		// 전달 받은 index의 bList 객체가 실제 AniBook 객체를 참조하고 있고
		// 해당 만화책의 제한 나이와 회원의 나이를 비교하여 회원 나이가 적을 경우
		// result를 1로 초기화  나 이 제한으로 대 여 불 가 하 다는 의 미
		// 전 달 받 은 index 의 bList 객 체가 실제 CookBook 객체를 참 조하고 있고
		// 해 당 요 리 책 의 쿠 폰유무가 true 일 경 우
		// 회 원의 couponCount 1 증 가 처 리 후
		// result 를 2 로 초 기화  성 공적으로 대 여 완 료 , 요 리학원 쿠 폰 이 발 급 됐 다는 의미
		// result 값 리 턴
		
		if(bList[index] instanceof AniBook) {
			if ( ((AniBook)bList[index]).getAccessAge() > mem.getAge()  ) {
				result =1;
			}
		}else {
			if( ((CookBook)bList[index]).isCoupon() ) {
				mem.setCouponCount(mem.getCouponCount()+1);
				result =2;
			}
			
		}
		
		return result;
	}

	
	
	
	
}
