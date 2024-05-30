package com.kosta.exam11;


class Movie {
	private String title;
	private String director;
	private String pdcompany;
	
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setdirector(String director) {
		this.director = director;
	}
	public void setPdcompany(String pdcompany) {
		this.pdcompany = pdcompany;
	}
	
	public String getTitle() {
		return title;
	}
	public String getdirector() {
		return director;
	}
	public String getPdcompany() {
		return pdcompany;
	}
	
}
public class MovieTest {
	public static void main(String[] args) {
		Movie m = new Movie(); //자바는 사용자가 생성자를 만들지 않아도 기본 생성자(매개변수를 갖지 않는)를 제공
		System.out.println(m.getTitle()+","+m.getdirector()+","+m.getPdcompany());
	}
}
