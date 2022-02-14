package SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class array_insertion {
    public static void innsertion(int a[],int b [],int n ,int m){
        int i=0,j=0;
        while(i<n && j<m){
            if(a[i]>b[j]){
                j++;
            }else if(b[j]>a[i]){
                i++;
            }else{
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int n =sc.nextInt();
            int[] a=new int[n];
            for(int j=0;j<n;j++){
                a[j]=sc.nextInt();
            }
            int m =sc.nextInt();
            int[] b =new int[m];
            for(int j=0;j<m;j++){
                b[j]=sc.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            innsertion(a,b,n,m);
        }
    }
}
