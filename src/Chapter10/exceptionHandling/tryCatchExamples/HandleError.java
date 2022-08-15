package Chapter10.exceptionHandling.tryCatchExamples;

import java.util.Random;

public class HandleError {

    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int c = 0;

        Random random = new Random();

        for (int i = 0; i < 32000; i++) {

            try {
                b = random.nextInt();
                c = random.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println("exception " + e); // another way of displaying exceptions;
                a = 0; //set a to 0 and continue;
            }
            System.out.println("a " + a);
        }

    }
}
