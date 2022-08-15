package folders.examples;

import java.util.Scanner;

public class SeparatingTheDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, temp, digit, count = 0;

        System.out.print("Enter any number:");
        num = input.nextInt();

        temp = num;

        while(num > 0) {
            num = num / 10;

            count++;
        }

        while(temp > 0) {
            digit = temp % 10;

            System.out.println("Digit at place " + count + " is:" + digit);

            temp = temp / 10;

            count --;
        }
    }
}
