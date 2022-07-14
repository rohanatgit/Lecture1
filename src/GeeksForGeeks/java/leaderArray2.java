package GeeksForGeeks.java;

public class leaderArray2 {
    static void leaders(int arr[],int n){
        int curr=arr[n-1];
        System.out.println(curr+" ");
        for(int i=n-2;i>=0;i--){
            if(curr<arr[i]){
                curr=arr[i];
                System.out.println(curr+" ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={7,10,4,5,6,8,9},n=7;
        leaders(arr,n);
    }
}
