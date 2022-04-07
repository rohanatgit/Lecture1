/*package LinkedList;

public class RotateLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public static void rotate(int k){
        if(k==0){
            return ;
            Node current=head;
            int count=1;
            while(count<k && current !=null){
                current =current.next;
                count++;
            }
            if(current==null)
                return;
            Node kNode=current;
            while(current!=null){
                current=current.next;
                current.next=head;
                head=kNode.next;
                kNode.next=null;
            }
        }

    }
}
*/