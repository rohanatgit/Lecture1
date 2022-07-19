package GeeksForGeeks.java;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
        int d=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int j=0;j<n;j++){
            arr[j]=sc.nextInt();
        }
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}