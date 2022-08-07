package CoadingBlockDailyoneproblem;

import java.util.Scanner;

public class primeNumber {
    static boolean checkPrime(int n){
        for(int i=2;i<n;i++) {
            if (n % 2 == 0) {
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
      if(checkPrime(n)){
          System.out.println("prime");
      }
      else{
          System.out.println("Not Prime");
      }
    }
}
