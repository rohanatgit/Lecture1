package Functions;

import java.util.Scanner;

public class FibbonacciUsingRecusion {
    static int n1 =0,n2=1;
    public static void printFibo(int n){
         //int a =0,b=1;
        if(n>0){
            int n3=n2+n1;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            printFibo(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int n1=0,n2=1;
        System.out.println(n1+" "+n2);
        printFibo(n-2);

    }

}
