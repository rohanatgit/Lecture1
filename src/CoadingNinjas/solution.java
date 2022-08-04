package CoadingNinjas;

import java.util.*;
class Solution {

    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        lastIndex(arr,n,x);
    }
    static void lastIndex(int []arr,int n,int x){
        int last=-1;
        for(int i=n-1;i>=0;i--){
            if(x==arr[i]){
                last=i;
                break;
            }
        }
        System.out.print(last);
    }
}
