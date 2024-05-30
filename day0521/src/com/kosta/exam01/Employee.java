package com.kosta.exam01;

public class Employee {
	protected String name;
	protected String eno;
	
	public void computeSalary() {	//급여를 계산하는 메소드
		//월급제사원과 시간제 사원의 급여계산방식이 다르기 때문에
		//부모클래스를 만드는 시점에서 메소드의 body를 구체화 할 수 없다.
		//그래서 비워둔다.
	}

	public Employee(String name, String eno) {
		super();
		this.name = name;
		this.eno = eno;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
