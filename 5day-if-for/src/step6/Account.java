package step6;

public class Account {
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance > 0)
			this.balance = balance;
		else
			System.out.println("잘못된 금액입니다");
	}

	public void deposit(int balance) {
		if (balance >= 0)
			this.balance += balance;
		else
			System.out.println("잘못된 금액입니다");
	}
	
	public void withdraw(int balance) {
		if(this.balance < balance)
			System.out.println("잔액이 부족합니다");
		else if(balance > 0)
			this.balance -= balance;
		else
			System.out.println("잘못된 금액입니다");
	}
}
