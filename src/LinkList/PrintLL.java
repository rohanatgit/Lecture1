package LinkList;

public class PrintLL {
    public static void print(Node head){
        while(head!=null){
            System.out.println(head.data);
            head.next=head;
        }
    }

    public static void main(String[] args) {

        Node nn =new Node(10);
        Node nn2 =new Node(20);
       // Node <Integer >head=creteLinkedList();
        //print(head);
    }
    public static void creteLinkedList(){
        int data;
        Node next;
    }
    public static void increment(Node  head){
        head.data++;
    }
}
