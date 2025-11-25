package anbu.oops;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "Callable task executed in: " + Thread.currentThread().getName();
    }
}

public class CallableDemo {

    public static void main(String[] args) {

        MyCallable task = new MyCallable();

        // Wrap Callable inside FutureTask
        FutureTask<String> futureTask = new FutureTask<>(task);

        // Run it in a Thread
        Thread thread = new Thread(futureTask);
        thread.start();

        try {
            // get() waits for the result
            String result = futureTask.get();
            System.out.println(result);
        }
        catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
