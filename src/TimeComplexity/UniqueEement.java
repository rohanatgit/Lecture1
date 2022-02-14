package TimeComplexity;

public class UniqueEement {
    public static int findUnique(int[] arr){
        int XOR=0;
        for(int i=0;i<arr.length;i++){
            XOR=XOR^arr[i];
        }
        return XOR;
    }

    public static void main(String[] args) {
        int arr[] ={6,6,3,3,1,1,5};
        System.out.println(findUnique(arr));
    }
}
