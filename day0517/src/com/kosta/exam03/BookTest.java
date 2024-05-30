package com.kosta.exam03;

class Book{
	private String title;
	private String author;
	
	//생성자
	public Book() {
		System.out.println("생성자 동작");
		title ="재미있는 자바";
		author = "장동건";
	}
	
	public void setTitle(String t) {
		title = t;
		return;
	}
	
	public void setAuthor(String a) {
		author = a;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAthor() {
		return author;
	}
}
public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book();
		
		//책 제목,저자 출력
		System.out.printf("제목: %s\t",b1.getTitle());
		System.out.printf("저자: %s\n",b1.getAthor());
	}
}
