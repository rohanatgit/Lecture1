package Patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int n =sc.nextInt();
        int currRow=1;
        while(currRow<=n){
            int space =1;
            while(space<=(n-currRow)){
                System.out.print(" ");
                space =space +1;
            }
            int currCol =1;
            while(currCol<=(2*currRow)-1){
                System.out.print("*");
                currCol =currCol+1;
            }
            System.out.println();
            currRow =currRow+1;
        }
    }
}
