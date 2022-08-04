import java.util.Scanner;

public class CountOccurences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
         char search=sc.next().charAt(0);
        int c=0;
        for(int i=0;i<input.length();i++){
            if (input.charAt(i)==search){
              c++;
            }
        }
        System.out.println(c);
    }
}
