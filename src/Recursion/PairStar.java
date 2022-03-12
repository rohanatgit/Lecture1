package Recursion;

public class PairStar {
    public static String pairStar(String str){
        if(str.length()==1){
            return str;
        }
        //String ans ="";
        String sa=pairStar(str.substring(1));

        if(str.charAt(0)==sa.charAt(0)){
           sa =str.charAt(0) +"*"+sa;
           return sa;
        }
        return sa;
    }

    public static void main(String[] args) {
        String str="aaaaa";
        System.out.println(pairStar(str));
    }
}
