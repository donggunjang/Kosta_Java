package com.kosta.exam21;

// addInterest메소드의 동작방식을 변경했을때 호출한 쪽에서 수정할 부분은 없느데
// 맴버변수인 balance의 자료형은 int에서 double로 변경하면 호출한쪽 에서도 수정해줘야한다.

// 파일명과 통일한 클래스에만 public을 입력한다.
class BankAccount{
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
	
	public static void main() {
		System.out.println("hello");
	}
	
}

public class BankAccountTest {
	public static void main(String[] args) {
		//a1,a2 두개의 BankAccount객체를 생성
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount();
		
		//a1,a2의 잔고를 각각 100,50으로 초기화
		int b1 = 10000;
		a1.setBalance(b1);
		
		int b2 = 5000;
		a2.setBalance(b2);
		
		//a1에서 60을 인출
		a1.withdraw(6000);
		//a2에서 30을 인출
		a2.withdraw(3000);
		
		//a1,a2의 잔고를 얻어서 화면에 출력
		double balance1 = a1.getBalance();
		System.out.println(balance1);
		
		double balance2 = a2.getBalance();
		System.out.println(balance2);
		
		a1.addIntereset();
		a2.addIntereset();
		
		a1.printBalance();
		a2.printBalance();
		
		a1.withdraw(100000);
		a1.printBalance();
	}
}

