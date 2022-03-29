package LeetCodeSolution;

import java.io.*;
import java.util.*;

public class Sloutionn {
    public static int findCount(int arr[],int n ,int num,int diff){
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]-num<=diff || num-arr[i]<=diff)
            {
                c++;
            }
        }
        return (c>0?c:-1)/2;

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        int num=sc.nextInt();
        int diff=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(findCount(arr,n,num,diff));

    }
}