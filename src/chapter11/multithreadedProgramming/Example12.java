package chapter11.multithreadedProgramming;

public class Example12 {

    static final Object lock = new Object();

    void mobileCall() {
        synchronized (lock) {
            System.out.println("mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("mobile call ends");
        }
    }

    void skypeCall() {
        synchronized (lock) {
            System.out.println("skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("skype call ends");
        }
    }

    void whatsAppCall() {
        synchronized (lock) {
            System.out.println("whatsApp call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("whatsApp call ends");
        }
    }

    public static void main(String[] args) {

        Thread thread1 = new Thread(new RunnableImplMobile());
        Thread thread2 = new Thread(new RunnableImplSkype());
        Thread thread3 = new Thread(new RunnableImplWhatsApp());

        thread1.start();
        thread2.start();
        thread3.start();
    }

}

class RunnableImplMobile implements Runnable {

    @Override
    public void run() {
        new Example12().mobileCall();
    }
}

class RunnableImplSkype implements Runnable {

    @Override
    public void run() {
        new Example12().skypeCall();
    }
}

class RunnableImplWhatsApp implements Runnable {

    @Override
    public void run() {
        new Example12().whatsAppCall();
    }
}
