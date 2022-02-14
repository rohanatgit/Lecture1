package TimeComplexity;

public class ArrayEquilibumIndex {
    public static int arrayEqulibriumIndex(int[] arr){
        int rigthSum =0,leftSum=0;
        for(int i=0;i<arr.length;i++){
            rigthSum+=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            rigthSum-=arr[i];
            if(leftSum==rigthSum){
                return i;
            }
            leftSum+=arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={12455866};
        System.out.println(arrayEqulibriumIndex(arr));
    }
}
