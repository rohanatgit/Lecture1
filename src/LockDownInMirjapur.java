import java.util.Scanner;

public class LockDownInMirjapur {
    public static long fact(long n){

        long fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main (String args[]) {
        Scanner sc =new Scanner(System.in);
        int T=sc.nextInt();
        for(int j=0;j<T;j++){
            int n=sc.nextInt();
            int R=sc.nextInt();
            long ans=fact(n)/(fact(n-R)*fact(R));
            System.out.println(ans);
        }


    }}
