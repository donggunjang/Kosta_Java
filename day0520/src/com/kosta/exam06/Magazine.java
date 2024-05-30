package com.kosta.exam06;

public class Magazine extends Book {
	private String date;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Magazine(String title, int page, String author, String date) {
		super(title, page, author);
		this.date = date;
	}

	public Magazine() {
		super();
	}

	@Override
	public String toString() {
		return "Magazine [date=" + date + ", title=" + title + ", page=" + page + ", author=" + author + "]";
	}
	
}
