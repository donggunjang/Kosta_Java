package com.kosta.exam07;

public class EmployeeTest {
	public static void main(String[] args) {
		SalarieEmployee e1 = new SalarieEmployee("장동건","A1001",1);
		SalarieEmployee e2 = new SalarieEmployee("추혁수","A1002",2);
		HourlyEmployee h1 = new HourlyEmployee("강재호","H0001", 100000, 20);
		
		e1.computeSalary();
		e2.computeSalary();
		h1.computeSalary();
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(h1);
	}
}
