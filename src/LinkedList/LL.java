package LinkedList;

public class LL {
    node head;
    private int size;
    LL(){
        this.size=0;
    }
    class node{
        String data;
        node next;
        node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //node head;
    //add-frist,last
    public void addFirst(String data){
        node newNode =new node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            return;
        }
        node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newnode;
    }
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        node currnode =head;
        while(currnode!=null){
            System.out.print(currnode.data+"-->");
            currnode=currnode.next;
        }
        System.out.println("Null");
    }
    public void deletefirst()
    {
        if(head==null) {
            System.out.println("ll is null");
            return;
        }
        size--;
            head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        node secoundLast=head;
        node lastnode=head.next;
        while(lastnode.next!=null){
            lastnode=lastnode.next;
            secoundLast=secoundLast.next;
        }
        secoundLast.next=null;
    }
    public int getsize(){
        return size;
    }
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("this");
        list.printList();
        list.addFirst("this");
        list.printList();
        list.deletefirst();
        list.printList();
        list.getsize();
        System.out.println(list.getsize());
        list.addFirst("this");
        System.out.println(list.getsize()); 
    }
}
