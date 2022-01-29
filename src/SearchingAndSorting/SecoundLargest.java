package SearchingAndSorting;

import java.util.Scanner;

public class SecoundLargest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
      int  secoundLargest=Integer.MIN_VALUE;
        int largest=arr[0];
        if(arr.length==0){
            System.out.println(secoundLargest);
        }
        for(int i=1;i<arr.length;i++){
            if(largest<arr[i]){
                secoundLargest=largest;
                largest =arr[i];
            }else if(secoundLargest<arr[i] && arr[i]!=largest){
                secoundLargest=arr[i];
            }
        }

        System.out.println(secoundLargest);
    }
}
