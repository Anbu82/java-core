package anbu.oops;

import java.util.*;
import java.util.function.*;

public class FunctionalInterfaceReference {

    public static void main(String[] args) {

        /* --------------------------------------------------
         * 1. Predicate<T>  -> boolean test(T t)
         * Used for CONDITIONS / FILTERING
         * -------------------------------------------------- */
        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println("Predicate:");
        System.out.println("10 is even? " + isEven.test(10));
        System.out.println("15 is even? " + isEven.test(15));


        /* --------------------------------------------------
         * 2. Function<T, R> -> R apply(T t)
         * Used for TRANSFORMATION
         * -------------------------------------------------- */
        Function<String, Integer> stringLength = str -> str.length();

        System.out.println("\nFunction:");
        System.out.println("Length of 'Anbu' = " + stringLength.apply("Anbu"));


        /* --------------------------------------------------
         * 3. Consumer<T> -> void accept(T t)
         * Used for CONSUMING data (no return)
         * -------------------------------------------------- */
        Consumer<String> printer = msg -> System.out.println("Message: " + msg);

        System.out.println("\nConsumer:");
        printer.accept("Hello Java 8");


        /* --------------------------------------------------
         * 4. Supplier<T> -> T get()
         * Used for PROVIDING data (no input)
         * -------------------------------------------------- */
        Supplier<Date> dateSupplier = () -> new Date();

        System.out.println("\nSupplier:");
        System.out.println("Current Date: " + dateSupplier.get());


        /* --------------------------------------------------
         * 5. BiPredicate<T, U> -> boolean test(T t, U u)
         * Condition with TWO inputs
         * -------------------------------------------------- */
        BiPredicate<Integer, Integer> isSumEven = (a, b) -> (a + b) % 2 == 0;

        System.out.println("\nBiPredicate:");
        System.out.println("Sum of 10 & 20 even? " + isSumEven.test(10, 20));


        /* --------------------------------------------------
         * 6. BiFunction<T, U, R> -> R apply(T t, U u)
         * Transformation with TWO inputs
         * -------------------------------------------------- */
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        System.out.println("\nBiFunction:");
        System.out.println("10 + 20 = " + add.apply(10, 20));


        /* --------------------------------------------------
         * 7. UnaryOperator<T> -> T apply(T t)
         * Special Function (same input & output type)
         * -------------------------------------------------- */
        UnaryOperator<Integer> square = n -> n * n;

        System.out.println("\nUnaryOperator:");
        System.out.println("Square of 5 = " + square.apply(5));


        /* --------------------------------------------------
         * 8. BinaryOperator<T> -> T apply(T t1, T t2)
         * Special BiFunction (same input & output type)
         * -------------------------------------------------- */
        BinaryOperator<Integer> multiply = (a, b) -> a * b;

        System.out.println("\nBinaryOperator:");
        System.out.println("5 * 4 = " + multiply.apply(5, 4));


        /* --------------------------------------------------
         * 9. Comparator<T> -> int compare(T o1, T o2)
         * Used for SORTING
         * -------------------------------------------------- */
        List<String> names = Arrays.asList("Anbu", "Kumar", "Raj");

        names.sort((a, b) -> a.compareTo(b));

        System.out.println("\nComparator:");
        System.out.println("Sorted Names: " + names);


        /* --------------------------------------------------
         * 10. Runnable -> void run()
         * Used for THREAD EXECUTION
         * -------------------------------------------------- */
        Runnable task = () -> System.out.println("Runnable executed");

        System.out.println("\nRunnable:");
        new Thread(task).start();
    }
}
