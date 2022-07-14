package GeeksForGeeks.java;

public class LRotatedArraybyD {
     static void lRotated(int arr[],int n){
         int temp=arr[0];
         for(int i=1;i<n;i++){
             arr[i-1]=arr[i];
         }
         arr[n-1]=temp;
     }
     static void leftRotated(int arr[],int d,int n){
         for(int i=0;i<d;i++){
             lRotated(arr,n);
         }
     }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5},n=5,d=2;
        leftRotated(arr,d,n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
