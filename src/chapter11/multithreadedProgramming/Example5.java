package chapter11.multithreadedProgramming;

public class Example5 implements Runnable {

    public static void main(String[] args) {
        Thread thread = new Thread(new Example5());
        thread.start();

        System.out.println("method main. thread name = " +
                Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("method run. thread name = " +
                Thread.currentThread().getName());
    }
}
