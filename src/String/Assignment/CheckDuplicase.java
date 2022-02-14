package String.Assignment;

public class CheckDuplicase {
    public static String checkDuplicate(String str){
        int n =str.length();
        if(n==0){
            return str;
        }
        String answer="";
        int startIndex=0;
        while(startIndex<n){
            char uniqueChar=str.charAt(startIndex);
            int nextUniqueCharIndex=startIndex+1;
            while(nextUniqueCharIndex<n && str.charAt(nextUniqueCharIndex)==uniqueChar){
                nextUniqueCharIndex +=1;
            }
            answer+=uniqueChar;
            startIndex=nextUniqueCharIndex;
        }
        return answer;
    }

    public static void main(String[] args) {
        String str ="aaabbbss";
        System.out.println(checkDuplicate(str));
    }
}
