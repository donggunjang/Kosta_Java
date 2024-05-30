package com.kosta.exam02;

class Book{
	private String title;
	private String author;
	
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
		Book b2 = new Book();
		b1.setTitle("재미있는 자바");
		b2.setTitle("신나는 자바");
		b1.setAuthor("홍길동");
		b2.setAuthor("흥부");
		
		//책 제목,저자 출력
		System.out.printf("제목: %s\t",b1.getTitle());
		System.out.printf("저자: %s\n",b1.getAthor());
		System.out.printf("제목: %s\t",b2.getTitle());
		System.out.printf("저자: %s\n",b2.getAthor());
	}
}
