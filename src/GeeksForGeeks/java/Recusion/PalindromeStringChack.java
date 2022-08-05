package GeeksForGeeks.java.Recusion;

public class PalindromeStringChack {
    public static boolean pal(String str,int start,int end){
         if(start>=end){
             return true;
         }
         return ((str.charAt(start)==str.charAt(end)) && pal(str,start+1,end-1));
    }

    public static void main(String[] args) {
        String s="Geekskee";
        System.out.println(pal(s,0,s.length()-1));
    }
}
