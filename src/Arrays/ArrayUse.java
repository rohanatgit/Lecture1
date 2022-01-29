package Arrays;

import java.util.Scanner;

public class ArrayUse {
    public static int largestInArray(int input[]){
        int max =Integer.MIN_VALUE;
        int size =input.length;
        for(int i=0;i<size;i++){
            if(input[i]>max){
                max=input[i];
            }
        }
        return max;
    }
    public static int [] takeInput() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int input[] = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = sc.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {
        int arr[]=takeInput();
        int largest =largestInArray(arr);
        System.out.println("Largest "+largest);
    }
}
