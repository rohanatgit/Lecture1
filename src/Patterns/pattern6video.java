package Patterns;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class pattern6video {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int i=1;
       // int space;
        while(i<=n){
            int space=1;
            while(space<=n-i){
                System.out.print(' ');
                space =space+1;
            }
            int star =1;
            while(star<=2*i-1){
                System.out.print('*');
                star=star+1;
            }
            System.out.println();
            i=i+1;
        }
    }
}
