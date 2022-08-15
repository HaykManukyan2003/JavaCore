package chapter11.multithreadedProgramming;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

    static CountDownLatch countDownLatch = new CountDownLatch(3);

    public static void main(String[] args) throws InterruptedException {

        new Friend("Hayk", countDownLatch);
        new Friend("Poncho", countDownLatch);
        new Friend("Raf", countDownLatch);
        new Friend("Gag", countDownLatch);
        new Friend("Vahan", countDownLatch);

        marketStaffIsOnPlace();
        everythingIsReady();
        openMarket();
    }

    private static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work");
        countDownLatch.countDown();
        System.out.println("countDownLatch: " + countDownLatch.getCount());
    }

    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("everything is ready, lets open the market");
        countDownLatch.countDown();
        System.out.println("countDownLatch: " + countDownLatch.getCount());
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is open");
        countDownLatch.countDown();
        System.out.println("countDownLatch: " + countDownLatch.getCount());
    }
}

class Friend extends Thread {
    String name;
    private final CountDownLatch countDownLatch;

    Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " is ready to shop");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
