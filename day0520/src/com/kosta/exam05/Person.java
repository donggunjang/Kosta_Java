package com.kosta.exam05;

public class Person {
	protected String name;
	protected String addr;
	protected String phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Person(String name, String addr, String phone) {
		super();
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}
	public Person() {
		super();
	}
	
	public String toString() {
		String data ="";
		data +="이름:"+name;
		data +="주소:"+addr;
		data +="전화번호:"+phone;
		return data;
	}
	
	
	
}
