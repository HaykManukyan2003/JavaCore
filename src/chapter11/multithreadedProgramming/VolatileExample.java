package chapter11.multithreadedProgramming;

public class VolatileExample extends Thread {

    volatile boolean b = true;

    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("loop is finished. counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {

        VolatileExample thread = new VolatileExample();
        thread.start();
        Thread.sleep(3000);
        System.out.println("after 3 seconds its time to wake up");
        thread.b = false;
        thread.join();
        System.out.println("end of program");
    }

}
