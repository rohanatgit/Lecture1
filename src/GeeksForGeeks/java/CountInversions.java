package GeeksForGeeks.java;

public class CountInversions {
    static long inversionCount(long arr[], long n)
    {
        int c=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    c++;
                }
            }
        }
        return c;
    }
}
