package anbu.oops;

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable task is running in: " + Thread.currentThread().getName());
    }
}

public class RunnableDemo {
    public static void main(String[] args) {

        Thread thread = new Thread(new MyRunnable());
        thread.start();  // starts a new thread

        System.out.println("Main thread continues...");
    }
}

