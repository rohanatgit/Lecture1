package While;

import java.util.Scanner;

public class FahrenTable {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int start =sc.nextInt();
        int end =sc.nextInt();
        int w=sc.nextInt();
        int f =start;
        while(f<=end){
            int c =(int)((5.0/9)*(f-32));
            System.out.println(f+"\t"+c);
            f=f+w;
        }
    }
}
