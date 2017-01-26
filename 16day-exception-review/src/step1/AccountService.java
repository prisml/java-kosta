package step1;

public class AccountService {

	public void deposit(int money) throws InvalidMoneyException{
		if(money <= 0)
			throw new InvalidMoneyException();
		System.out.println(money+"원 입금 완료");
		
	}

}
