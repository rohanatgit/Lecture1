package GeeksForGeeks.java;

public class LeftRotate {
    static void LRotated(int arr[],int n){
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }
    public static void main(String[] args) {
        int arr[]={1,2, 3, 4, 5},n=5;
        LRotated(arr,n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
