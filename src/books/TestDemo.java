package books;

import books.commands.Commands;
import books.enumeration.Gender;
import books.customException.AuthorNotFoundException;
import books.model.Author;
import books.model.Book;
import books.model.Role;
import books.model.User;
import books.storage.AuthorStorage;
import books.storage.BookStorage;
import books.storage.UserStorage;

import java.util.Date;
import java.util.Scanner;

public class TestDemo implements Commands {

    private static final BookStorage bookStorage = new BookStorage();
    private static final AuthorStorage authorStorage = new AuthorStorage();
    private static final Scanner scanner = new Scanner(System.in);
    private static final UserStorage userStorage = new UserStorage();
    static User currentUser = null;

    public static void main(String[] args) throws AuthorNotFoundException {

        userStorage.push(new User("admin", "admin", "admin@mail.ru", "admin", Role.ADMIN));

        do {
            Commands.mainCommandsRequest();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }

            switch (command) {
                case EXIT:
                    System.exit(0);
                case LOG_IN:
                    logIn();
                    break;
                case REGISTER:
                    register();
                    break;
                default:
                    System.err.println("invalid command, try again...");
            }
        } while (true);

    }

    private static void logIn() {
        System.out.println("Input email & password to log in");
        String loginPassword = scanner.nextLine();
        String[] loginData = loginPassword.split(",");
        User user = userStorage.getUserByEmail(loginData[0]);
        if (user == null) {
            System.err.println("user does not exist");
        } else if (!user.getPassword().equals(loginData[1])) {
            System.err.println("incorrect password");
        } else {
            if (user.getRole() == Role.ADMIN) {
                currentUser = user;
                System.out.println("logged in" + "\n");
                logInAsAdmin();
            } else if (user.getRole() == Role.USER) {
                currentUser = user;
                System.out.println("logged in" + "\n");
                logInAsUser();
            }
        }
    }

    private static void register() {
        System.out.println("Input name, surname, email and password to register");
        String userInfo = scanner.nextLine();
        String[] userData = userInfo.split(",");
        if (userData.length < 4) {
            System.err.println("register info is not complete");
        } else {
            if (userStorage.getUserByEmail(userData[2]) == null) {
                User user = new User();
                user.setName(userData[0]);
                user.setSurname(userData[1]);
                user.setEmail(userData[2]);
                user.setPassword(userData[3]);
                user.setRole(Role.USER);
                userStorage.push(user);
                System.out.println(user);
                System.out.println("Registration completed successfully" + "\n");
            } else {
                System.err.println("An account with email '" + userData[2] + "' already exists");
            }
        }
    }

    private static void logInAsUser() {
        int command;
        do {
            Commands.commandRequestsForUser();

            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }

            switch (command) {
                case LOG_OUT:
                    currentUser = null;
                    System.exit(0);
                case ADD_A_BOOK_BY_USER:
                    addABook();
                    break;
                case DISPLAY_ALL_BOOKS_BY_USER:
                    bookStorage.displayAllBooks();
                    System.out.println();
                    break;
                case DISPLAY_BOOKS_BY_AUTHOR_NAME_BY_USER:
                    commandRequest(command);
                    bookStorage.displayBooksByAuthorName(valueFromScanner(command));
                    break;
                case DISPLAY_BOOKS_BY_GENRE_BY_USER:
                    commandRequest(command);
                    bookStorage.displayBooksByGenre(valueFromScanner(command));
                    break;
                case DISPLAY_BOOKS_BY_PRICE_RANGE_BY_USER:
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
                default:
                    System.err.println("invalid command, try again...");
            }
        } while (true);
    }

    private static void logInAsAdmin() {
        boolean isRunning = true;
        int command;

        while (isRunning) {

            Commands.commandRequestsForAdmin();

            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }

            switch (command) {
                case LOG_OUT:
                    currentUser = null;
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

        Book book = new Book(bookTitle, author, genre, price, currentUser);
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

        Author author = new Author(name, surname, email, gender, new Date());
        System.out.println(author);
        authorStorage.push(author);
        System.out.println();

        return author;
    }

    private static Gender gender() {
        selectGender();

        String input = scanner.nextLine();
        Gender gender;
        try {
            gender = Gender.valueOf(input.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.err.println("no such option: try again");
            gender = gender();
        }
        return gender;
    }

    private static void selectGender() {
        System.out.println("Select gender");
        Gender[] values = Gender.values();
        for (Gender value : values) {
            System.out.print(value + "   ");
        }
        System.out.println();
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