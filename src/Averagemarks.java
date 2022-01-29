import java.util.Scanner;
public class Averagemarks {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char  c =sc.next().charAt(0);
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3 =sc.nextInt();
        int avg = (m1+m2+m3)/3;
        System.out.println(c);
        System.out.println(avg);
    }
}
