package Arrays;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class sum {
    public static int sum(int [] arr){
        int ans =0;
        int size =arr.length;
        for(int i=0;i<size;i++){
            ans =ans +arr[i];
        }
    return ans ;
    }
    public static int[] takeInput(){
        Scanner sc =new Scanner(System.in);
        int size =sc.nextInt();
        int arr[] =new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] =takeInput();
        int sum =sum(arr);
        System.out.println("sum  "+sum);
    }
}

