
package com.kosta.book;

import javax.swing.JFrame;

public class BookVO{
	private int bookid;
	private String bookname;
	private int price;
	private String pubhlisher;
	public BookVO(int bookid, String bookname, int price, String pubhlisher) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.price = price;
		this.pubhlisher = pubhlisher;
	}
	public BookVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPubhlisher() {
		return pubhlisher;
	}
	public void setPubhlisher(String pubhlisher) {
		this.pubhlisher = pubhlisher;
	}
	
	

}
