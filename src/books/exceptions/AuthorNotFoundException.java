package books.exceptions;

public class AuthorNotFoundException extends Exception {

    public AuthorNotFoundException() {
    }

    public AuthorNotFoundException(String message) {
        super(message);
    }
}
