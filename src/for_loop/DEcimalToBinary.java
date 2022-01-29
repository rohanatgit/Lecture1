package for_loop;

import java.util.Scanner;

public class DEcimalToBinary {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        long binary =0,pow=1;
        while(n>0){
            int lastBit=n%2;
            binary =binary+lastBit*pow;
            pow=pow*10;
            n=n/2;
        }
        System.out.println(binary);
    }
}
