package for_loop;

import java.util.Scanner;

public class FindAP {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int current =1;
       for(int i=0;i<=n;i++){
           int num =3*current+2;
           if(num%4!=0){
               System.out.print(num+" ");
           }
           current++;

       }
    }
}
