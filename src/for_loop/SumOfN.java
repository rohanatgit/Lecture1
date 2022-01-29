package for_loop;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int m = sc.nextInt();
        int sum =0;
        for(int i=1,j=1;i<=n;i=i+1,j=j+1){
            sum =sum +i;

        }
        System.out.println(sum);
    }
}
