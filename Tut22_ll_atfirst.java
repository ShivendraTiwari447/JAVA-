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

    // Print Linked List
    public static void print_LL(Node head) {

        while (head != null) {

            System.out.println(head.data);

            head = head.next;
        }
    }

    // Add Node at First
    public static void atFirst(Node newNode) {

        // New node ko current head se connect karo
        newNode.next = head;

        // Head ko new node bana do
        head = newNode;

        // Agar list empty thi
        if (tail == null) {
            tail = newNode;
        }
    }

    // Delete First Node
    public static int delete() {

        // Agar list empty hai
        if (head == null) {
            return -1;
        }

        // First node ka data store karo
        int val = head.data;

        // Head ko next node par move karo
        head = head.next;

        // Agar list empty ho gayi
        if (head == null) {
            tail = null;
        }

        return val;
    }

    public static void main(String[] args) {

        // Nodes create
        Node n1 = new Node(2);
        Node n2 = new Node(2);
        Node n3 = new Node(2);
        Node n4 = new Node(2);
        Node n5 = new Node(2);

        // Head and Tail
        head = n1;
        tail = n5;

        // Nodes connect
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        // Original List
        System.out.println("Original List:");
        print_LL(head);

        // Add 5 at first
        Node newNode = new Node(5);
        atFirst(newNode);

        System.out.println("After Adding 5 at First:");
        print_LL(head);

        // Delete First
        int deletedValue = delete();

        System.out.println("Deleted Value: " + deletedValue);

        System.out.println("After Delete:");
        print_LL(head);
    }
}