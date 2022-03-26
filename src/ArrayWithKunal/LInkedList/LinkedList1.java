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
        }size+=1;
    }
    public int deleteFirst(){
        int value=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return value;
    }
    public int lastDelet(){
     if(size<=1){
         return deleteFirst();
     }
     Node secoundlast=get(size-2);
     int value=tail.value;
     tail=secoundlast;
     tail.next=null;
     return value;
    }
    public int delet(int index){
        if(index==0){
            return deleteFirst();
        }
        else if(index==size-1){
            return lastDelet();
        }
        Node prev =get(index-1);
        int value=prev.next.value;
        return value;
    }
    public Node get(int index){
        Node node=head;
        for(int i=0;i<index && head!=null;i++){
            node =node.next;
        }return node;
    }
    public int delect(int index){
        if(index==0){
            return deleteFirst();
        }
        return 0;
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
    public void insertatAnyPos(int value,int index){
        if(index==0){
            insertFirst(value);
            return ;
        }
        if(index==size){
            insertLast(value);
            return ;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node =new Node(value);
        temp.next=node;
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
        list.insertatAnyPos(100,3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.lastDelet());
        list.display();
    }
}
