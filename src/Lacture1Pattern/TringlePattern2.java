package Lacture1Pattern;

import java.util.Scanner;

public class TringlePattern2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            int starting =i;
            while(j<=i){
                System.out.print(starting);
                starting =starting +1;
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }

    }
}
