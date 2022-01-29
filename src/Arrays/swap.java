package Arrays;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size =sc.nextInt();

        int arr[] =new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size-1;i=i+2){
            int temp =arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            System.out.println(temp);
        }


    }
}
