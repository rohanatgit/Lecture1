package GeeksForGeeks.java;

public class arrayDup {
    static int remDup(int arr[],int n){
        int rem=1;
        for(int i=1;i<n;i++) {
            if (arr[rem - 1] != arr[i]) {
                arr[rem] = arr[i];
                rem++;
            }
        }
        return rem;
    }

    public static void main(String[] args) {
        int arr[]={10, 20, 20, 30, 30, 30,10},n=6;
        n=remDup(arr,n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
}
