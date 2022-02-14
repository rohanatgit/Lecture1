package String;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        String pal;
        String rev ="";
        for(int i=str.length();i>=0;i--){
            rev=rev+str.charAt(i);
        }
    }

}
