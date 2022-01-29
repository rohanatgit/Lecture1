package Lecture2Pattern;

import java.util.Scanner;

public class CodeTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int i=1;
        while(i<=n){
            int space=1;
            while(space<=(n-i)){
                System.out.print(" ");
                space =space +1;

            }
            int j=1;
            int value =i;
            while(j<=i){
                System.out.print('*');
                value =value +1;
                j=j+1;
            }
            j=1;
            value =2*i-2;
            while(j<=i-1){
                System.out.print("*");
                value =value +1;
                j=j+1;

            }
            System.out.println();
            i=i+1;

        }
    }
}
