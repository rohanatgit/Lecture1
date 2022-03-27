import java.io.*;
import java.util.*;

public class Sloution2 {

    public static int solve(int r,int unit,int n,int arr[])
    {
        int sum=0,c=0;
        int req=r*unit;
        if(arr==null)
            return -1;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
            c++;
            if(req<=sum)
                break;
        }
        if(req>sum)
            return 0;
        return c;

    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int unit=s.nextInt();
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int result=solve(r,unit,n,arr);
        System.out.println(result);

    }
}