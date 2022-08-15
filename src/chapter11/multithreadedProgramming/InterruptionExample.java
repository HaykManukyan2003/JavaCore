package chapter11.multithreadedProgramming;

public class InterruptionExample {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("main starts");

        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
        thread.join();
        System.out.println("main ends");
    }
}

class InterruptedThread extends Thread {
    double sqrtSum = 0;

    @Override
    public void run() {
        for (int i = 1; i < 1000000000; i++) {
            if (isInterrupted()) {
                System.out.println("patok xatyat prervat");
                return;
            }
            sqrtSum += Math.sqrt(i);
        }
        System.out.println(sqrtSum);
    }
}
