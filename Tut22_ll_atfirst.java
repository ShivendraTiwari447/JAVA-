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

    public static void print_LL(Node head) {

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void atFirst(Node newNode) {

        newNode.next=head;
        head=newNode;
        if (tail == null) {
            tail = newNode;
        }
      
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

        // 5 ko first position par add karo
        Node newNode = new Node(5);

        atFirst(newNode);

        print_LL(head);
    }
}