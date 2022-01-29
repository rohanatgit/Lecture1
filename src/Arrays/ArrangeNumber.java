package Arrays;

import java.util.Scanner;

public class ArrangeNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size =sc.nextInt();
        int arr[]=new int[size];
        int left=0;
        int right=size-1;
        int counter =1;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        while(left<=right){
            if(counter%2==1){
                arr[left]=counter;
                counter++;
                left++;
            }else{
                arr[right]=counter;
                counter +=1;
                right-=1;
            }
        }

    }
}
