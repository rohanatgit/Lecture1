package Patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int val=1;
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(val);
                val=val+1;
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }
    }
}
