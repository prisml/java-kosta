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
			System.out.println("�߸��� �ݾ��Դϴ�");
	}

	public void deposit(int balance) {
		if (balance >= 0)
			this.balance += balance;
		else
			System.out.println("�߸��� �ݾ��Դϴ�");
	}
	
	public void withdraw(int balance) {
		if(this.balance < balance)
			System.out.println("�ܾ��� �����մϴ�");
		else if(balance > 0)
			this.balance -= balance;
		else
			System.out.println("�߸��� �ݾ��Դϴ�");
	}
}
