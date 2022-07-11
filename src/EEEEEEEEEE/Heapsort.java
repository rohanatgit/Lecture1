package EEEEEEEEEE;

public class Heapsort {
    public static void main(String[] args) {
        int[] arr={33,22,11,55,44,6,44,4,222};
        sorted(arr);
        printarray(arr);
    }
    static void sorted(int[] arr){
        int n=arr.length;
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }
        for(int i=n-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,i,0);
        }

    }
    static void heapify(int[] arr,int n,int i){
        int largest=i;
        int lc=2*i+1;
        int rc=2*i+2;
        if(lc<n && arr[lc]>arr[largest]){
            largest=lc;
        }
        if(rc<n && arr[rc]>arr[largest]){
            largest=rc;
        }
        if(largest!=i){
            int swap=arr[i];
            arr[i]=arr[largest];
            arr[largest]=swap;
            heapify(arr,n,largest);
        }
    }
    static void printarray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
