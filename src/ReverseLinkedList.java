class ListNodee {
    int data;
    ListNode next;

    ListNodee (int data) {
        this.data = data;
        this.next=null;
    }
}
public class ReverseLinkedList {
    static void printLinkedListReverse (ListNode head) {
        ListNode curr=head;
        if( curr==null){
            return;
        }
        printLinkedListReverse(curr.next);
        System.out.print(curr.data+" ");


    }

    public static void main(String[] args) {
        ListNode nn=new ListNode(10);
        ListNode nn1=new ListNode(20);
        ListNode nn2=new ListNode(30);
        ListNode nn3=new ListNode(40);
        ListNode head=nn;
        nn.next=nn1;
        nn1.next=nn2;
        nn2.next=nn3;
        nn3.next=null;
        printLinkedListReverse(head);
    }
}
