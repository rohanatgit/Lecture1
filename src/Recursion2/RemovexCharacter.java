package Recursion2;

public class RemovexCharacter {
    public static String removeX(String str){
        if(str.length()==0){
            return str;
        }
        String ans ="";
        if(str.charAt(0)!='x'){
            ans =ans +str.charAt(0);
        }
        String sa=removeX(str.substring(1));
        return sa+ans;
    }

    public static void main(String[] args) {
        String str="absxxbsxx";
        System.out.println(removeX(str));
    }
}
