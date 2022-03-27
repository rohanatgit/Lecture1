package LeetCodeSolution;

public class QuickSort {
    public static void sort(int[] arr,int si,int ei){
        if(si>=ei){
            return;
        }
        int pi=partition(arr,si,ei);
        sort(arr,si,pi-1);
        sort(arr,pi+1,ei);
    }

    public static int partition(int[] arr,int si,int ei){
        int pivet=arr[si];
        int c=0;
        for(int i=si+1;i<=ei;i++){
            if(arr[i]<=pivet){
                c++;
            }
        }
        int pi=si+c;
        arr[si]=arr[pi];
        arr[pi]=pivet;

        for(int i=si;i<=pi-1;i++){
            for(int j=ei;j>=pi+1;j--){
                 if(arr[i]<=pivet){
                    i++;
                }
                else if(arr[j]>pivet){
                    j--;
                }
                else{
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                 }
            }
        }
        return pi;
    }
    public static void main(String[] args) {
        int[] arr={2,1,3,2,5,4};
        int si=0;
        int ei=arr.length-1;
        sort(arr,si,ei);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
