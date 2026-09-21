class Node {

    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class Tut24_doubly_ll {

    static Node head;
    static Node tail;

    // Insert before head
    static void insert_before_head(Node newNode) {

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Delete head
    static int delete_head() {

        if (head == null) {
            return -1;
        }

        int curr = head.data;

        if (head == tail) {
            head = null;
            tail = null;
            return curr;
        }

        head = head.next;
        head.prev = null;

        return curr;
    }

    // Insert at last
    static void insert_at_last(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Print forward
    static void printForward() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Print backward
    static void printBackward() {

        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.prev;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        head = n1;
        tail = n4;

        // Forward links
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        // Backward links
        n2.prev = n1;
        n3.prev = n2;
        n4.prev = n3;

        printForward();
        printBackward();

        insert_before_head(new Node(5));

        System.out.println("After insert before head:");
        printForward();

        delete_head();

        System.out.println("After delete head:");
        printForward();

        insert_at_last(50);

        System.out.println("After insert at last:");
        printForward();
    }
}