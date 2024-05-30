package com.kosta.exam20;

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

