package com.kosta.exam05;

import java.util.Objects;

public abstract class Book {
	protected String number;	//관리번호
	protected String title;	 	//제목
	protected String author;	//저자
	public Book(String number, String title, String author) {
		super();
		this.number = number;
		this.title = title;
		this.author = author;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, number, title);
	}
	@Override
	public boolean equals(Object obj) {
		boolean re = false;
		Book b = (Book)obj;
		if(number.equals(b.number)) {
			re = true;
		}
		return re;
	}
	@Override
	public String toString() {
		return "Book [number=" + number + ", title=" + title + ", author=" + author + "]";
	}
	//추상 메소드
	public abstract int getLateFees(int day);
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
