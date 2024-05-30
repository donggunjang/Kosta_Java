package com.kosta.exam02;

//접근명시자를 생략하면
//default 접근명시자로써
//동일한 패키지에 잇는 클래스들에게만 접근을 허용한다.
//아무리 상속받은 자식이라 하더라도 동일한 패키지에 있지 않으면 접근 할 수 없다.
//상속받은 자식 클래스에게 접근을 허용하려면 protected를 사용해야 한다.
public class A {
	protected String title;
	protected int year;
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
