package EEEEEEEEEE;

public class SelectionSort {
    static int[] sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min=arr[i];
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(min>arr[j]){
                    min=arr[j];
                    minpos=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minpos];
            arr[minpos]=temp;
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
