import java.util.Scanner;

public class CircularQueue {
    int front;
    int rare;
    int[] arr;
    CircularQueue(){
        front=-1;
        rare=-1;
        arr=new int[5];
    }
    void enqueue(){
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();
        if(front==rare+1){
            System.out.println("overflow");
        }
        if(front==-1){
            front=0;
        }
        else if(front<rare){
            rare++;
            arr[rare]=data;
        }
        else if(front>rare){
            rare=0;
            arr[rare]=data;
            rare++;
        }
    }
    void deque(){
        if(front==-1){
            System.out.println("underflow");
        }
        if(front==rare){
            front=-1;
            rare=-1;
        }else if(front<rare) {
            front++;
        }
        else if(front==arr.length-1){
            front=0;
            front++;
        }
    }
    void display(){
        if(front==-1){
            System.out.println("underflow");
        }
        else if(front<rare){
            for(int i=front;i<=rare;i++){
                System.out.print(arr[i]+" ");
            }
        }
        else if(front>rare){
            for(int i=front;i<arr.length-1;i++){
                System.out.print(arr[i]);
            }
            for(int i=0;i<=rare;i++){
                System.out.print(arr[i]+" ");
            }
        }

    }
    public static void main(String[] args) {
        CircularQueue obj = new CircularQueue();
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
