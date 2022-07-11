package GeeksForGeeks.java;

public class ArrayReverse {
    static void reverse(int arr[],int n){
        int low=0,high=n-1;
        while(low<high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int arr[]={10,5,5,8,9,8,7},n=7;
        reverse(arr,n);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
