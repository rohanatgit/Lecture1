package EEEEEEEEEE;

public class Quicksort {
    static void quicksort(int[] arr){
        int si=0;
        int ei=arr.length-1;
        quicksort(arr,si,ei);
    }
    static void quicksort(int[] arr,int si,int ei){
        if(si>=ei){
            return ;
        }
        int pivetindex=partition(arr,si,ei);
        quicksort(arr,si,pivetindex-1);
        quicksort(arr,pivetindex+1,ei);
    }
    static int partition(int[] arr,int si,int ei){
        int pivet=arr[si];
        int c=0;
        for(int i=si+1;i<=ei;i++){
            if(arr[i]<=pivet){
                c++;
            }
        }
        int pi=c+si;
        int temp=arr[pi];
        arr[pi]=arr[si];
        arr[si]=temp;
        int i=si;
        int j=ei;
        while(i<pi && j>pi){
            if(arr[i]<=pivet)
                i++;
            else if(arr[j]>pivet)
                j--;
            else{
                int tem=arr[i];
                arr[i]=arr[j];
                arr[j]=tem;
                i++;
                j--;
            }
        }
        return pi;
    }

    public static void main(String[] args) {
        int[] arr={4 ,6, 4, 2, 4, 56 ,7};
        quicksort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
