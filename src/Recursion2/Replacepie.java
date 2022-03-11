package Recursion2;
public class Replacepie {
    public static String pi(String str){
        String output;
        if(str.length()==0){
            return str;
        }
        String sa=pi(str.substring(1));
        if(str.charAt(0)=='p' && sa.charAt(0)=='i'){
            output= "3.14"+sa.substring(1);
        }else{
            output=str.charAt(0)+sa;
        }
        return output;
    }
    public static void main(String[] args) {
        String str="pigdpi";
        System.out.println(pi(str));
    }
}
