package exception;

public class DuplicateTelException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7594729680707576735L;

	public DuplicateTelException() {
		super("번호중복");
		// TODO Auto-generated constructor stub
	}

	public DuplicateTelException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public DuplicateTelException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DuplicateTelException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DuplicateTelException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
