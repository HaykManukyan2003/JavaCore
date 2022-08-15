package chapter11.multithreadedProgramming;

public class DeadlockExample {

    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {

        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();

        thread10.start();
        thread20.start();

    }
}

class Thread10 extends Thread {

    @Override
    public void run() {
        System.out.println("Thread10: attempt to access monitor of object lock1");
        synchronized (DeadlockExample.lock1) {
            System.out.println("Thread10: successfully accessed into object lock1's monitor");
            System.out.println("Thread10: attempt to access monitor of object lock2");
            synchronized (DeadlockExample.lock2) {
                System.out.println("Thread10: successfully accessed into objects lock1 & lock2 monitors'");
            }
        }
    }
}

class Thread20 extends Thread {

    @Override
    public void run() {
        System.out.println("Thread20: attempt to access monitor of object lock2");
        synchronized (DeadlockExample.lock2) {
            System.out.println("Thread20: successfully accessed into object lock2's monitor");
            System.out.println("Thread20: attempt to access monitor of object lock1");
            synchronized (DeadlockExample.lock1) {
                System.out.println("Thread20: successfully accessed into objects lock1 & lock2 monitors'");
            }
        }
    }
}