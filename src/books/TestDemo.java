package books;

import books.commands.Commands;
import books.exceptions.AuthorNotFoundException;
import books.objects.Author;
import books.objects.Book;
import books.storages.AuthorStorage;
import books.storages.BookStorage;

import java.util.Scanner;

public class TestDemo implements Commands {

    private static final BookStorage bookStorage = new BookStorage();
    private static final AuthorStorage authorStorage = new AuthorStorage();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean isRunning = true;
        int command;

        while (isRunning) {

            Commands.commandRequests();

            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }

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
                    commandRequest(command);
                    bookStorage.displayBooksByAuthorName(valueFromScanner(command));
                    break;
                case DISPLAY_BOOKS_BY_GENRE:
                    commandRequest(command);
                    bookStorage.displayBooksByGenre(valueFromScanner(command));
                    break;
                case DISPLAY_BOOKS_BY_PRICE_RANGE:
                    commandRequest(command);
                    double min;
                    double max;
                    try {
                        min = Double.parseDouble(scanner.nextLine());
                        max = Double.parseDouble(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.err.println("conversion failed: Integer expected");
                        min = 0.00;
                        max = 0.00;
                    }
                    bookStorage.priceRangeSearch(min, max);
                    break;
                case DISPLAY_AUTHORS_BY_INDEX:
                    commandRequest(command);
                    authorStorage.displayAuthors();
                    try {
                        getAuthorByIndex();
                    } catch (NumberFormatException e) {
                        System.err.println("conversion failed: should be a number");
                    } catch (AuthorNotFoundException e) {
                        System.err.println(e);
                    }
                    break;
                default:
                    System.err.println("unreachable command, try again...");
            }

        }

    }

    private static void addABook() {

        System.out.println("Author's Info");
        Author author = addAuthor();

        System.out.println("Input book title");
        String bookTitle = scanner.nextLine();

        System.out.println("Input genre");
        String genre = scanner.nextLine();

        System.out.println("Input price");
        double price = 0.0;
        try {
            price = price();
        } catch (IllegalArgumentException e) {
            System.err.println("illegal argument, couldn't convert input to number:" +
                    " value for 'price' put to 0.0 due to error");
        }

        Book book = new Book(bookTitle, author, genre, price);
        System.out.println(book);

        System.out.println("Successfully added to library" + "\n");
        bookStorage.push(book);
    }

    private static Author addAuthor() {
        System.out.println("input Author's name");
        String name = scanner.nextLine();

        System.out.println("input Author's surname");
        String surname = scanner.nextLine();

        System.out.println("input email");
        String email = scanner.nextLine();

        System.out.println("input gender");
        String gender = gender();

        Author author = new Author(name, surname, email, gender);
        System.out.println(author);
        authorStorage.push(author);

        return author;
    }

    private static void getAuthorByIndex() throws AuthorNotFoundException {
        int index = Integer.parseInt(scanner.nextLine());
        authorStorage.getAuthorByIndex(index);
    }

    private static String gender() {
        do {
            String gender = scanner.nextLine();
            if (!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("female")) {
                System.err.println("wrong input for gender ... try again");
            } else return gender;
        } while (true);
    }

    private static void commandRequest(int command) {
        if (command == DISPLAY_BOOKS_BY_AUTHOR_NAME) {
            System.out.println("input author's name");
        }
        if (command == DISPLAY_BOOKS_BY_GENRE) {
            System.out.println("input genre");
        }
        if (command == DISPLAY_BOOKS_BY_PRICE_RANGE) {
            System.out.println("input the minimum and maximum price to start the range search");
        }
        if (command == DISPLAY_AUTHORS_BY_INDEX) {
            System.out.println("choose index");
        }
    }

    private static String valueFromScanner(int command) {
        String result = null;
        if (command == DISPLAY_BOOKS_BY_AUTHOR_NAME) {
            result = scanner.nextLine();
        }
        if (command == DISPLAY_BOOKS_BY_GENRE) {
            result = scanner.nextLine();
        }
        return result;
    }

    private static double price() {
        do {
            double price = Double.parseDouble(scanner.nextLine());
            if (price < 0.0) {
                System.err.println("can't input negative value for price ... try again");
            } else return price;
        } while (true);
    }

}
