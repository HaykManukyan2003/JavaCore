package chapter11.multithreadedProgramming;

public class Example2 {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new MyThread3());
        Thread thread2 = new Thread(new MyThread4());

        thread1.start();
        thread2.start();
    }
}

class MyThread3 implements Runnable {

    @Override
    public void run() {
        for (int k = 1; k <= 1000; k++) {
            System.out.println(k);
        }
    }

}

class MyThread4 implements Runnable {

    @Override
    public void run() {
        for (int k = 1000; k > 0; k--) {
            System.out.println(k);
        }
    }

}
