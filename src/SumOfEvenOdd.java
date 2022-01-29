import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();
        int evenSum=0,oddSum=0;
        while(number>0){
            int last =number%10;
            if(last%2 ==0){
                evenSum =evenSum+last;
            }else{
                oddSum=oddSum+last;
            }
            number=number/10;
        }
        System.out.println(evenSum+" "+oddSum);

    }
}
