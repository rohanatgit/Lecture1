public class MergeSort {
    //very fast compare to bubble sort ,SelectionSort
    public static void merge(int a[],int si,int ei){
        int size=ei-si+1;
        int mid=(si+ei)/2;
        int[] out=new int[size];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(a[i]<a[j]){
                out[k]=a[i];
                i++;
                k++;
            }else{
                out[k]=a[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            out[k]=a[i];
            k++;
            i++;
        }
        while(j<=ei){
            out[k]=a[j];
            k++;
            j++;
        }
        int m=0;
        for( i=si; i<=ei;i++){
            a[i]=out[m];
            m++;
        }
    }
    public static void mergeSotr(int a[],int si,int ei){
        if(si>=ei){
            return ;
        }
        int mid=(si+ei)/2;
        mergeSotr(a,si,mid);
        mergeSotr(a,mid+1,ei);
        merge(a,si,ei);
    }

    public static void main(String[] args) {
        int a[]={6,5,4,3,2,1};
        mergeSotr(a,0,5);
        for(int i=0;i<6;i++){
            System.out.print(a[i]+" ");
        }
    }
}
