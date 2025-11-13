package anbu.oops;

import java.util.ArrayList;

public class ArrayListInternalDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // Add 12 elements (default capacity = 10)
        for (int i = 1; i <= 12; i++) {
            list.add("Item-" + i);
            System.out.println("Added: Item-" + i + ", Size: " + list.size());
        }

        System.out.println("\nFinal List: " + list);
    }
}


