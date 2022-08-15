package Chapter10.exceptionHandling.tryCatchExamples;

import java.util.Scanner;

public class TryCatchExamples {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("whats your favourite number? ");

        try {
            int n = scan.nextInt();
            System.out.println(n);
        } catch (Exception e) {
            System.out.println("please enter a number");
        }

        scan.close();

        try {

            int[] a = null;
            System.out.println(a[1]);

        } catch (NullPointerException e) {

            System.out.println("your array is null");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("your index is out of bounds");

        } catch (Exception e) {

            System.out.println("something else went wrong");

        }

        try {
            int a = 0;
            int b = 4 / a;
            System.out.println("this will not be printed");

        } catch (ArithmeticException e) {
            System.out.println("division by zero not allowed");

        }
        System.out.println("after catch statement");


    }
}
