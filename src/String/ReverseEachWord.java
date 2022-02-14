package String;

public class ReverseEachWord {
    public static String reverseEachWord(String str){
        String ans="";
        int i=0;
        int currentWordStart=0;
        for(;i<str.length();i++){
            if(str.charAt(i)== ' '){
                //reverse cirrent word add the final string(ans)
            int currentWordEnd=i-1;
            String reverseWord="";
            for(int j=currentWordStart;j<currentWordEnd;j++){
              reverseWord=str.charAt(j)+reverseWord;
            }
            ans+=reverseWord+" ";
            currentWordStart=i+1;
            }
        }
        int currentWordEnd=i-1;
        String reverseWord="";
        for(int j=currentWordStart;j<currentWordEnd;j++){
            reverseWord=str.charAt(j)+reverseWord;
        }
        ans+=reverseWord+" ";
        currentWordStart=i+1;

        return ans;
    }

    public static void main(String[] args) {
        String str ="abc def ghi";
        System.out.println(reverseEachWord(str));
    }
}
