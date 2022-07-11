package EEEEEEEEEE;

public class Mergesort {
    static void  mergesort(int[] arr){
        int si=0;
        int ei=arr.length-1;
        mergesort(arr,si,ei);

    }
    static void mergesort(int[] arr,int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=(si+ei)/2;
        mergesort(arr,si,mid);
        mergesort(arr,mid+1,ei);
        merge(arr,si,ei);
    }
    static void merge(int[] arr,int si,int ei){
        int mid=(si+ei)/2;
        int[] ans=new int[ei-si+1];
        int i=si;
        int c=0;
        int j=mid+1;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                ans[c]=arr[i];
                c++;
                i++;
            }
            else{
                ans[c]=arr[j];
                c++;
                j++;
            }
        }
        while(i<=mid){
            ans[c]=arr[i];
            c++;
            i++;
        }
        while(j<=ei){
            ans[c]=arr[j];
            c++;
            j++;
        }
        for(int m=0;m<ans.length;m++){
            arr[si+m]=ans[m];
        }
    }

    public static void main(String[] args) {
        int[] arr={3,2,4,5,7,1,9,4,33,2,22,33};
        mergesort(arr);
        for(int l=0;l<arr.length;l++){
            System.out.print(arr[l]+" ");
        }
    }
}
