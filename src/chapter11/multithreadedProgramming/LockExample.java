package chapter11.multithreadedProgramming;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {

    public static void main(String[] args) {

        Call call = new Call();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.skypeCall();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.whatsAppCall();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class Call {
    private final Lock lock = new ReentrantLock();

    void mobileCall() {
        lock.lock();
        try {
            System.out.println("mobile call starts");
            Thread.sleep(3000);
            System.out.println("mobile call ends.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void skypeCall() {
        lock.lock();
        try {
            System.out.println("skype call starts");
            Thread.sleep(3000);
            System.out.println("skype call ends.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void whatsAppCall() {
        lock.lock();
        try {
            System.out.println("whatsApp call starts");
            Thread.sleep(7000);
            System.out.println("whatsApp call ends.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
