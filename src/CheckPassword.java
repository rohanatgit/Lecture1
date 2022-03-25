import java.util.Scanner;

public class CheckPassword {
    public static int chrckPassword(String str,int n) {
        int charc = 0;
        int sp = 0;
        int cap = 0;
        int nc = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) <= 'A' && str.charAt(i) <= 'Z') {
                cap++;
            } else if (str.charAt(i) == ' ' || str.charAt(i) == '/') {
                sp++;
            } else {
                if (Character.isDigit(str.charAt(i))) {
                    nc++;
                }
            }
            if (n >= 4 && nc >= 1 && cap >= 1 && sp == 0 && (!Character.isDigit(str.charAt(0)))) {
                return 1;
            }

        }
        return 0;

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.next();
        int n =str.length();
        System.out.println(chrckPassword(str,n));
    }
}
