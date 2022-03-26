public class QuickSort {
    public static int partition(int a[],int si,int ei){
        int pivot=a[si];
        int countSmaller=0;
        for(int i=si+1;i<=ei;i++){
            if(a[i]<=pivot){
                countSmaller++;
            }
        }
        int pivotIndex=countSmaller+si;
        a[si]=a[pivotIndex];
        a[pivotIndex]=pivot;
        int i=si;
        int j=ei;
        while(i<pivotIndex && j>pivotIndex){
            if(a[i]<=pivot){
                i++;
            }else if(a[j]>pivot){
                j--;
            }else{
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
        return pivotIndex;
    }
    public static void quickSort(int a[],int si,int ei){
        if(si>=ei){
            return;
        }
        int p= partition(a,si,ei);
        quickSort(a,si,p-1);
        quickSort(a,p+1,ei);

    }

    public static void main(String[] args) {
        int a[]={5,8,7,2,3,1,9};
        quickSort(a,0,6);
        for(int i=0;i<7;i++){
            System.out.print(a[i]+" ");
        }
    }
}
