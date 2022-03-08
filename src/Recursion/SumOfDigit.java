package Recursion;

public class SumOfDigit {
    static int sum(int n){
        if(n==0){
            return 0;
        }
        int sm=n%10+sum(n/10);
        return sm;
    }

    public static void main(String[] args) {
        System.out.println(sum(102));
    }
}
