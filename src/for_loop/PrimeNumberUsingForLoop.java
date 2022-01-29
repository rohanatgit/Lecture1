package for_loop;

import java.util.Scanner;

public class PrimeNumberUsingForLoop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        for(int d=2;d<=n;d++){
            if(n%d==0){
                System.out.println(d);
                break;
            }else{
                System.out.println();
            }
        }
    }
}
