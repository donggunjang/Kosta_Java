package com.kosta.exam10;


class Movie {
	private String title;
	private String director;
	private String pdcompany;
	
	public Movie(String title, String director, String pdcompany){
		this.title = title;
		this.director = director;
		this.pdcompany = pdcompany;
	}
	
	public Movie() {
		// 다른 생성자를 요구하는 this()는 생성자의 첫번째 문장에 와야 한다.
		this("제목없음","저자없음","제작사없음");
	}
	
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
		Movie m1 = new Movie("범죄도시4","윤태웅","CGV");
		Movie m2 = new Movie();
		
		System.out.println(m1.getTitle()+","+m1.getdirector()+","+m1.getPdcompany());
		System.out.println(m2.getTitle()+","+m2.getdirector()+","+m2.getPdcompany());
	}
}
