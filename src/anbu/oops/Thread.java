package anbu.multithreading;

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        System.out.println("Main thread: " + Thread.currentThread().getName());

        MyThread t1 = new MyThread();  // Create thread object

        t1.start();   // Starts new thread → JVM calls run() internally

        System.out.println("Main method ends");
    }
}
