package anbu.oops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class HashSetInternalDemo {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");

        ArrayList<String> l = new ArrayList<>();
        l.add("Apple");// duplicate

        System.out.println("HashSet: " + set);

        // Internally - behaves like:
        HashMap<String, Object> map = new HashMap<>();
        Object dummy = new Object(); // same dummy value used internally
        map.put("Apple", dummy);
        map.put("Banana", dummy);
        map.put("Cherry", dummy);
        map.put("Apple", dummy); // replaces old key (no duplicate)

        System.out.println("Internal HashMap: " + map.keySet());

    }
}
