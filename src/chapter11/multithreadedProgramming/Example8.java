package chapter11.multithreadedProgramming;

public class Example8 extends Thread {

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new MyRunnable());
        Example8 example8Thread = new Example8();
        thread1.start();
        example8Thread.start();

        thread1.join();
        example8Thread.join();
        System.out.println("end!");
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
