package ArrayWithKunal.LInkedList;

public class DoubleLL {
    Node head;
    public void insertFirst(int value){
        Node node =new Node(value);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }
        class Node{
            int value;
            Node next;
            Node prev;
            public Node(int value){
                this.value=value;
            }
            public Node(int value,Node next,Node prev){
                this.value=value;
                this.next=next;
                this.prev=prev;}

    }
    public void insertatAnyGivenPosition(){
        
    }
    public void insertlast(int value){
   Node node =new Node(value);
   Node last=head;
   node.next=null;
   if(head==null){
       node.prev=null;
       head=node;
       return;
   }
      while (last.next!=null){
          last=last.next;
      }
      last.next=node;
      node.prev=last;
    }
  public void display(){
        Node node=head;
        while (node!=null){
            System.out.println(node.value+" -->");
            node.next=node;
        }
      System.out.println();
  }

    public static void main(String[] args) {
         DoubleLL list=new DoubleLL();
         list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        //list.insertlast(33);
        list.display();
    }
}
