class Node {
    String data;
    Node next;
    Node prev;

    Node(String data) {
        this.data = data;
    }
}

class MyLinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    // Add element at the end (like addLast)
    public void add(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;  // first element
        } else {
            // connect old last <-> new node
            newNode.prev = tail;     // point back to old last
            tail.next = newNode;     // old last’s next = new node
            tail = newNode;          // now new node becomes the tail
        }

        size++;
        System.out.println("Added: " + data + " | Size: " + size);
    }

    // Add element at the start (like addFirst)
    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;  // point to old head
            head.prev = newNode;  // old head points back to new node
            head = newNode;       // new node becomes the new head
        }

        size++;
        System.out.println("Added at first: " + data + " | Size: " + size);
    }

    // Remove first node
    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Removing first: " + head.data);
        head = head.next;
        if (head != null) head.prev = null;
        else tail = null; // list became empty
        size--;
    }

    // Remove last node
    public void removeLast() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Removing last: " + tail.data);
        tail = tail.prev;
        if (tail != null) tail.next = null;
        else head = null; // list became empty
        size--;
    }

    // Traverse forward
    public void printForward() {
        System.out.print("Forward: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Traverse backward
    public void printBackward() {
        System.out.print("Backward: ");
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public int size() {
        return size;
    }
}

public class LinkedListInternalExample {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        // Add elements
        list.add("A");
        list.add("B");
        list.add("C");
        list.printForward();

        // Add at beginning
        list.addFirst("Start");
        list.printForward();

        // Traverse backward
        list.printBackward();

        // Remove operations
        list.removeFirst();
        list.printForward();

        list.removeLast();
        list.printForward();

        System.out.println("Final size: " + list.size());
    }
}
