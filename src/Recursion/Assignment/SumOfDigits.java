package Recursion.Assignment;

public class SumOfDigits {
    public static int sum(int x){
        if(x==0){
            return 0;
        }
        int sa=sum(x/10)+x%10;
        return sa;
    }

    public static void main(String[] args) {
        int x=10234;
        System.out.println(sum(x));
    }
}
