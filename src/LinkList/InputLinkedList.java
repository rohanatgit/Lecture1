package LinkList;

import java.util.Scanner;
//TAKE INPUT
//User input the numbers
class Node1<Integer>{
    Node1 next=null;
    int data;

    public Node1(int data) {
        this.data=data;
        this.next=null;
    }
}
public class InputLinkedList {
    public static Node1<Integer> takeinput(){
        Scanner sc =new Scanner(System.in);
        int data=sc.nextInt();
        Node1<Integer>head=null;
        while(data!=-1){
            Node1 <Integer>currNode=new Node1<Integer>(data);
            if(head==null){
                head=currNode;
            }else{
                Node1<Integer>tail=head;
                while(tail.next!=null){
                    tail=tail.next;
                }
                //Now tail will refere to last node
                //Connect lst node after last node
            }

            data=sc.nextInt();
        }
        return head;
    }

    public static void main(String[] args) {
        Node1<Integer> head=takeinput();
        System.out.println(head);
    }
}
