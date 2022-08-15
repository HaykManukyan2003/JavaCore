package folders.examples;

import java.util.Scanner;

public class CarPoolSavingsCalc {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double milesPerDay, costPerGallon, averageMilesPerGallon, parkingFeesPerDay, tollsPerDay;

        System.out.println("miles per day: ");
        milesPerDay = input.nextDouble();

        System.out.println("cost per gallon: ");
        costPerGallon = input.nextDouble();

        System.out.println("average miles per gallon: ");
        averageMilesPerGallon = input.nextDouble();

        System.out.println("parking fees per day: ");
        parkingFeesPerDay = input.nextDouble();

        System.out.println("tolls per day: ");
        tollsPerDay = input.nextDouble();

        double dailyCost = ((milesPerDay / averageMilesPerGallon) * costPerGallon) + parkingFeesPerDay + tollsPerDay;

        System.out.printf("Daily driving cost is %.2f", dailyCost);
    }
}
