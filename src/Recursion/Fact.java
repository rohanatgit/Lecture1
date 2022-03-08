package Recursion;

public class Fact {
    static int fact(int n){
        if(n==0 || n==1) {
            return 1;
        }
        int smallAns=n*fact(n-1);
        return smallAns;
    }

    public static void main(String[] args) {
        System.out.println( fact(5));
    }
}
