package books.customException;

public class AuthorNotFoundException extends Exception {

    public AuthorNotFoundException() {
    }

    public AuthorNotFoundException(String message) {
        super(message);
    }
}
