package folders.examples;

import java.util.Scanner;

public class ScannerExamples {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("type your surname..");
        String surname = scanner.nextLine();

        System.out.println("type your age..");
        int age = scanner.nextInt();

        scanner = new Scanner(System.in);

        System.out.println("type your name..");
        String name = scanner.nextLine();

        System.out.println("type your num..");
        int a = scanner.nextInt();

        scanner = new Scanner(System.in);

        System.out.println("tell me something niggaaa");
        String something = scanner.nextLine();

        System.out.println(name + " " + surname + " " + age + " " + something + a);
    }
}
