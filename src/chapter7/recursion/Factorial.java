package chapter7.recursion;

public class Factorial {

    // return type 'int' will return 1 after if statement executed;
    // means, when it calls method factorial(...) in the end, it will return 1;
    // n (which is now 1) * factorial(n-1[which is 2-1 at the end, which is 1]); 1 * 1(returned value of factorial);
    // after returning 1, it will calculate n * 1, same as 1*1, which means factorial of 1 is 1;
    // then it goes back to calculate factorial of 2, which is 2*1, which is 2;
    // now it knows factorial of 2, so continues to calculate factorial of 3, which is 3*2... (6);
    // factorial of 4 is now 4 * result of factorial(3) which is 6; 4 * 6, which is 24;
    // and finally factorial of 5 is 5 * factorial(4) which is 5 * 24 which is 120;
    // factorial(5) is 120;

    public static int factorial(int n) {

        if (n == 1) {
            System.out.println("factorial(" + n + ") = 1");
            return 1;
        } else {
            System.out.println("factorial(" + n + ") = " + n + " * factorial(" + (n - 1) + ")");
            return n * factorial(n - 1);
        }

    }

    public static void main(String[] args) {

        factorial(5);

    }
}
