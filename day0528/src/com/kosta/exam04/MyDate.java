package com.kosta.exam04;

import java.util.StringTokenizer;

public class MyDate {
	String year;
	String month;
	String date;
	public MyDate(String str) throws IllegalArgumentException{
		if(str.matches("[0-9]{4}/[0-9]{2}/[0-9]{2}") == false) {
			throw new IllegalArgumentException("문자열이 null입니다.");
		}else {
			StringTokenizer st = new StringTokenizer(str, "/");
			year = st.nextToken();
			month = st.nextToken();
			date = st.nextToken();
			System.out.println("연도:"+year+" 월:"+month+" 일:"+date);
		}
	}
	
	public MyDate() {
		
	}

	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
