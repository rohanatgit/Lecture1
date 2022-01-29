package for_loop;

import java.util.Scanner;

public class SumOfProduct {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int choice =sc.nextInt();
         if(choice ==1){
             int sum =0,num =1;
             while(num<=n){
                 sum =sum +num;
                 num++;
             }
             System.out.println(sum);
         }
         else if(choice==2){
             int product=1,num =1;
             while(num <=n){
                 product =product*num;
                 num++;
             }
             System.out.println(product);
         }
         else{
             System.out.println("-1");
         }
    }
}
