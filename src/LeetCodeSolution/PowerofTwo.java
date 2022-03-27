package LeetCodeSolution;

public class PowerofTwo {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        if(n!=1 && n%2!=0) return false;
        if(n<=0) return false;
        if(isPowerOfTwo(n/2)) return true;
        return false;
    }
}
