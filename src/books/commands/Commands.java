package books.commands;

public interface Commands {

    int EXIT = 0;
    int ADD_AUTHOR = 1;
    int ADD_A_BOOK = 2;
    int DISPLAY_ALL_BOOKS = 3;
    int DISPLAY_AUTHORS = 4;
    int DISPLAY_BOOKS_BY_AUTHOR_NAME = 5;
    int DISPLAY_BOOKS_BY_PRICE_RANGE = 6;
    int DISPLAY_BOOKS_BY_GENRE = 7;

    int LOG_IN = 1;
    int REGISTER = 2;

    static void commandRequestsForAdmin() {
        System.out.println("Input '0' to log out");
        System.out.println("Input '1' to add an author");
        System.out.println("Input '2' to add a book");
        System.out.println("Input '3' to display all the books");
        System.out.println("Input '4' to display authors");
        System.out.println("Input '5' to search books by author name");
        System.out.println("Input '6' to search books by price range");
        System.out.println("Input '7' to search books by genre");
        System.out.println();
    }

    int LOG_OUT = 0;
    int ADD_A_BOOK_BY_USER = 1;
    int DISPLAY_ALL_BOOKS_BY_USER = 2;
    int DISPLAY_BOOKS_BY_AUTHOR_NAME_BY_USER = 3;
    int DISPLAY_BOOKS_BY_PRICE_RANGE_BY_USER = 4;
    int DISPLAY_BOOKS_BY_GENRE_BY_USER = 5;

    static void commandRequestsForUser() {
        System.out.println("Input '0' to log out");
        System.out.println("Input '1' to add a book");
        System.out.println("Input '2' to display all the books");
        System.out.println("Input '3' to search books by author name");
        System.out.println("Input '4' to search books by price range");
        System.out.println("Input '5' to search books by genre");
        System.out.println();
    }

    static void mainCommandsRequest() {
        System.out.println("Input '0' to exit the program");
        System.out.println("Input '1' to log in");
        System.out.println("Input '2' to register");
        System.out.println();
    }

}
