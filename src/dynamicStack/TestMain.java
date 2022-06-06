package dynamicStack;

public class TestMain {

    public static void main(String[] args) {

        BraceChecker braceChecker = new BraceChecker(" {hello} [java) ");
        braceChecker.check();

    }
}
