import java.util.*;
public class PrimeNumber {
    public class Main {
        static boolean prime(int n) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (prime(n)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }
}