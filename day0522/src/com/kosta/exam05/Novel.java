package com.kosta.exam05;

public class Novel extends Book {
	@Override
	public int getLateFees(int day) {
		return day*300;
	}

	public Novel(String number, String title, String author) {
		super(number, title, author);
	}

	public Novel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
