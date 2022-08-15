package Chapter10.exceptionHandling.tryCatchExamples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinallyExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("enter a number to divide: ");
            int a = scanner.nextInt();

            System.out.println("enter a number to divide by: ");
            int b = scanner.nextInt();

            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException ae) {
            System.out.println(ae + ": can't divide by zero");
        } catch (InputMismatchException ime) {
            System.out.println(ime + ": should be a number!");
        } catch (Exception e) {
            System.out.println(e + ": something went wrong");
        } finally {
            scanner.close();
        }

        System.out.println("end of the example");

    }
}
