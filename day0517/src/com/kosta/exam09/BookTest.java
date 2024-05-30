package com.kosta.exam09;
class Book{
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title; 
		this.author = author;
	}// 생성자
	
	public Book() {
		this("제목없음","저자없음");
	}
	
	public Book(String title) {
		this(title,"저자없음");
	}
	
	public void setTitle(String title) {
		this.title = title;
		return;
	}//setter
	
	public void setAuthor(String author) {
		this.author = author;
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
		Book b2 = new Book();
		Book b3 = new Book("신나는 자바");
		
		System.out.println(b1.getTitle()+","+b1.getAthor());
		System.out.println(b2.getTitle()+","+b2.getAthor());
		System.out.println(b3.getTitle()+","+b3.getAthor());
		
	}
}
