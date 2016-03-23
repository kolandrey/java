package ua.kh.lessons.lesson4.dz2;

public class IncorrectMatrixSizeException extends RuntimeException {
	public IncorrectMatrixSizeException() {
		super();
	}

	public IncorrectMatrixSizeException(String message, Throwable cause) {
		super(message, cause);
	}

	public IncorrectMatrixSizeException(String message) {
		super(message);
	}

}
