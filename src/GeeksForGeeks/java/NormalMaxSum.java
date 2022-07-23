package GeeksForGeeks.java;

public class NormalMaxSum {
    static int normalMaxSum(int arr[],int n){
        int res=arr[0];
        int maxEnding=arr[0];
        for(int i=1;i<n;i++){
            maxEnding=Math.max(maxEnding+arr[i],arr[i]);
            res=Math.max(maxEnding,res);
        }
        return res;
    }
    static int overallMaxSum(int arr[],int n){
        int maxnormal=normalMaxSum(arr,n);
        if(maxnormal<0)
            return maxnormal;
        int arrsum=0;
        for(int i=0;i<n;i++){
            arrsum+=arr[i];
            arr[i]=-arr[i];
        }
        int max_circular=arrsum+normalMaxSum(arr,n);
        return Math.max(max_circular,maxnormal);
    }

    public static void main(String[] args) {
        int arr[]={8,-4,3,-5,10000},n=5;
        System.out.println(overallMaxSum(arr,n));
    }
}
