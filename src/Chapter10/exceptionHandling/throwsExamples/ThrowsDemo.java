package Chapter10.exceptionHandling.throwsExamples;

public class ThrowsDemo {

    static void throwOne() throws IllegalAccessException{
        System.out.println("inside throwOne");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {

        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("caught " + e);
        }

    }
}
