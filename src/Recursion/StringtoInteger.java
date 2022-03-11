package Recursion;

public class StringtoInteger {
    public static int covertToInt(String str){
        if(str.length()==1){
            return str.charAt(0)-'0';
        }
        int sa=covertToInt(str.substring(0,str.length()-1));
        int lastDigit=str.charAt(str.length()-1)-'0';
        return sa*10+lastDigit;
    }

    public static void main(String[] args) {
        String str="rohan";
        System.out.println(covertToInt(str));
    }
}
