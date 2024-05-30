package com.kosta.exam06;

class Book{
	private String title;
	private String author;
	
	
	//생성자의 매개변수이름을 의미있는 이름으로 정해주다보면 맴버변수와 변수명이 겹치게 되고
	//생성자body에서는 매개변수가 우선순위가 높아서 맴버변수에는 초기화가 되지 않는다.
	
	public Book(String title, String author) {
		System.out.println("생성자 동작");
		title = title; 
		author = author;
	}// 생성자
	
	public void setTitle(String t) {
		title = t;
		return;
	}//setter
	
	public void setAuthor(String a) {
		author = a;
	}//setter
	
	public String getTitle() {
		return title;
	}//getter
	
	public String getAthor() {
		return author;
	}//getter
}
public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book("재미있는자바","장동건");
		Book b2 = new Book("즐거운자바","홍길동");
		//책 제목,저자 출력
		System.out.printf("제목: %s\t",b1.getTitle());
		System.out.printf("저자: %s\n",b1.getAthor());
		System.out.println("-----------------------------");
		System.out.printf("제목: %s\t",b2.getTitle());
		System.out.printf("저자: %s\n",b2.getAthor());
		
	}
}
