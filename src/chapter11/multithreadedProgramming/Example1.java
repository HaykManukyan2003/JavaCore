package chapter11.multithreadedProgramming;

public class Example1 {

    public static void main(String[] args) {

        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        MyThread1 myThread11 = new MyThread1();

        myThread1.start();
        myThread2.start();
        myThread11.start();
    }
}

class MyThread1 extends Thread {

    @Override
    public void run() {
        for (int k = 1; k <= 1000; k++) {
            System.out.println(k);
        }
    }

}

class MyThread2 extends Thread {

    @Override
    public void run() {
        for (int k = 1000; k > 0; k--) {
            System.out.println(k);
        }
    }

}