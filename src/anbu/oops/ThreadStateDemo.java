package anbu.oops;

class StateThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000); // TIMED_WAITING
        } catch (Exception e) {
        }
        System.out.println("Thread finished work.");
    }
}

public class ThreadStateDemo {
    public static void main(String[] args) throws Exception {

        StateThread t = new StateThread();

        System.out.println("State 1: " + t.getState()); // NEW

        t.start();
        System.out.println("State 2: " + t.getState()); // RUNNABLE

        Thread.sleep(100); // Let thread run
        System.out.println("State 3: " + t.getState()); // TIMED_WAITING (because sleep in run)

        Thread.sleep(1500); // Wait for thread to complete
        System.out.println("State 4: " + t.getState()); // TERMINATED
    }
}
