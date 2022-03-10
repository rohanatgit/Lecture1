package Recursion2;

public class RemoveDuplicase {
    public static String removeDuplicae(String str){
        if(str.length()<=1){
            return str;
        }
        if(str.charAt(0)==str.charAt(1)){
            return removeDuplicae(str.substring(1));
        }else {
            String sa = removeDuplicae(str.substring(1));
            return str.charAt(0) + sa;
        }
    }

    public static void main(String[] args) {
        String str="aaaabbbsss";
        System.out.println(removeDuplicae(str));
    }
}
