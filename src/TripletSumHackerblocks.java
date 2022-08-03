import java.util.Scanner;
import java.util.*;
public class TripletSumHackerblocks {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum=arr[i]+arr[j];
                int tar=target-sum;
                for(int h=j+1;h<arr.length;h++){
                    if(arr[h]==tar){
                        System.out.println(arr[i]+", "+arr[j]+" "+"and "+arr[h]);
                    }
                }
            }
        }
    }
}
