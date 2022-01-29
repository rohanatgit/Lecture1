package for_loop;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int decimal =0,pow =1;
        while(n>0){
            int num =n%10;
            decimal +=num*pow;
            pow =pow*2;
            n=n/10;
        }
        System.out.println(decimal);
    }
}
