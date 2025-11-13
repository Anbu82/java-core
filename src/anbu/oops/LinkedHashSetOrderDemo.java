package anbu.oops;

import java.util.LinkedHashSet;

public class LinkedHashSetOrderDemo {
    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Banana");
        set.add("Apple");
        set.add("Cherry");

        System.out.println("Before removal: " + set);

        set.remove("Apple");
        set.add("Apple"); // re-adding "Apple"

        System.out.println("After re-adding 'Apple': " + set);
    }
}
