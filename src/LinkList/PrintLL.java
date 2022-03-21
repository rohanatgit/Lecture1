package LinkList;

public class PrintLL {
    public static void print(Node head){
        while(head!=null){
            System.out.println(head.data);
            head.next=head;
        }
    }

    public static void main(String[] args) {
    }
}
