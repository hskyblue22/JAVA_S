package com.mvc.controller;

import com.mvc.model.vo.Member;

public class MemberController {

	private Member mem = new Member("admin", "1234", "홍길동", "901022-1562334", 163.0);
	
	public int login(String id, String pwd){
	// 전달받은 id, pwd값과 mem의 memberId와 memberPwd 비교했을 때
	// 모두 같으면 1을 리턴
	// 아니면 0을 리턴
		if (id.equals(mem.getMemberId()) && pwd.equals(mem.getMemberPwd())) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public Member readInfo(){
	// mem의 주소 값을 리턴
		return mem;
	}
	
	public int readAge(){
	// mem의 주민번호의 앞 2자리를 추출해서 출생년도를 알아낼 것 960708-2000000
//	HINT : String클래스의 substring() 메소드, Integer클래스의 parseInt() 메소드 참고
	// 나이 = 올해년도 – 출생년도 + 1 ( 어떤 조건이 필요한지 생각해보시오 )
	// 구한 나이 값 리턴
	
	if(mem.getCitizenNo().substring(7, 8).equals("1")  || mem.getCitizenNo().substring(7, 8).equals("2") ) {
		return 21-Integer.parseInt(mem.getCitizenNo().substring(0,2))+101;
	}else {
		return 21-Integer.parseInt(mem.getCitizenNo().substring(0,2))+1;
	}
	
	}
	
	public void updateHeight(double height){
	// 전달 받은 height값으로 mem의 height값 수정
		mem.setHeight(height);
	}
}
