package anbu.oops;

// Class name starts with a capital letter
class Car {
    String brand;
    String model;
    static int totalCars = 0;
    final int carId;

    // Default constructor
    Car() {
        brand = "Unknown";
        model = "Basic";
        totalCars++;
        carId = totalCars;
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    Car(String brand, String model) {
        this.brand = brand;
        this.model = model; // fixed variable name
        totalCars++;

        carId = totalCars;
        System.out.println("Parameterized constructor called");
    }

    // final method - cannot be overridden
    public final void displayCarDetails() {
        System.out.println("Car ID: " + carId + " | Brand: " + brand + " | Model: " + model);
    }

    // static method - shared among all objects
    public static void showTotalCars() {
        System.out.println("Total Cars Created: " + totalCars);
    }

    // final inner class
    final class FinalExample {
        void showMessage() {
            System.out.println("This is a final class. You can't inherit this class.");
        }
    }
}

// Main class
public class constructorStaticFinal {
    public static void main(String[] args) {

        // Create Car objects
        Car car1 = new Car();
        Car car2 = new Car("Tesla", "Model X");
        Car car3 = new Car("BMW", "X5");

        // Display details
        car1.displayCarDetails();
        car2.displayCarDetails();
        car3.displayCarDetails();

        // Show total cars
        Car.showTotalCars();

        // Create object for inner final class
        Car.FinalExample finalObj = car1.new FinalExample();
        finalObj.showMessage();
    }
}
