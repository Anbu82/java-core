package anbu.oops;

import java.util.Comparator;
import java.util.TreeSet;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

// Custom Comparator: sorts students by name (alphabetical order)
class NameComparator implements Comparator<Students> {
    @Override
    public int compare(Students s1, Students s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class ComparatorExample {
    public static void main(String[] args) {

        // TreeSet with custom Comparator (NameComparator)
        TreeSet<Students> set = new TreeSet<>(new NameComparator());

        set.add(new Students(3, "Anbu"));
        set.add(new Students(1, "Kumar"));
        set.add(new Students(2, "Prasanth"));

        System.out.println("Sorted by Name (Comparator): " + set);
    }
}
