package Lacture1Pattern;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();//4
        int i=1;
        while(i<=n){//true
            int j=1;
            while(j<=n){//t
                System.out.print(n-j+1);
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }
    }
}
