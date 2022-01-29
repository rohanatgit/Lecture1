package Lecture2Pattern;

import java.util.Scanner;

public class IsosclesTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int i=1;
        while(i<=n){
            int space =1;
            while(space<=n-i){
                System.out.print(" ");
                space++;
            }
            int j=1;
            int p=1;
            while(j<=i){
                System.out.print(p);
                p++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
