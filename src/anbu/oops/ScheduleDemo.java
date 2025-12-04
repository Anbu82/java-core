
package anbu.oops;

class ScheduleDemo extends Thread {

    public ScheduleDemo(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(getName() + " → " + i);

            try {
                Thread.sleep(500); // thread PAUSES here
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        ScheduleDemo t1 = new ScheduleDemo("Thread-A");
        ScheduleDemo t2 = new ScheduleDemo("Thread-B");
        ScheduleDemo t3 = new ScheduleDemo("Thread-C");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Main thread finished its work");
    }
}
