package com.kosta.exam08;

class Employee {
	private String name;
	private String phoneNumber;
	private int pay;
	
	//생성자
	public Employee() {
		name ="장동건";
		phoneNumber ="010-1234-5678";
		pay = 50000000;
	}
	
	
	public void setName(String n) {
		name = n;
		return;
	}
	
	public void setphoneNumber(String pN) {
		phoneNumber = pN;
		return;
	}
	
	public void setPay(int p) {
		pay = p;
		return;
	}
	
	public String getName() {
		return name;
	}
	
	public String getphoneNumber() {
		return phoneNumber;
	}
	
	public int getPay() {
		return pay;
	}
	
	
	
}

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		System.out.printf("이름:"+emp.getName());
		System.out.println("연봉:"+emp.getPay());
		System.out.println("전화번호:"+emp.getphoneNumber());
		
	}
}
