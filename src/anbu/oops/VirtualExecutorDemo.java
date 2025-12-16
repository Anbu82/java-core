package anbu.oops;

import java.util.concurrent.*;

public class VirtualExecutorDemo {

    public static void main(String[] args) throws Exception {

        try (ExecutorService executor =
                     Executors.newVirtualThreadPerTaskExecutor()) {

            for (int i = 1; i <= 5; i++) {
                executor.submit(() -> {
                    System.out.println("Handling request " +
                            Thread.currentThread());
                    Thread.sleep(1000);
                    return null;
                });
            }
        }
    }
}

