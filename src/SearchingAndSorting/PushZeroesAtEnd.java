package SearchingAndSorting;

public class PushZeroesAtEnd {
    public static void pushZeroesToEnd(int [] arr){
        int nonZeroes=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                int temp =arr[i];
                arr[i]=arr[nonZeroes];
                arr[nonZeroes]=temp;
                nonZeroes++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] ={1,2,1,3,1,2,4};
        pushZeroesToEnd(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
