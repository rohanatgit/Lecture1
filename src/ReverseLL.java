class ListNode {
 	int data;
 	ListNode next;

     	ListNode (int data) {
		this.data = data;
        this.next=null;
 	}
 }
public class ReverseLL {
    static void reverseLinkedList (ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=head.next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
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
        reverseLinkedList(head);

    }
}
