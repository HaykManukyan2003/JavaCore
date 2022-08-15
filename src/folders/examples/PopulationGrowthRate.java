package folders.examples;

import java.util.Scanner;

public class PopulationGrowthRate {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number to see the world's approximate population: ");
        int year = input.nextInt();

        long worldPopulation = 7900000000L;
        long growthRate = 75000000;

        worldPopulation = (worldPopulation + (year * growthRate));
        System.out.println("from " + year + "years population will be around " + worldPopulation);
    }
}
