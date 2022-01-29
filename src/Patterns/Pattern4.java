package Patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            int value =i;
            while(j<=i){
                System.out.print(value);
                value=value+1;
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }
    }
}
