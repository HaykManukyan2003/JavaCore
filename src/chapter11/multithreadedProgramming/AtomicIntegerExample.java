package chapter11.multithreadedProgramming;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
    static AtomicInteger counter = new AtomicInteger(0);

    public static void increment() {
        //counter.incrementAndGet();
        counter.addAndGet(-5);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnableImp18());
        Thread thread2 = new Thread(new MyRunnableImp18());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}

class MyRunnableImp18 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            AtomicIntegerExample.increment();
        }
    }
}
