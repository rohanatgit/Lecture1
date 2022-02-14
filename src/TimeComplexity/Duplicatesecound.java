package TimeComplexity;

public class Duplicatesecound {
    public static int findDuplicate(int [] arr){
        int sumOfNumber=0;
        for(int i=0;i<(arr.length-1);i++){
            sumOfNumber+=i;
        }
        int sumOfElements=0;
        for(int i=0;i<arr.length;i++){
            sumOfElements+=arr[i];
        }
        return (sumOfElements-sumOfNumber);
    }

    public static void main(String[] args) {
        int arr[]={1,1,2,3,4,5,6,7};
        System.out.println(findDuplicate(arr));
    }
}
