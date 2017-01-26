package exception;

public class PersonNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -470500567052703309L;

	public PersonNotFoundException() {
		super("찾는 사람 없음");
		// TODO Auto-generated constructor stub
	}

	public PersonNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public PersonNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public PersonNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public PersonNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
