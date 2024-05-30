package com.kosta.exam02;

class BankAccount{
	private int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int money) {
		balance = balance + money;
		System.out.println(money+"원을 입금 하였습니다 잔액:"+balance+"원");
	}

	public void withdraw(int money) throws NegativeBalanceException{
		if(balance < money){
			throw new NegativeBalanceException("잔고가 부족 합니다.");
		}else{
			balance = balance - money;
			System.out.println(money+"원을 출금 하였습니다. 잔액:"+balance+"원");
		}
	}


}