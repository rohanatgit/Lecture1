package Wordtech;

public class program1 {	int getInversionCount(int[] arr) {
    int count=0;
    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            if(arr[i]>arr[j]){
                count++;

            }
        }
    }
    return count;
}

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println((arr));
    }
}
