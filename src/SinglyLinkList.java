import java.util.Scanner;

class Node{
    int rollno;
    Node next;
    Node(){
        this.next=null;
    }
}
public class SinglyLinkList {
    Node start;

    SinglyLinkList() {
        start = null;
    }
    void insert() {
        System.out.println("insert function is working");
        Node nn=new Node();
        Scanner s=new Scanner(System.in);
        System.out.println("enter value to be insert");
        int data=s.nextInt();
        nn.rollno=data;
        nn.next=null;
        if(start==null){
            start=nn;
        }
        else{
            Node current=start;
            while(current.next!=null){
                current=current.next;
            }
            current.next=nn;
        }
    }

    void delete() {
        if(start==null){
            System.out.println("underflow");
        }
        else{
            if(start.next==null){
                start=null;
            }
            else{
                start=start.next;
            }
        }
    }

    void traverse() {
        if(start==null){
            System.out.println("emptylinkedlist");
        }
        for(Node current=start;current!=null;current=current.next){
            System.out.println(current.rollno);
        }
    }

    public static void main(String[] args) {
        SinglyLinkList obj = new SinglyLinkList();
        while (true) {
            System.out.println("press 1 for insert");
            System.out.println("press 2 for delete");
            System.out.println("press 3 dor travere");
            System.out.println("press 4 for exit");
            Scanner s=new Scanner(System.in);
            int choice=s.nextInt();
            switch(choice){
                case 1:{
                    obj.insert();
                    break;
                }
                case 2:{
                    obj.delete();
                    break;
                }
                case 3:{
                    obj.traverse();
                    break;
                }
                case 4:{
                    System.exit(0);
                }
                default:{
                    System.out.println("wrong choice");
                }

            }
        }
    }
}