package folders.examples;

public class FibonacciNumbers {
    
    public static void main(String[] args) {
        int fibonacciLength = 17;

        int num = 0;
        int $num = 1;

        for (int i = 0; i < fibonacciLength; i++) {
            int res = num + $num;
            System.out.println(res);

            num = $num;
            $num = res;
        }
    }
}
