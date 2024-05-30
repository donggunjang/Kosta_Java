package com.kosta.exam05;

public class ScienceFiction extends Book {
	@Override
	public int getLateFees(int day) {
		return day*600;
	}

	public ScienceFiction(String number, String title, String author) {
		super(number, title, author);
	}

	public ScienceFiction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
