package com.kosta.exam01;

public class HourlyEmployee extends Employee {
	private int salary;		// 실수령액
	private int time;		// 일한시간
	private int timesalary; // 시간당 임금
	
	
	@Override
	public void computeSalary() {
		salary = time * timesalary;
	}
	
	@Override
	public String toString() {
		return "HourlyEmployee [salary=" + salary + ", time=" + time + ", timesalary=" + timesalary + ", name=" + name
				+ ", eno=" + eno + "]";
	}

	public HourlyEmployee(String name, String eno, int timesalary, int time) {
		super(name, eno);
		this.timesalary = timesalary;
		this.time = time;
	}
	
	
	public HourlyEmployee() {
		super();
		// TODO Auto-generated constructor stub
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

	

	
	
	
}


