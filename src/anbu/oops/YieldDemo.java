
package anbu.oops;
class YieldDemo extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName());
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        YieldDemo t1 = new YieldDemo();
        YieldDemo t2 = new YieldDemo();

        t1.start();
        t2.start();
    }
}
