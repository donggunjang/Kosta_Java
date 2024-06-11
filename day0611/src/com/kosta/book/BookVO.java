package com.kosta.book;

import javax.swing.JFrame;

public class BookVO{
	private int bookid;
	private String bookname;
	private int price;
	private int salepice;
	private String orderdate;
	private int custid;
	private String name;
	private String phone;
	private String pubhlisher;
	
	public BookVO(int bookid, String bookname, int price, int salepice, String orderdate, int custid, String name,
			String phone, String pubhlisher) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.price = price;
		this.salepice = salepice;
		this.orderdate = orderdate;
		this.custid = custid;
		this.name = name;
		this.phone = phone;
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
	public int getSalepice() {
		return salepice;
	}
	public void setSalepice(int salepice) {
		this.salepice = salepice;
	}
	public String getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPubhlisher() {
		return pubhlisher;
	}
	public void setPubhlisher(String pubhlisher) {
		this.pubhlisher = pubhlisher;
	}
	
}