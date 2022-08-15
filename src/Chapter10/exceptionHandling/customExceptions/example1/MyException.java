package Chapter10.exceptionHandling.customExceptions.example1;

public class MyException extends Exception {

    private final int detail;

    MyException(int detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }

}
