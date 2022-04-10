package GeeksForGeeks;

public class MaximumIndex {
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int A[], int N) {
        int i=0;
        int j=0;
        int ans =0;
        while(j<N){
            if(A[i]<=A[j]){
                ans =Math.max(ans,j-i);
            }
            else if(j==N-1){
                i++;
                j=i;
            }
            j++;
        }
        return ans ;

    }
}
