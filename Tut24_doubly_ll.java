class Node{
    int data;
    Node next;
    Node prev;


    Node (int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }


}


public class Tut24_doubly_ll {

    static Node head;
    static Node tail;

    static void insert_before_head(Node newNode) {
    newNode.next = head;
    head.prev = newNode;
    head = newNode;
}

static int  delete_head(Node head) {
  int curr=head.data;
  head=head.next;

  return curr;
}

    public static void main(String[] args) {

        Node n1= new Node(3);
        Node n2= new Node(3);
        Node n3= new Node(3);
        Node n4= new Node(3);

        head=n1;
        tail=n4;
        
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;


         // Backward links
        n2.prev = n1;
        n3.prev = n2;
        n4.prev = n3;


        
    }
    
}
