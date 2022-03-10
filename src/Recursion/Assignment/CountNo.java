package Recursion.Assignment;

import java.util.Scanner;

public class CountNo {
    public static int count(int n){
        if(n==0){
            return 0;
        }
        int sa=count(n/10);
        return sa+1;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(count(n));
    }
}
