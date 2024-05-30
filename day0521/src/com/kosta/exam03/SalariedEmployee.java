package com.kosta.exam03;

public class SalariedEmployee extends Employee {
	private int salary;		//월급
	private int level;		//호봉
	private int base;		//기본금
	private int allowances; //수당
	
	
	
	@Override
	public void computeSalary() {
			switch(level) {
				case 1: base = 4000000;allowances=400000;break;
				case 2: base = 5000000;allowances=500000;break;
				case 3: base = 6000000;allowances=600000;break;				
			}
			salary = base+allowances;
	}
	
	
	@Override
	public String toString() {
		return "SalariedEmployee [salary=" + salary + ", level=" + level + ", base=" + base + ", allowances="
				+ allowances + ", name=" + name + ", no=" + no + "]";
	}
	public SalariedEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SalariedEmployee(String name, String no, int level) {
		super(name, no);
		this.level = level;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAllowances() {
		return allowances;
	}
	public void setAllowances(int allowances) {
		this.allowances = allowances;
	}

	
}
