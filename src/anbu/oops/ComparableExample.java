package anbu.oops;

import java.util.TreeSet;

class Students implements Comparable<Students> {
    int id;
    String name;

    Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Natural order (sort by id)
    @Override
    public int compareTo(Students other) {
        // compareTo() returns:
        // negative if this.id < other.id
        // zero if this.id == other.id
        // positive if this.id > other.id
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Students> set = new TreeSet<>();

        set.add(new Students(3, "Anbu"));
        set.add(new Students(1, "Kumar"));
        set.add(new Students(2, "Prasanth"));
        set.add(new Students(3, "DuplicateID")); // won't be added (same id)

        System.out.println("Sorted TreeSet: " + set);
    }
}
