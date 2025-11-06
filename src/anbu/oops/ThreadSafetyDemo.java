package anbu.oops;

public class ThreadSafetyDemo {
    public static void main(String[] args) throws InterruptedException{
        StringBuffer sbf= new StringBuffer("Hi");
        StringBuilder sbd= new StringBuilder("Hi");

        //Thread modifying StringBuffer(safe)
        Thread t1= new Thread(() -> {
            for (int i=0; i<1000; i++) sbf.append("A");
        });

        //Another thread modifying StringBuffer
        Thread t2= new Thread(() ->{
            for (int i=0; i<1000; i++) sbf.append("B");
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("StringBuffer length: " + sbf.length()); //  Always 2002 (Hi + 2000 chars)

        // Now test StringBuilder (unsafe)
        StringBuilder unsafe = new StringBuilder("Hi");
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) unsafe.append("X");
        });
        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) unsafe.append("Y");
        });

        t3.start();
        t4.start();
        t3.join();
        t4.join();

        System.out.println("StringBuilder length: " + unsafe.length()); // ⚠May not always be 2002
    }
}



