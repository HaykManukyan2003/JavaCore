package Chapter10.exceptionHandling.throwsExamples;

public class checkAgeThrows {

    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("access denied");
        } else System.out.println("access granted");
    }

    public static void main(String[] args) {

        try {
            checkAge(4);
        } catch (ArithmeticException ageError) {
            System.out.println(ageError + " try Again");
        }
    }
}
