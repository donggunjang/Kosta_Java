package com.kosta.exam20;

public class BankAccount {
	private double balance;
	public void deposit(int amount) {	//예금하는 메소드
		balance = balance + amount;
	}
	
	//잔액보다 더 큰 금액은 인출이 되지 않도록 한다.
	public void withdraw(int amount) {	//인출하는 메소드
		if(balance < amount) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		balance = balance - amount;
		
	}
	
	public double getBalance() {			//현재 잔고를 반환하는 메소드
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//현재 잔액 출력
	public void printBalance() {
		System.out.println("현재잔액:"+balance);
	}
	
	//현재 잔액에 대하여 연7.5%의 이자를 계산하여 추가하는 addInterest메소드 구현
	public void addIntereset() {
		balance = balance + (balance * 0.075);
	}
	public BankAccount() {
		
	}
}
