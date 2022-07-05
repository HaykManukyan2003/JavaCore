package books.commands;

public interface Commands {

    int EXIT = 0;
    int ADD_A_BOOK = 1;
    int DISPLAY_ALL_BOOKS = 2;
    int DISPLAY_BOOKS_BY_AUTHOR_NAME = 3;
    int DISPLAY_BOOKS_BY_PRICE_RANGE = 4;
    int DISPLAY_BOOKS_BY_GENRE = 5;
    int DISPLAY_AUTHORS_BY_INDEX = 6;

    static void commandRequests() {
        System.out.println("Input '0' to exit the program");
        System.out.println("Input '1' to add a book");
        System.out.println("Input '2' to display all the books");
        System.out.println("Input '3' to search books by author name");
        System.out.println("Input '4' to search books by price range");
        System.out.println("Input '5' to search books by genre");
        System.out.println("Input '6' to get author by index");
        System.out.println();
    }

}
