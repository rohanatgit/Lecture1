package GeeksForGeeks.java;

public class lRotateed {
    static void llrotated(int arr[],int d,int n){
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    static void reverse(int arr[],int low,int high){
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5},n=5,d=2;
        llrotated(arr,d,n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
