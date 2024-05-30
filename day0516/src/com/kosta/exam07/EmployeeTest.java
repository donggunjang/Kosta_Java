package com.kosta.exam07;

class Employee {
	private String name;
	private String phoneNumber;
	private int pay;
	
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
		emp.setName("장동건");
		emp.setphoneNumber("010-1111-3456");
		emp.setPay(1000000000);
		
		Employee emp2 = new Employee();
		emp2.setName("이동건");
		emp2.setphoneNumber("010-1234-3457");
		emp2.setPay(1000000);
		
		System.out.println("이름:"+emp.getName());
		System.out.println("연봉:"+emp.getPay());
		System.out.println("전화번호:"+emp.getphoneNumber());
		
		System.out.println("이름:"+emp2.getName());
		System.out.println("연봉:"+emp2.getPay());
		System.out.println("전화번호:"+emp2.getphoneNumber());
	}
}
