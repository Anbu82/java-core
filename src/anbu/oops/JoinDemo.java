package anbu.oops;

class JoinDemo extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " → " + i);
        }
    }

    public static void main(String[] args) throws Exception {
        JoinDemo t1 = new JoinDemo();
        JoinDemo t2 = new JoinDemo();

        t1.start();
        t1.join();   // Main waits until t1 finishes

        System.out.println("t1 completed, now starting t2...");
        t2.start();
    }
}
