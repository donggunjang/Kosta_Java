package com.kosta.exam16;

class BankAccount{
	private String name;
	private String acnumber;
	private int money;
	private double rate;
	
	public BankAccount(String name, String acnumber, int money, double rate) {
		this.name = name;
		this.acnumber = acnumber;
		this.money = money;
		this.rate = rate;
	}
	
	public BankAccount() {
		
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAcnumber() {
		return acnumber;
	}
	public void setAcnumber(String acnumber) {
		this.acnumber = acnumber;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
}

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount("장동건","352-0000-0000-00",10000000,5.5);
		
		System.out.println(b1.getName()+", "+b1.getAcnumber()+", "+b1.getMoney()+", "+b1.getRate()+"%");
		System.out.println(b2.getName()+", "+b2.getAcnumber()+", "+b2.getMoney()+", "
		+b2.getRate()+"%");
	}
}

