package CoadingNinjas;

public class SumOfArrayUsingrecursion {
    public class Solution {

        public static int sum(int input[]) {
            return help(input,0,input.length-1);
        }
        public static int help(int[] arr,int lb,int ub){
            if(lb>=ub){
                return arr[ub];
            }
            int sa=help(arr,lb+1,ub);
            return sa+arr[lb];
        }
    }
}
