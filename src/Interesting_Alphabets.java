import java.util.Scanner;

public class Interesting_Alphabets {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            char ch =(char)('A'+n-i);
            while(j<=i){
                System.out.print(ch);
                ch =(char)(ch+1);
                j++;

            }
            System.out.println();
            i++;

        }
    }
}
