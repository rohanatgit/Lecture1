package GeeksForGeeks.java.Strings;

public class palindrome {
    boolean isPal(String str){
        int begin=0;
        int end=str.length()-1;
        while(begin<end){
            if(str.charAt(begin)!=str.charAt(end))
                return false;
            begin++;
            end--;
        }
        return true;
    }
}
