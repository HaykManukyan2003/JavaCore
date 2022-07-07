package books;

import books.commands.Commands;
import books.enumeration.Gender;
import books.customException.AuthorNotFoundException;
import books.model.Author;
import books.model.Book;
import books.storage.AuthorStorage;
import books.storage.BookStorage;

import java.util.Scanner;

public class TestDemo implements Commands {

    private static final BookStorage bookStorage = new BookStorage();
    private static final AuthorStorage authorStorage = new AuthorStorage();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws AuthorNotFoundException {

        logIn();

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
                    System.out.println();
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
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case DISPLAY_AUTHORS:
                    authorStorage.displayAuthors();
                    System.out.println();
                    break;
                default:
                    System.err.println("invalid command, try again...");
            }

        }

    }

    private static void logIn() {
        do {
            System.out.println("Login: ");
            String login = scanner.nextLine();
            System.out.println("Password: ");
            String password = scanner.nextLine();
            if (!(login.equals("admin")) || !(password.equals("123456"))) {
                System.err.println("access denied: invalid login or password.");
            } else {
                System.out.println("logged in" + "\n");
                return;
            }
        } while (true);
    }

    private static void addABook() {
        Author author;
        if (authorStorage.getCount() == 0) {
            System.err.println("cannot create a book without an Author");
            System.out.println("Create author first" + "\n");
            author = addAuthor();
        } else {
            try {
                author = getAuthorByIndex();
            } catch (AuthorNotFoundException e) {
                System.err.println(e.getMessage());
                return;
            } catch (NumberFormatException e) {
                System.err.println("failed to convert value of input to number.");
                return;
            }
        }

        System.out.println("Input book title");
        String bookTitle = scanner.nextLine();

        System.out.println("Input genre");
        String genre = scanner.nextLine();

        System.out.println("Input price");
        double price;
        try {
            price = price();
        } catch (NumberFormatException e) {
            System.err.println("failed to convert value of input to number.");
            System.out.println("value for price was automatically put to 0.00 due to error" + "\n");
            price = 0.00;
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

        Gender gender = gender();

        Author author = new Author(name, surname, email, gender);
        System.out.println(author);
        authorStorage.push(author);
        System.out.println();

        return author;
    }

    private static Gender gender() {
        do {
            System.out.println("Select gender");
            Gender[] values = Gender.values();
            for (Gender value : values) {
                System.out.print(value + "   ");
            }
            System.out.println();

            String input = scanner.nextLine();
            try {
                if (!(Gender.valueOf(input).equals(Gender.Male)) && !(Gender.valueOf(input).equals(Gender.Female))) {
                    throw new IllegalArgumentException();
                } else {
                    return Gender.valueOf(input);
                }
            } catch (IllegalArgumentException e) {
                System.err.println("no such option: try again");
            }
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
        int attempts = 1;
        do {
            double price = Double.parseDouble(scanner.nextLine());
            if (price < 0.0) {
                System.err.println("attempt " + attempts + "/3 : " + "cannot input negative value for price.");
            } else return price;
        } while (++attempts <= 3);
        System.err.println("All attempts to sign a value for price were failed: price automatically put to 0.00");
        return 0.00;
    }

    private static Author getAuthorByIndex() throws AuthorNotFoundException {
        System.out.println("Which author you want for this book? choose an index");
        authorStorage.displayAuthors();
        int index = Integer.parseInt(scanner.nextLine());
        return authorStorage.getAuthorByIndex(index);
    }

}