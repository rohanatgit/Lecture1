import java.util.Scanner;

public class Queueimplementationbyarray {
    int front;
    int rear;
    int[] arr;

    Queueimplementationbyarray() {
        front = -1;
        rear = -1;
        arr = new int[5];
    }

    void enqueue() {
        if (rear == arr.length - 1) {
            System.out.println("overflow");
        } else {
            Scanner s = new Scanner(System.in);
            int data = s.nextInt();
            if (front == -1) {
                front = 0;
            }
            rear++;
            arr[rear] = data;

        }
    }

    void dequeue() {
        if (rear == -1 && front == -1) {
            System.out.println("underflow");
        } else {
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
        }
    }

    void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Queueimplementationbyarray obj = new Queueimplementationbyarray();
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
                    obj.dequeue();
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

    }
}