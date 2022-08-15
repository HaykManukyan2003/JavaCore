package chapter11.multithreadedProgramming;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample1 {

    public static void main(String[] args) throws InterruptedException {

        //ExecutorService executorService = Executors.newFixedThreadPool(5);
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunnableImp100());
        }
        executorService.shutdown();
        //executorService.awaitTermination(5, TimeUnit.SECONDS);
        //System.out.println("main ends");
    }
}

class RunnableImp100 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "begins work");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.fillInStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "ends work");
    }
}
