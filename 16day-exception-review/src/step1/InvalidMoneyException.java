package step1;

public class InvalidMoneyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2822310619334321249L;

	public InvalidMoneyException() {
		super("잘못된 금액입니다");
	}

	public InvalidMoneyException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	public InvalidMoneyException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public InvalidMoneyException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public InvalidMoneyException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}
