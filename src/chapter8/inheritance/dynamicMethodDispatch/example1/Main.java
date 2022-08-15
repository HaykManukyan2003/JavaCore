package chapter8.inheritance.dynamicMethodDispatch.example1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("what animal do you want?");
        System.out.print("(1 = dog) (2 = cat): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        } else {
            animal = new Animal();
            animal.speak();
        }

        scanner.close();
    }
}
