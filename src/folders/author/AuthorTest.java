package folders.author;

import java.util.Scanner;

public class AuthorTest {

    static Scanner scanner = new Scanner(System.in);

    static AuthorStorage authorStorage = new AuthorStorage();

    private static void searchByName() {
        System.out.println("input the name");
        String findName = scanner.nextLine();
        authorStorage.searchByName(findName);
    }

    public static void addAuthor() {
        System.out.println("Author's data. ");
        Author author = new Author();

        System.out.println("Input folders.author's name");
        author.setName(scanner.nextLine());

        System.out.println("Input folders.author's surname");
        author.setSurname(scanner.nextLine());

        System.out.println("Input folders.author's gender");
        String gender = scanner.nextLine();
        if (!"MALE".equalsIgnoreCase(gender) && !"FEMALE".equalsIgnoreCase(gender)) {
            System.err.println("wrong gender");
            return;
        }
        author.setGender(gender);

        System.out.println("Input folders.author's email");
        author.setEmail(scanner.nextLine());

        System.out.println("Input folders.author's age");
        author.setAge(Integer.parseInt(scanner.nextLine()));

        authorStorage.add(author);
    }

    public static void main(String[] args) {

        boolean run = true;
        while (run) {
            System.out.println("Type '0' to exit");
            System.out.println("Type '1' to add an folders.author");
            System.out.println("Type '2' to search an folders.author by name");
            System.out.println("Type '3' to print all authors");

            int command;

            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }

            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    addAuthor();
                    break;
                case 2:
                    searchByName();
                    break;
                case 3:
                    authorStorage.print();
                    break;
                default:
                    System.err.println("wrong command");
            }
        }

    }
}
