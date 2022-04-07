import java.util.Scanner;

public class rotateLinklistfrommiddle {
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
        static Node reverse(Node node)
        {
            Node prev = null;
            Node current = node;
            Node next = null;
            while (current !=null ) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            node = prev;
            return node;
        }
        static void addtoLast(Node head,int data){
            Node nn=new Node(data);
            Node curr=head;
            if(head==null){
                head=nn;
            }
            else{
                while(curr.next!=null){
                    curr=curr.next;
                }
                curr.next=nn;
            }

        }
        static void print(Node head){
            while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        }
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("enter from where linklist is reverse");
            //int k=s.nextInt();
            Node head=new Node(1);
            System.out.println("enter size of linklist");
            int size=s.nextInt();
            for(int i=0;i<size;i++){
                int data=s.nextInt();
                addtoLast(head,data);
            }
            print(head);
            Node head1=reverse(head);
            System.out.println("rotate after reverse");
            print(head1);
        }
    }
}
