package anbu.oops;

import java.util.*;

public class ArrayListAllMethodDemo {
    public static void main(String[] args) {

        //  1. Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Initially: " + list + ", Size = " + list.size());

        // 2. add(E e)
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        System.out.println("\nAfter add(): " + list);

        // 3. add(index, element)
        list.add(1, "Orange"); // insert at index 1 → shifts elements right
        System.out.println("After add(1, \"Orange\"): " + list);

        // 4. get(index)
        System.out.println("\nElement at index 2: " + list.get(2));

        // 5. set(index, element)
        list.set(2, "Grapes"); // replaces element at index 2
        System.out.println("After set(2, \"Grapes\"): " + list);

        // 6. remove(Object)
        list.remove("Banana");
        System.out.println("After remove(\"Banana\"): " + list);

        // 7. remove(index)
        list.remove(1);
        System.out.println("After remove(1): " + list);

        // 8. contains(Object)
        System.out.println("\nContains 'Apple'? " + list.contains("Apple"));
        System.out.println("Contains 'Banana'? " + list.contains("Banana"));

        // 9. isEmpty()
        System.out.println("Is list empty? " + list.isEmpty());

        // 10. size()
        System.out.println("Current Size: " + list.size());

        // 11. addAll(Collection)
        List<String> fruits = Arrays.asList("Kiwi", "Papaya", "Guava");
        list.addAll(fruits);
        System.out.println("\nAfter addAll(): " + list);

        // 12. removeAll(Collection)
        list.removeAll(Arrays.asList("Guava", "Kiwi"));
        System.out.println("After removeAll(): " + list);

        // 13. retainAll(Collection)
        list.retainAll(Arrays.asList("Apple", "Papaya"));
        System.out.println("After retainAll(): " + list);

        // 14. clear()
        list.clear();
        System.out.println("After clear(): " + list + ", Size = " + list.size());

        // 15. add() again for iteration demo
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println("\nNew List: " + list);

        // 16. Iterate using for-each
        System.out.println("Iterating using for-each:");
        for (String s : list) {
            System.out.println(s);
        }

        // 17. Iterate using Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 18. Iterate using ListIterator (bidirectional)
        System.out.println("\nIterating using ListIterator (forward):");
        ListIterator<String> listIt = list.listIterator();
        while (listIt.hasNext()) {
            System.out.println(listIt.next());
        }

        System.out.println("Iterating backward:");
        while (listIt.hasPrevious()) {
            System.out.println(listIt.previous());
        }

        // 19. clone() - shallow copy
        ArrayList<String> clonedList = (ArrayList<String>) list.clone();
        System.out.println("\nCloned List: " + clonedList);

        // 20. ensureCapacity() and trimToSize()
        ArrayList<Integer> numbers = new ArrayList<>(5);
        numbers.ensureCapacity(15); // ensures at least 15 capacity
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        System.out.println("\nNumbers before trim: " + numbers);
        numbers.trimToSize(); // reduce capacity to match current size
        System.out.println("Numbers after trimToSize(): " + numbers);
    }
}
