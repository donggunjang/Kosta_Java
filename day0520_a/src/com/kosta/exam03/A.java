package com.kosta.exam03;

/*
 * default 접근명시자
 * => 접근명시자를 생략한 상태를 말하며
 * 	  동일한 패키지에 있는 클래스들에게는 접근을 허용한다.
 */

public class A {
	String title;	// 접근명시자 생략
	int year;		// 접근명시자 생략
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
