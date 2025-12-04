package anbu.oops;

class SleepDemo extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " → " + i);
            try {
                Thread.sleep(1000); // pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        SleepDemo t1 = new SleepDemo();
        t1.start();

        System.out.println("Main thread continues...");
    }
}
