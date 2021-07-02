package com.sy.example.objectArray.mvc.controller;

import com.sy.example.objectArray.mvc.model.vo.Member;

public class MemberController {

	public static final int SIZE = 10;
	private int memberCount;
	private Member[] mem = new Member[SIZE];
	
	{   //초기화 블록
		mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
		mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
		mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
		mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
		memberCount = 5;
	}
	
	
	public int getMemberCount() {
		return memberCount;
	}
	
	public Member[] getMem() {
		return mem;
	}
	
	public Member checkId(String userId) {
		Member m = null;
		
		for(int i=0; i<memberCount; i++) {
			if(mem[i].getUserId().equals(userId)) {
				m = mem[i];
			}
		}
		return m;
	}
	
	public void insertMember(Member m) {
		mem[memberCount++] = m;
		
//위에처럼 적으면 훨씬 깔끔하다!
//		mem[memberCount] = m;
//		
//		memberCount++;
		

	}
	
	public Member searchMember(int menu , String search) {
		Member searchMember = null;
		
		for(int i=0; i<memberCount; i++) {
			
			String id = mem[i].getUserId();
			String name = mem[i].getName();
			String email = mem[i].getEmail();
			
			switch(menu) {
			case 1: 
				if(search.equals(id)) {
					searchMember = mem[i]; break;
				}
			case 2:
				if(search.equals(name)) {
					searchMember = mem[i]; break;
				}
			case 3:
				if(search.equals(email)) {
					searchMember = mem[i]; break;
				}
			}
		}
		return searchMember;
	}
	
	public void updateMember(Member m, int menu, String update) {
		switch(menu) {
		case 1:
			m.setUserPwd(update); break;
		case 2:
			m.setName(update); break;
		case 3:
			m.setEmail(update); break;
		}
	}
	
	
	
	
	public void deleteMember(String userId) {
		// 매개변수로 전달받은 userId가 mem에 존재하는 경우 해당 회원 삭제 후
		// 다음 인덱스 객체들의 정보를 한 칸씩 앞으로 이동 시킴
		// 실행 시 NullPointerException 발생할 수 있음 -> 왜 그런지 생각해보고 해결하시오
		// memberCount 1 감소
		
		//memberCount = 5 / i=0,1,2,3,4
		//userId -> 2번 인덱스에서 같다면
		for(int i=0; i< memberCount; i++) {
			
			//0,1 번 지나감
			System.out.println(memberCount);
			System.out.println(i);
			
			//i=2번 인덱스
			if(mem[i].getUserId().equals(userId)) {
				for(int j=i; j<memberCount; j++) {
					
					if(mem[j+1] != null) {
						mem[j] = mem[j+1];
					}else {
						mem[j] =null;
						memberCount--;
					}
				}
			}
		}
		
	}
	
	public Member[] sortIdAsc(){
		
		// 기존의 회원 객체 배열(mem)을 변경하지 않고 단지 정렬된 결과만을 보여주기 위해
		// 기존의 배열 복사해서 사용 (clone(), System.arraycopy() 둘 중 하나 사용해서 복사)
		//Member[] copy;
		// copy 배열을 아이디 별 오름차순 정렬 진행
		// --> HINT : String 클래스의 compareTo() 메소드 활용
		// copy 주소 값 리턴
		
		Member[] copy = new Member[SIZE];
		System.arraycopy(mem, 0, copy, 0, SIZE);
		Member temp = new Member();
		
		for(int i=0; i<memberCount; i++) {
			for(int j=0; j<i; j++) {
				if(copy[i].getUserId().compareTo(copy[j].getUserId()) < 0) {
					
					temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		
		return copy;
	}
	
	public Member[] sortIdDesc(){
		
		Member[] copy = new Member[SIZE];
		System.arraycopy(mem, 0, copy, 0, SIZE);
		Member temp = new Member();
		
		for(int i=0; i<memberCount; i++) {
			for(int j=0; j<i; j++) {
				if(copy[i].getUserId().compareTo(copy[j].getUserId()) > 0) {
					
					temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		
		return copy;
	}
	
	public Member[] sortAgeAsc(){
		Member[] copy = new Member[SIZE];
		System.arraycopy(mem, 0, copy, 0, SIZE);
		Member temp = new Member();
		
		for(int i=0; i<memberCount; i++) {
			for(int j=0; j<i; j++) {
				if(copy[i].getAge() < copy[j].getAge()) {
					
					temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		
		return copy;
	}
	
	public Member[] sortAgeDesc(){
		Member[] copy = new Member[SIZE];
		System.arraycopy(mem, 0, copy, 0, SIZE);
		
		for(int i=0; i<memberCount; i++) {
			for(int j=0; j<i; j++) {
				if(copy[i].getAge() > copy[j].getAge()) {
					Member temp = new Member();
					
					temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		
		return copy;
	}
	
	public Member[] sortGenderDesc(){
		Member[] copy = new Member[SIZE];
		System.arraycopy(mem, 0, copy, 0, SIZE);
		
		for(int i=0; i<memberCount; i++) {
			for(int j=0; j<i; j++) {
				if(copy[i].getGender() > copy[j].getGender()) {
					Member temp = new Member();
					
					temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		
		return copy;
	}
}
