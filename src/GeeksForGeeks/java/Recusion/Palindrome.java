package GeeksForGeeks.java.Recusion;

public class Palindrome {

    public class solution {

        public static boolean isStringPalindrome(String str) {
            if(str.length()<=1){
                return true;
            }
            if(str.charAt(0)==str.charAt(str.length()-1)){
                return isStringPalindrome(str.substring(1,str.length()-1));
            }
            else{
                return false;
            }
        }
    }
}
