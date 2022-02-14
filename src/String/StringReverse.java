package String;

public class StringReverse {
    public static String reverseString(String str){
        String reversedStrin="";
        for(int i=str.length()-1;i>=0;i--){
            reversedStrin+=str.charAt(i);
        }
        return reversedStrin;
    }

    public static void main(String[] args) {
        String str="abcde";
        System.out.println(reverseString(str));
    }
}
