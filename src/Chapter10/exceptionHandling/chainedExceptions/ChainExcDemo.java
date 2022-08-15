package Chapter10.exceptionHandling.chainedExceptions;

class ChainExcDemo {

    static void demoProc() {
        // create an exception;
        NullPointerException e = new NullPointerException("top layer");
        // add a cause;
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }

    public static void main(String[] args) {

        try {
            demoProc();
        } catch (NullPointerException e) {
            //display top level exception;
            System.out.println("caught " + e);

            //display cause exception;
            System.out.println("original cause " + e.getCause());
        }

    }
}
