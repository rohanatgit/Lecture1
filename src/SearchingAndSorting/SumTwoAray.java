package SearchingAndSorting;

import java.util.Scanner;

public class SumTwoAray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        int sum1=0;
        int sum2 =0;
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        for(int j=0;j<arr2.length;j++){
            arr2[j]=sc.nextInt();
        }
        for(int i=0;i<arr1.length;i++){
            //int sum1 =0;
            sum1 =sum1+arr1[i];
        }
        for(int j=0;j< arr2.length;j++){
           // int sum2=0;
             sum2 =sum2+arr2[j];
        }
        System.out.println(sum1+sum2);
    }
}
