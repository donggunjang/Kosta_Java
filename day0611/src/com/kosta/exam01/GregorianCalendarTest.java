package com.kosta.exam01;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarTest {
	public static void main(String[] args) {
		String []arr = {"일","월","화","수","목","금","토"};
		GregorianCalendar today = new GregorianCalendar();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH);
		int date = today.get(Calendar.DAY_OF_MONTH);
		int day = today.get(Calendar.DAY_OF_WEEK);
		int hours = today.get(Calendar.HOUR);
		int minutes = today.get(Calendar.MINUTE);
		int seconds = today.get(Calendar.SECOND);
		
		System.out.println("현재 날짜와 시간: " + year + "년 " + 
		(month+1) + "월 " + date + "일 (" + arr[day-1] + "요일) " + 
		hours + "시 " + minutes + "분 " + seconds + "초");
		
		if( today.isLeapYear(year)) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("윤년이 아닙니다.");
		}
		
		 
		
	}
	
}
