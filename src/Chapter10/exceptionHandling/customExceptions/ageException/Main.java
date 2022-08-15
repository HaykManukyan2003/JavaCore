package Chapter10.exceptionHandling.customExceptions.ageException;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("enter your age: ");
        int age = scanner.nextInt();

        try{
            checkAge(age);
        } catch (AgeException ageException) {
            System.out.println("error: " + ageException.getMessage());
        } finally {
            scanner.close();
        }

    }

    static void checkAge(int age) throws AgeException {
        if (age < 18) throw new AgeException();
        else System.out.println("you are now signed up!");
    }

}
