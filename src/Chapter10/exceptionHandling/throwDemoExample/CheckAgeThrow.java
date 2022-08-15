package Chapter10.exceptionHandling.throwDemoExample;

public class CheckAgeThrow {

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - you must be at least 18 years old.");
        } else System.out.println("access granted - You are old enough!");
    }

    public static void main(String[] args) {

        try {
            checkAge(17);
        } catch (ArithmeticException e) {
            System.out.println(e + " should be at least 18 years old");
        }

    }
}
