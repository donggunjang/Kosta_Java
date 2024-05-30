package com.kosta.exam07;

public class HourlyEmployee extends Employee {
	private int salary;		// 실수령액
	private int time;		// 일한시간
	private int timesalary; // 시간당 임금
	
	
	
	@Override
	public String toString() {
		return "HourlyEmployee [salary=" + salary + ", time=" + time + ", timesalary=" + timesalary + ", name=" + name
				+ ", eno=" + eno + "]";
	}

	public HourlyEmployee(String name, String eno, int salary, int time) {
		super(name, eno);
		this.salary = salary;
		this.time = time;
	}
	
	public void computSalary() { // 시급으로 받는 월급
		salary = timesalary * time;
		System.out.println(salary+"원");
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getTimesalary() {
		return timesalary;
	}

	public void setTimesalary(int timesalary) {
		this.timesalary = timesalary;
	}

	public HourlyEmployee(String name, String eno, int salary, int time, int timesalary) {
		super(name, eno);
		this.salary = salary;
		this.time = time;
		this.timesalary = timesalary;
	}

	public HourlyEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}


