package Recursion3;


class Solution {
   public static  int kDiffPairs (int[] A, int k) {
        int c=0;
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]-A[j]==k || A[j]-A[i]==k){
                    c++;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
       int A[]={1,2,4,5};
       int k=4;
        System.out.println(kDiffPairs(A,k));
    }

}
