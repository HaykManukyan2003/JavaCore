package Chapter10.exceptionHandling.tryCatchExamples;

class MultiCatch {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        int[] vals = {1, 2, 3};

        try {
            int result = a / b; // generate an Arithmetic exception;
            vals[10] = 19; // generate an ArrayIndexOutOfBoundsException;

            // this catch clause catches both exceptions;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("exception caught " + e);
        }
        System.out.println("after multiCatch");
    }
}
