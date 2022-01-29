package for_loop;

import java.util.Scanner;

public class ReverseOfaNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int revNum=0;
        while(n>0){
             int lastDigit =n%10;
             n=n/10;
             revNum =revNum*10+lastDigit;
        }
        System.out.println(revNum);
    }
}
