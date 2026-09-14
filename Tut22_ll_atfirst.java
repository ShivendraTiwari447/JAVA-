class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Tut22_ll_atfirst {

    public static Node head;
    public static Node tail;
    static int size;

    // Print Linked List
    public static void print_LL(Node head) {

        while (head != null) {

            System.out.println(head.data);

            head = head.next;
        }
    }

    // Add Node at First
    public static void atFirst(Node newNode) {

        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = newNode;
        }

        size++;
    }

    // Delete First Node
    public static int delete() {

        if (head == null) {
            return -1;
        }

        int val = head.data;

        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;

        return val;
    }

    // Get Size
    public static int getSize() {
        return size;
    }

    public static void main(String[] args) {

        Node n1 = new Node(2);
        Node n2 = new Node(2);
        Node n3 = new Node(2);
        Node n4 = new Node(2);
        Node n5 = new Node(2);

        head = n1;
        tail = n5;

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        // Initial 5 nodes
        size = 5;

        System.out.println("Original List:");
        print_LL(head);

        System.out.println("Size: " + getSize());

        // Add 5 at first
        Node newNode = new Node(5);
        atFirst(newNode);

        System.out.println("\nAfter Adding 5:");
        print_LL(head);

        System.out.println("Size: " + getSize());

        // Delete First
        int deletedValue = delete();

        System.out.println("\nDeleted Value: " + deletedValue);

        System.out.println("After Delete:");
        print_LL(head);

        System.out.println("Size: " + getSize());
    }
}