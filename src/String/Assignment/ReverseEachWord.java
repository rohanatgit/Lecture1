package String.Assignment;

public class ReverseEachWord {
    public static String reverseEachWord(String str){
        String rev ="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                for(int j=str.length()-1;j>0;j--){
                    rev=rev+str.charAt(j);
                }
            }
        }
        return rev;
    }

    public static void main(String[] args) {
        String str="welcome to my world";
        System.out.println(reverseEachWord(str));
    }
}
