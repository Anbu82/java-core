package anbu.oops;


// Custom Exception Class
class MyException extends Exception {

    public MyException(String message) {
        super(message);  // Pass message to parent Exception class
    }
}


// Main Class
public class CustomExpection {

    // Method that throws custom exception
    static void test() throws MyException {
        throw new MyException("Custom error happened");
    }

    public static void main(String[] args) {

        try {
            test();  // Call the method that throws exception
        }
        catch (MyException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
