package chapter11.multithreadedProgramming;

import java.util.concurrent.*;

public class CallableFactorial {

    static int factorialResult;

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial2 factorial2 = new Factorial2(5);
        Future<Integer> integerFuture = executorService.submit(factorial2);
        try {
            System.out.println(integerFuture.isDone());
            System.out.println("want to get the result");
            factorialResult = integerFuture.get();
            System.out.println("got the result");
            System.out.println(integerFuture.isDone());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.err.println(e.getCause());
        } finally {
            executorService.shutdown();
        }
        System.out.println(factorialResult);
    }
}

class Factorial2 implements Callable<Integer> {

    int factorial;

    public Factorial2(int factorial) {
        this.factorial = factorial;
    }

    @Override
    public Integer call() throws Exception {
        if (factorial <= 0) {
            throw new Exception("wrong number");
        }
        int result = 1;
        for (int i = 1; i <= factorial; i++) {
            result *= i;
            Thread.sleep(1000);
        }
        return result;
    }
}
