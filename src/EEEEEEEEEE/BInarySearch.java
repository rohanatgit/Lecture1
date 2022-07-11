package EEEEEEEEEE;
import java.util.Scanner;

 class BinarySearch {
    static int search(int[] arr,int item){
        int si=0;
        int ei=arr.length-1;
        int mid=(si+ei)/2;
        if(arr[mid]==item){
            return mid+1;
        }
        while(si<=ei){
            mid=(si+ei)/2;
            if(arr[mid]==item){
                return mid+1;
            }
            if(item>arr[mid]){
                si=mid+1;
            }
            else{
                ei=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,89};
        System.out.println("enter the item to be search");
        Scanner s=new Scanner((System.in));
        int item=s.nextInt();
        System.out.println(search(arr,item));
    }
}
