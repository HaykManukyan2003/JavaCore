package chapter11.multithreadedProgramming;

public class Example4 {

    public static void main(String[] args) {

        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("my thread gg");
        myThread5.setPriority(Thread.NORM_PRIORITY);

        System.out.println("name of myThread5=" + myThread5.getName()
        + ", priority of myThread5=" + myThread5.getPriority());

    }
}

class MyThread5 extends Thread {

    @Override
    public void run() {

    }

}
