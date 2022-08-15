package folders.examples;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double height, weight;

        System.out.println("enter your height in meters: ");
        height = input.nextDouble();

        System.out.println("enter your weight in kg: ");
        weight = input.nextDouble();

        System.out.printf("Your folders.examples.BMI is %.1f", weight / (height * height));
    }
}
