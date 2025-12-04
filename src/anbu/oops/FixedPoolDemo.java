package anbu.oops;

import java.util.concurrent.*;

public class FixedPoolDemo {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            int taskId = i;

            executor.submit(() -> {
                System.out.println("Task " + taskId + " running in " +
                        Thread.currentThread().getName());
                try { Thread.sleep(1000); } catch (Exception e) {}
            });
        }

        executor.shutdown();
    }
}

