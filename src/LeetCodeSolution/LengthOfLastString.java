package LeetCodeSolution;

public class LengthOfLastString {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int len=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                break;
            }
            else {
                len++;
            }
        }
        return len;

    }
}
