package com.kosta.exam17;

class BankAccount{
	private int balance;
	
	public void deposit(int amount) {	//예금하는 메소드
		balance = balance + amount;
	}
	
	public void withdraw(int amount) {	//인출하는 메소드
		balance = balance - amount;
	}
	
	public int getBalance() {			//현재 잔고를 반환하는 메소드
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
		balance = (int)(balance + (balance * 0.075));
	}
	public BankAccount() {
		
	}
	
}

public class BankAccountTest {
	public static void main(String[] args) {
		//a1,a2 두개의 BankAccount객체를 생성
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount();
		
		//a1,a2의 잔고를 각각 100,50으로 초기화
		a1.setBalance(1000000);
		a2.setBalance(500000);
		//a1에서 60을 인출
		a1.withdraw(60000);
		//a2에서 30을 인출
		a2.withdraw(30000);
		
		//a1,a2의 잔고를 얻어서 화면에 출력
		System.out.println(a1.getBalance());
		System.out.println(a2.getBalance());
		
		a1.addIntereset();
		a2.addIntereset();
		
		a1.printBalance();
		a2.printBalance();
		
		
		
	}
}

