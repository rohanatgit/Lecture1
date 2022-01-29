package Arrays;

import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size =sc.nextInt();
        int numPair=0;
        int x =sc.nextInt();
        int arr[] =new int[size];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    numPair+=1;
                }
            }
    }
        System.out.println(numPair);
    }
}
