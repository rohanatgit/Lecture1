package Lacture1Pattern;

import java.util.Scanner;

public class patternprint {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print("Shubh");
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }

    }
}
