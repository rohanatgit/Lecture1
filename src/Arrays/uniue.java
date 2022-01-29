package Arrays;

import java.util.Scanner;

public class uniue {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        int j = 0;
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i< arr.length;i++){
            for( j=0;j<arr.length;j++){
                if(i!=j){
                    if(arr[i]==arr[j]){
                        break;
                    }
                }
            }
            if(j==arr.length){
                System.out.println(arr[i]);
            }
        }
    }
}
