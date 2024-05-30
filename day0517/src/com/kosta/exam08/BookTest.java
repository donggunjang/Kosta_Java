package com.kosta.exam08;

/*
	생성자의 중복정의(생성자의 Overloading)
	==> 필요하다면 생성자를 중복하여 저의할 수 있다.
	==> 중복정의
 			매개변수의 개수가 다르거나 자료형이 달라야 한다.
*/

class Book{
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title; 
		this.author = author;
	}// 생성자
	
	public Book() {
		title = "제목없음";
		author = "저자없음";
	}
	
	public Book(String title) {
		this.title = title;
		this.author = "저자없음";
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
