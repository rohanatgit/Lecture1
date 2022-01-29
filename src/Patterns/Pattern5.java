package Patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
       // int space=1;
        int i=1;
        while(i<=n){
            int space=1;
            while(space<=n-i){
                System.out.print(" ");
                space =space+1;

            }
            int value =i;
            int j=1;
            while(j<=i){
                System.out.print(value);
                value=value +1;
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }

    }
}
