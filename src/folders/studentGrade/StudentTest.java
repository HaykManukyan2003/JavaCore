package folders.studentGrade;

import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = 0;
        int passed = 0;
        int failed = 0;

        while (counter < 10) {
            System.out.println("Enter the result: 1 = pass, 2 = failed");

            int result = input.nextInt();

            if (result == 1) {
                passed++;
            } else if (result == 2) {
                failed++;
            }

            counter++;
        }

        if (passed > 7) {
            System.out.println("great result");
        } else if (failed >= passed) {
            System.out.println("bad result");
        }

        System.out.println("test count: " + counter);
        System.out.println("passed: " + passed);
        System.out.println("failed: " + failed);

    }
}
