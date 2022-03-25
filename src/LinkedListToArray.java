public class LinkedListToArray {
    List<Integer> linkedListToArray (ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        while(head!=null){
            arr.add(head.data);
            head=head.next;
        }
        return arr;
    }
}
