package CoadingBlockDailyoneproblem;
import java.util.*;

public class TransformToFavouriteString {
    public static void main (String args[]) {
        Scanner sc =new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int c=0;
        int f=0;
        for(int i=0;i<s1.length()-1;i++){
            if(s1.charAt(i)==s1.charAt(i+1)){
                c=1;
            }
        }
        for(int j=0;j<s2.length()-1;j++){
            if(s2.charAt(j)==s2.charAt(j+1)){
                f=1;
            }
        }
        if(c==f){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

}
