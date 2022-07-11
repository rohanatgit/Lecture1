package EEEEEEEEEE;

public class LinearSearch {
    static int search(int[] arr,int item){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,6,3,5,2,9};
        int item=5;
        System.out.println(search(arr,item));
    }
}
