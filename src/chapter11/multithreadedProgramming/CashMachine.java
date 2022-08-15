package chapter11.multithreadedProgramming;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CashMachine {

    public static void main(String[] args) throws InterruptedException {

        Lock lock = new ReentrantLock();

        new Employee(lock, "Hayk");
        new Employee(lock, "Vahagn");

        Thread.sleep(5000);

        new Employee(lock, "Vahan");
        new Employee(lock, "Raf");
    }
}

class Employee extends Thread {
    private final Lock lock;
    String name;

    public Employee(Lock lock, String name) {
        this.lock = lock;
        this.name = name;
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock()) {
//        System.out.println(name + " is waiting");
//        lock.lock();
            System.out.println(name + " is already using the cash machine");
            try {
                Thread.sleep(2000);
                System.out.println("finished his work.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else System.out.println(name + " don't wanna wait");
    }
}
