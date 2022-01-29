package SearchingAndSorting;

public class InsertionSort {
    public static void insertionSort(int arr[]){
        for(int i=1;i< arr.length;i++){
            int j=i-1;
            int temp=arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1] =arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String[] args) {
               int arr[] ={6,4,5,8,29};
               insertionSort(arr);
               for (int i=0;i<arr.length;i++){
                   System.out.print(arr[i]+" ");
               }
    }
}
