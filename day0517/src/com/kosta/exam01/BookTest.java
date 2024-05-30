package com.kosta.exam01;

class Book{
	private String title;
	private String author;
	
	public void setTitle(String t) {
		title = t;
		return;
	}
}
public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		//b1.title = "재미있는 자바";
		//private 영역의 맴버변수에 직접 접근할 수 없다
		//public에 있는 메소드를 통하여 접근하도록 해야 한다.
		//접근해서 값을 변경시키는 기능 setXXX()  ==> setter 설정자
		//접근해서 값을 읽어오는 기능  getXXX() ==> getter 접근자
		
	}
}
