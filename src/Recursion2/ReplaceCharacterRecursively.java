package Recursion2;

public class ReplaceCharacterRecursively {
    public static String replaceCharacter(String str,char c1,char c2){
        if(str.length()==0){
           return str;
        }
        char c;
        if(str.charAt(0)==c1){
             c =c2;
        }
        else{
             c =str.charAt(0);
        }
        String ans =replaceCharacter(str.substring(1),c1,c2);
        return( ans + c);
    }

    public static void main(String[] args) {
        String str="abshohf";
        //System.out.println(replaceCharacter(str, a , c));
    }
}
