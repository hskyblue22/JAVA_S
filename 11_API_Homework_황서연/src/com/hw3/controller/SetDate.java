package com.hw3.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SetDate {

	public SetDate() {
		// TODO Auto-generated constructor stub
	}
	
	public String todayPrint() {
		
		Date today = new Date();
		int tYear = today.getYear() + 1900;
		int tMon = today.getMonth()+1;
		int tDay = today.getDay();
		int tHour = today.getHours();
		int tMin = today.getMinutes();
		int tSec = today.getSeconds();
		
		SimpleDateFormat to = new SimpleDateFormat("yyyy년 MM월 dd일 h시 mm분 ss초");
		return to.format(today);
			
	}
	
	public String setDay() {
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(2011, 03, 21);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		return sdf.format(calendar.getTime());
	}
}
