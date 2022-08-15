package chapter11.multithreadedProgramming;

public class Example3 {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("gg yo");
            }
        }).start();

    }
}
