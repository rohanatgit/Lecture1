package Lacture1Pattern;

import java.util.Scanner;

public class CodeAlphaPattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                char startinngChar =(char)('A'+i-1);
                System.out.print(startinngChar);
                startinngChar =(char)(startinngChar +1);
                j++;
            }
            System.out.println();
            i++;

        }
    }
}
