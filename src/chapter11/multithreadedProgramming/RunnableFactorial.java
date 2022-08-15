package chapter11.multithreadedProgramming;

import java.util.concurrent.*;

public class RunnableFactorial {

    static int factorialResult;

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(6);
        //executorService.execute(factorial);
        Future future = executorService.submit(factorial);
        executorService.shutdown();
        boolean b = executorService.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(future.get());
        System.out.println(future.isDone());
        System.out.println(factorialResult);
    }
}

class Factorial implements Runnable {

    int factorial;

    public Factorial(int factorial) {
        this.factorial = factorial;
    }

    @Override
    public void run() {
        if (factorial <= 0) {
            System.err.println("wrong number");
            return;
        }
        int result = 1;
        for (int i = 1; i <= factorial; i++) {
            result *= i;
        }
        RunnableFactorial.factorialResult = result;
    }
}
