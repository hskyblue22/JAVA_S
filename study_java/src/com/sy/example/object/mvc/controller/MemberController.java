package com.sy.example.object.mvc.controller;

import com.sy.example.object.mvc.model.vo.Member;

public class MemberController {

	private Member mem = new Member("admin","1234","홍길동","901022-1562334",163.0);
	
	public MemberController() {
		// TODO Auto-generated constructor stub
	}
	
	public int login(String id, String pwd) {
		if(mem.getMemberId().equals(id) && mem.getMemberPwd().equals(pwd)) {
			return 1;
		}
		return 0;
	}
	
	public Member readInfo() {
		return mem;
	}
	
	public int readAge() {
		int cen = Integer.parseInt(mem.getCitizenNo().substring(7,8));
		int year = Integer.parseInt(mem.getCitizenNo().substring(0, 2));
		int age =0;
		
		if(cen <=2) {
			int reYear = 1900 + year;
			age = 2021 - reYear + 1;
		}else {
			int reYear = 2000 + year;
			age = 2021 - reYear + 1;
		}
		return age;
	}
	
	public void updateHeight(double height) {
		mem.setHeight(height);
	}
}
