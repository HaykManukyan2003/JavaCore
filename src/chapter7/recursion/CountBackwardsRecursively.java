package chapter7.recursion;

public class CountBackwardsRecursively {

    public static void countBackwards(int n) {
        if (n == 0) {
            System.out.println("done");
        } else {
            System.out.println(n);
            n--;
            countBackwards(n);
        }
    }


    public static void main(String[] args) {

        countBackwards(7);

    }

}
