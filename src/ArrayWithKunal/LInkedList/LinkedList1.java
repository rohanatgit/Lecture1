package ArrayWithKunal.LInkedList;

public class LinkedList1 {
    private Node head;
    private Node tail;
    private int size;
    public LinkedList1(){
        this.size=0;
    }
    public void insertFirst(int val){
        Node node =new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            return ;
        }
        Node node =new Node(value);
        tail.next=node;
        tail=node;
        size++;

    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"-->>");
            temp=temp.next;
        }
        System.out.println("END");
    }
    
    private class Node{
        private int value;
        private Node next;
        public Node (int value){
            this.value=value;
        }
    }

    public static void main(String[] args) {
        LinkedList1 list=new LinkedList1();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertFirst(33);
        list.insertLast(99);
        list.display();
    }
}
