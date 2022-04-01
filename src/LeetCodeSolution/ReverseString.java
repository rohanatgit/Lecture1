package LeetCodeSolution;

public class ReverseString {
    public void reverseString(char[] s) {
        char[] arr=new char[s.length];
        int j=0;
        for(int i=s.length-1;i>=0;i--){
            arr[j]=s[i];
            j++;
        }
        for(int k=0;k<=s.length-1;k++){
            s[k]=arr[k];
        }
    }
}
