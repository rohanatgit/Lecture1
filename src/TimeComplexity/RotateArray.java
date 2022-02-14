package TimeComplexity;

public class RotateArray {
    public static void swap(int arr[],int start,int end){
             int temp=arr[start];
             arr[start]=arr[end];
             arr[end]=temp;
    }
    private static void reverse(int [] arr,int start,int end){
        while(start<end){
            swap(arr,start,end);
            start+=1;
            end+=1;
        }
    }
    public static void rotate(int[] arr, int d){
        if(arr.length==0){
            return ;
        }
        if(d>arr.length && arr.length!=0){
            d%=arr.length;
        }
        reverse(arr,0,arr.length-1);
        reverse(arr,0, arr.length-d-1);
        reverse(arr,arr.length-d,arr.length-1);
        return ;
    }

    public static void main(String[] args) {
        int arr[]={1,0,2,5,5,6,3,5,4,8};
       // System.out.println((rotate(arr,2));
    }
}
