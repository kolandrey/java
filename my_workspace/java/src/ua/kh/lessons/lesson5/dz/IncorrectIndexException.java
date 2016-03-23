package ua.kh.lessons.lesson5.dz;

public class IncorrectIndexException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IncorrectIndexException() {
		super();
	}

	public IncorrectIndexException(String message, Throwable cause) {
		super(message, cause);
	}

	public IncorrectIndexException(String message) {
		super(message);
	}

}
