package com.kosta.exam05;

public class Customer extends Person {
	private int no;
	private int mileage;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	public Customer(String name, String addr, String phone, int no, int mileage) {
		super(name, addr, phone); //부모의 매개변수를 요구하는 명령은 첫번재  문장에 와야 한다.
		this.no = no;
		this.mileage = mileage;
	}
	public Customer() {
		super();
	}
	
	public String toString() {
		String data ="";
		data +="이름:"+name;
		data +="주소:"+addr;
		data +="전화번호:"+phone;
		data +="고객번호:"+no;
		data +="마일리지:"+mileage;
		return data;
	}
	
	
	
}
