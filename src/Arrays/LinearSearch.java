package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static int search(int arr[],int search){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==search){
                return i;
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
        int arr[] =takeInput();
        int linear =search(arr,5);
        System.out.println("Linear Search  "+linear);

    }
    public static int [] takeInput(){
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] =new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
}
