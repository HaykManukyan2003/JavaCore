package chapter11.multithreadedProgramming;

public class Example6 {

    public static void main(String[] args) throws InterruptedException {

        for (int k = 5; k > 0; k--) {
            System.out.println(k);
            Thread.sleep(2000);
        }
        System.out.println("lets go!");
    }
}
