package Arrays;

import java.util.Scanner;

public class Intersaction {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size =sc.nextInt();
        int arr1[] =new int[size];
        int size2 =sc.nextInt();
        int arr2[] =new int[size2];

        for(int i=0;i<size;i++){
            arr1[i]=sc.nextInt();
        }
        for(int j=0;j<size2;j++){
            arr2[j]=sc.nextInt();
        }
        int i=0,j=0;
        for( i=0;i<arr1.length;i++){
            for( j=0;j< arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]+" ");
                    arr2[j]=Integer.MIN_VALUE;
                    break;
                }
            }
        }

    }
}
