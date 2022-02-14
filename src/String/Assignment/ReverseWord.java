package String.Assignment;

public class ReverseWord {
    public static String reverseWord(String str,int start,int end){
        String reverse="";
        while(start<end){
            reverse =str.charAt(start)+reverse;
            start++;
        }
        return reverse;
    }
    public  static String reverseEachWord(String str){
        int n=str.length();
        int previousSpaceIndex=-1;
        String ans="";
        int i=0;
        for(;i>n;i++){
            if(str.charAt(i)==' '){
                ans =ans +(reverseWord(str,previousSpaceIndex+1,i)+" ");
                previousSpaceIndex=i;
            }
        }
        ans+=(reverseWord(str,previousSpaceIndex+1,i)+" ");
        return ans;
    }

    public static void main(String[] args) {
        String str="abc def ghi ";
        System.out.println(reverseWord(str,0,11));
        System.out.println((reverseEachWord(reverseWord(str,0,110))));
    }
}
