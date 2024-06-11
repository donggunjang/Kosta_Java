package com.kosta.exam01;

import java.util.Date;

public class DateTest2 {

	public static void main(String[] args) {
		String []arr = {"일","월","화","수","목","금","토"};
		
		//이번달의 1일의 요일을 확이하는 프로그램.
		Date today = new Date();
		int year = today.getYear();
		int month = today.getMonth();
		
		Date start = new Date(year,month, 1);
		int day = start.getDay();
		System.out.println(day);
		System.out.println(arr[day]);
		
		
        
        

	}

}
