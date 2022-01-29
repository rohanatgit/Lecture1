import java.util.Scanner;

public class PowerOfn {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number =sc.nextInt();
        int power  =sc.nextInt();
        System.out.println("number " +number);
        System.out.println("power "  +power);
        int ans=1;
        while(power>0){
            ans =ans*number;
            power--;
        }
        System.out.println("ans "+ans);
    }
}
