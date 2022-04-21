package TotalSearching;

public class BInarySearching {
    public static int binarySeaching(int arr[],int terget){
        int l=0,r=arr.length-1;
        while(l<=r){
              int m=(l+r)/2;
              if(arr[m]==terget){
                  return m;
              }
              if(arr[m]<terget){
                  l=m+1;
              }else{
                  r=m-1;
              }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int n =arr.length;
       // int terget=10;
        System.out.println(binarySeaching(arr,5));
    }
}
