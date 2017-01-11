package step6;

public class TestIf4 {
	public static void main(String[] args) {
		Account a = new Account();
		a.setBalance(100);
		System.out.println(a.getBalance());
		a.setBalance(0);
		a.deposit(200);
		System.out.println(a.getBalance());
		a.deposit(-200);
		System.out.println(a.getBalance());
		a.withdraw(150);
		System.out.println(a.getBalance());
		a.withdraw(50);
		System.out.println(a.getBalance());
		a.withdraw(0);
		System.out.println(a.getBalance());
		a.withdraw(150);
		System.out.println(a.getBalance());
	}
}
