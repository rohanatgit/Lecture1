class ListNodeee {
    int data;
    ListNode next;

    ListNodeee (int data) {
        this.data = data;
        this.next=null;
    }
}
public class ReturnkthPos {
   static  ListNode kthElement (ListNode head, int k) {
        // add your logic here
        for(int i=1;i<k;i++){
            head=head.next;
        }
        return head;
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
       kthElement(head,2);
    }
}
