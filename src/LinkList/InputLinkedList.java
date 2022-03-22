package LinkList;

import java.util.Scanner;
//TAKE INPUT
//User input the numbers
public class InputLinkedList {
    public static Node<Integer> takeinput(){
        Scanner sc =new Scanner(System.in);
        int data=sc.nextInt();
        Node<Integer>head=null;
        while(data!=-1){
            Node <Integer>currNode=new Node<Integer>(data);
            if(head==null){
                head=currNode;
            }else{
                Node<Integer>tail=head;
                while(tail.next!=null){
                    tail=tail.next;
                }
                //Now tail will refere to last node
                //Connect lst node after last node
            }

            data=sc.nextInt();
        }

    }
}
