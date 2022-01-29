import java.util.Scanner;

public class Patternn {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(j+" ");
                j++;
                if(j>i){
                    break;
                }
            }
            System.out.println();
            i++;
        }

    }
}
