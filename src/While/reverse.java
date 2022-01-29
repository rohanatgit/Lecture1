package While;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
       String   reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
          String original = sc.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("  yes");
        else
            System.out.println("no");
    }
}
