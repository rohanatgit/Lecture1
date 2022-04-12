public class ReverseLinkedL {
    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=node;
        }
        node =prev;
        return node;
    }

    public static void main(String[] args) {
        ReverseLinkedL LL=new ReverseLinkedL();
        LL.head = new Node(1);
        LL.head.next=new Node(2);
        LL.head.next.next=new Node(3);
        System.out.println("Given Linked list");
        LL.printList(head);
        head = LL.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        LL.printList(head);
    }
}
