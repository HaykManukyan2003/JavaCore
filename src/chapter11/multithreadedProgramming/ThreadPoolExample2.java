package chapter11.multithreadedProgramming;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample2 {

    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
//        scheduledExecutorService.schedule(new RunnableImp200(), 3,
//                TimeUnit.SECONDS);
//        scheduledExecutorService.scheduleAtFixedRate(new RunnableImp200(),
//                3, 1, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImp200(),
                3, 1, TimeUnit.SECONDS);

        Thread.sleep(20000);
        scheduledExecutorService.shutdown();

        ExecutorService executorService = Executors.newCachedThreadPool();

    }
}

class RunnableImp200 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "begins work");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.fillInStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "ends work");
    }
}
