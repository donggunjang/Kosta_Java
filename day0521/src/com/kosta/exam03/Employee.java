package com.kosta.exam03;

public abstract class Employee {
	protected String name; 	//이름
	protected String no;	//사번
	public Employee(String name, String no) {
		super();
		this.name = name;
		this.no = no;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public abstract void computeSalary();	//급여를 계산하는 코드
	
}
