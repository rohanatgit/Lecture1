package Lecture2Pattern;

import java.util.Scanner;

public class ReverseTringle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.print("*");
            i++;
        }
        int space =1;
        int j=1;
        while(space<=j-i){
            System.out.print(" ");
            space =space+1;
            System.out.print(j);
            j++;
        }
        System.out.println();
        i++;
    }
}
