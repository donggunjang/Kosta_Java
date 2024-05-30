package com.kosta.exam05;

public class Poet extends Book {
	@Override
	public int getLateFees(int day) {
		return day*200;
	}

	public Poet(String number, String title, String author) {
		super(number, title, author);
	}

	public Poet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
