import java.util.Scanner;

class NegativeBalanceException extends Exception{
	public NegativeBalanceException(String message){
		super(message);
	}
}

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
		System.out.println(money+"원을 입금 하였습니다.");
	}

	public void withdraw(int money) throws NegativeBalanceException{
		if(balance < money){
			throw new NegativeBalanceException("잔고가 부족 합니다.");
		}else{
			balance = balance - money;
			System.out.println(money+"원을 출금 하였습니다. 잔액:"+balance);
		}
	}


}

class BankAccountTest{
	public static void main(String[] args) {
		try{
			BankAccount b1 = new BankAccount(1000);
			b1.deposit(10000);
			b1.withdraw(100000);
		}catch(NegativeBalanceException e){
			System.out.println("예외발생:"+e.getMessage());
		}
	}
}
