package EEEEEEEEEE;

public class InsertionSort {
    static int[] sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i;
            while( j>0 && temp<arr[j-1] ){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={3,2,4,5,7,1,9,4,33,2,22,33};
        int[] ans=sort(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
