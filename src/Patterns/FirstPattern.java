package Patterns;

import java.util.Scanner;

public class FirstPattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(j);
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }
    }
}