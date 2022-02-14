package Recursion;

public class Power {
    public static int power(int n ,int x){
        if(x==0 && n==0 ){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int smallAns =power(n/2,x);
        if(n%2==0){
            return smallAns*smallAns;
        }else{
            return x*smallAns*smallAns;
        }
    }

    public static void main(String[] args) {
        System.out.println(power(2,3));
    }
}
