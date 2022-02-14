package TimeComplexity;

public class Duplicate {
    public static int dublicateInArray(int arr[]){
        int sum =0;
        for(int i=0;i<arr.length-1;i++){
            sum =sum+arr[i];
        }
        int n =arr.length;
        int sumOfNaturalNumber=((n-1)*(n-2)/2);
        return sum-sumOfNaturalNumber;
    }

    public static void main(String[] args) {
        int arr[]={1,1,3,4,5,6,7,8};
        System.out.println(dublicateInArray(arr));
    }
}
