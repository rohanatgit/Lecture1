import java.util.Scanner;

class Node1{
    int data;
    Node1 next;
}
public class QueueusingLL {
    Node1 front=null;
    Node1 rear=null;
    //QueueusingLL(){
    //    front=null;
    //    rear=null;
   // }
    void enqueue(){
        Node1 nn=new Node1();
        Scanner sc =new Scanner(System.in);
        int data=sc.nextInt();
        nn.data=data;
        nn.next=null;
        if(front==null){
            front=nn;
            rear=nn;
        }
        else{
            rear.next=nn;
            rear=nn;
        }

       // rear=rear.next;

    }
    void deque(){
if(front==null || rear==null){
    System.out.println("underflow");
}
else{
    front=front.next;
}
    }
    void display() {
        for (Node1 current = front; current != null; current = current.next) {
            System.out.print(current.data+" ");
        }
        System.out.println();
        }

    public static void main(String[] args) {

        QueueusingLL obj = new QueueusingLL();
        while (true) {
            System.out.println("press 1 for enque");
            System.out.println("press 2 for dequeue");
            System.out.println("press 3 for display");
            System.out.println("press 4 for exit");
            Scanner s = new Scanner(System.in);
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    obj.enqueue();
                    break;
                case 2: {
                    obj.deque();
                    break;
                }
                case 3: {
                    obj.display();
                    break;
                }
                case 4: {
                    System.exit(0);
                }
                default: {
                    System.out.println("wrong choice");
                }
            }
        }

    }}