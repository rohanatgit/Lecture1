package Recursion;

public class SumOfArrayUsingRecursion {
    public static int Sum(int input[]){
        int sum=0;
        for(int i=1;i<input.length;i++){
            sum=sum+input[i];
        }
        return input[0]+sum;
    }

    public static void main(String[] args) {
        int input[]={5,5,6,1};
        System.out.println(Sum(input));
    }
}