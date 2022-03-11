package Recursion2;

public class MergeSort {
    public static void merrge(int arr[],int si,int ei){
        int size=ei-si-1;
        int mid =(si+ei)/2;
        int[] out=new int[size];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                out[k]=arr[i];
                i++;
                k++;
            }else{
                j++;
                k++;
            }
        }
        while(i<=mid){
            out[k]=arr[i];
            k++;
            i++;
        }
        while(j<=ei){
            out[k]=arr[j];
            k++;
            j++;
        }
        int m=0;
        for(int i1=si;i1<ei;i1++){
            arr[i]=out[m];
            m++;
        }
    }
    public static void merge (int arr[] ,int si,int ei){
        if(si>=ei){
            return ;
        }
        int mid=(si+ei)/2;
        merge(arr,si,mid);
        merge(arr,mid+1,ei);
        merge(arr,si,ei);
    }

    public static void main(String[] args) {
        int arr[]={6,5,4,3,2,1};
        merge(arr,0,5);
        for(int i=0;i<6;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
