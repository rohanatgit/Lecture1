package GeeksForGeeks.java;

public class maxConsecutiveSum {
    static int maxConsecutiveOnes(int arr[],int n){
        int res=0,count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count=0;
            }
            else{
                count++;
              //  res=Math.max(res,count);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[]={0,1,1,0,1,1,1,1},n=8;
        System.out.println(maxConsecutiveOnes(arr,n));
    }
}
