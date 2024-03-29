package Chapter10.exceptionHandling.customExceptions.example1;

public class ExceptionDemo {

    static void compute(int a) throws MyException {
        System.out.println("called compute(" + a + ")");
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("normal exit");
    }

    public static void main(String[] args) {

        try {
            compute(1);
            compute(20);
        } catch (MyException myException) {
            System.out.println("caught " + myException);
        }

    }
}
