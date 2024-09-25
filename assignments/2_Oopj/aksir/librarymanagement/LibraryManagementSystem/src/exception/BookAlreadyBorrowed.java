package exception;

public class BookAlreadyBorrowed extends Exception {

	public BookAlreadyBorrowed(String message) {
		super(message);
	}
}
