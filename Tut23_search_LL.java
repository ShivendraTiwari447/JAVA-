class Node {
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}



public class Tut23_search_LL {

    public static Node head;
    public static Node tail;

  public static boolean search(Node head, int data) {

    while (head != null) {

        if (head.data == data) {
            return true;
        }

        head = head.next;
    }

    return false;
}

    public static void main(String[] args) {
        Node n1= new Node(2);
        Node n2= new Node(6);
        Node n3= new Node(211);
        Node n4= new Node(21);
        Node n5= new Node(8);

        head=n1;

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

    //    Boolean s= search(head ,8);
    //    System.out.println(s);


    System.out.println(search(head, 99));
    }
    
}
