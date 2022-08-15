package folders.easy;

public class SwapVariablesWithout3rdVar {

    public static void main(String[] args) {

        int a = 8;
        int b = 10;

        a = a + b; // a=18 b=10
        b = a - b; // a=18 b=8;
        a = a - b; // a=10; b=8;

        System.out.println("a: " + a + ", b: " + b);
    }
}
