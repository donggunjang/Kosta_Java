package com.kosta.exam01;

import java.util.Calendar;

//	Calendar 클래스의 객체는 직접 생성할 수 없고
//	static 메소드인 instance메소드를 통해 생성 할 수 있다.
public class CalendarTest {

	public static void main(String[] args) {
//		Calendar today = new Calendar(); protected이기 때문에 이 방법으로 객체를 생성하지 못한다.
		Calendar today = Calendar.getInstance();
		
		int year = today.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = today.get(Calendar.MONTH);
		System.out.println(month+1);
		
		int date = today.get(Calendar.DAY_OF_MONTH);
		System.out.println(date);
		
		int hour = today.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour);
		
		int minute = today.get(Calendar.MINUTE);
		System.out.println(minute);
		
		int seconds = today.get(Calendar.SECOND);
		System.out.println(seconds);
		
		int day = today.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		
		String []arr = {"","일","월","화","수","목","금","토"};
		System.out.println(arr[day]);
	}

}
