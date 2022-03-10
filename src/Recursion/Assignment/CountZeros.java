package Recursion.Assignment;

public class CountZeros {
    public static int countzeros(int n){
        if(n==0){
            return n;
        }
        int sa=countzeros(n/10);
        int p=n%10;
        if(p==0){
            return sa+1;
        }
            return sa;
    }
    public static void main(String[] args) {
        int x=10067000;
        System.out.println(countzeros(x));
    }
}
