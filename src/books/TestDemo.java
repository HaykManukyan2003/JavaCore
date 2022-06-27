package books;

import java.util.Scanner;

public class TestDemo implements Commands {

    private static final BookStorage bookStorage = new BookStorage();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean isRunning = true;
        int command;

        while (isRunning) {

            System.out.println("Input '0' to exit the program");
            System.out.println("Input '1' to add a book");
            System.out.println("Input '2' to display all the books");
            System.out.println("Input '3' to search books by author name");
            System.out.println("Input '4' to search books by price range");
            System.out.println("Input '5' to search books by genre");

            System.out.print("\n");

            command = Integer.parseInt(scanner.nextLine());

            switch (command) {
                case EXIT:
                    isRunning = false;
                    break;
                case ADD_A_BOOK:
                    addABook();
                    break;
                case DISPLAY_ALL_BOOKS:
                    bookStorage.displayAllBooks();
                    break;
                case DISPLAY_BOOKS_BY_AUTHOR_NAME:
                    System.out.println("input author's name");
                    String authorName = scanner.nextLine();
                    bookStorage.displayBooksByAuthorName(authorName);
                    break;
                case DISPLAY_BOOKS_BY_GENRE:
                    System.out.println("input genre");
                    String genre = scanner.nextLine();
                    bookStorage.displayBooksByGenre(genre);
                    break;
                case DISPLAY_BOOKS_BY_PRICE_RANGE:
                    System.out.println("input the minimum price range");
                    double min = Double.parseDouble(scanner.nextLine());

                    System.out.println("input the maximum price range");
                    double max = Double.parseDouble(scanner.nextLine());

                    bookStorage.priceRangeSearch(min, max);
                    break;
                default:
                    System.err.println("unreachable command, try again...");
            }

        }

    }

    private static void addABook() {
        System.out.println("Input book title");
        String bookTitle = scanner.nextLine();

        System.out.println("Input author's name");
        String authorName = scanner.nextLine();

        System.out.println("Input genre");
        String genre = scanner.nextLine();

        System.out.println("Input price");
        double price = Double.parseDouble(scanner.nextLine());

        Book book = new Book(bookTitle, authorName, genre, price);
        System.out.println(book);

        System.out.println("Successfully added to library" + "\n");
        bookStorage.push(book);
    }



}
