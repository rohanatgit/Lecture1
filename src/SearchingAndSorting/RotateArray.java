package SearchingAndSorting;

public class RotateArray {
    private static void swapElements(int[] arr,int start,int end ){
        int temp =arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    private static void reverse(int arr[],int start,int end ){
        while(start<end){
            swapElements(arr,start,end);
            start+=1;
            end-=1;
        }
    }
    public static void rorate(int arr[] ,int d){
        if(arr.length==0){
            return ;
        }
        if(d>=arr.length && arr.length!=0){
            d%= arr.length;
        }
        reverse(arr,0, arr.length-1);
        reverse(arr,0,arr.length-d-1);
        reverse(arr, arr.length-d, arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr={0,1,2,0,5,6,8,4,2};
       // System.out.println(reverse(arr,5,9));


    }
}
