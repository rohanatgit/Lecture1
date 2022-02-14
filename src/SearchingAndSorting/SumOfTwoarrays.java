package SearchingAndSorting;

import java.util.Scanner;

public class SumOfTwoarrays {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr1[]=new int [n];
        int m =sc.nextInt();
        int arr2[]=new int[m];
        int p =sc.nextInt();
        int output[]=new int[p];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        for (int j=0;j<arr2.length;j++){
            arr2[j]=sc.nextInt();
        }
        int i= arr1.length-1;
        int j =arr2.length-1;
        int carry =0;
        int k=Math.max(arr1.length, arr2.length);
        while(i>0 && j>=0){
            int sum =arr1[i]+arr2[j];
            output[k]=sum/10;
            i-=1;
            j-=1;
            k-=1;
        }
        while(i>=0){
            int sum =arr1[i]+carry;
            output[k]=sum%10;
            carry=sum/10;
            j-=1;
            k-=1;
        }
        output[0]=carry;
    }
}
