package Arrays;

import java.util.Scanner;

public class Sort01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int size =sc.nextInt();

        int arr[] =new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int nextZero=0;
        for( int i=0;i< arr.length;i++){
            if(arr[i]==0){
                int temp =arr[nextZero];
                arr[nextZero]=arr[i];
                arr[i]=temp;
                nextZero+=1;
                System.out.println(arr[i]);
            }
        }

    }
}
