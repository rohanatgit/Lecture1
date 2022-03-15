package ArrayWithKunal.LinearSearch;

public class Program3 {
    public static int linesarSearch(int arr[],int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={2,6,5,4,4,1};
        System.out.println(linesarSearch(arr,4,5,5));
    }
}
