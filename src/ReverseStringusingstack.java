public class ReverseStringusingstack {
    static String reverse(String s){
        if(s.length()==0 || s.length()==1){
            return s;
        }
        String sa=s.substring(s.length()-1,1);
        return sa+s.charAt(0);
    }
    public static void main(String[] args) {
        String s="shivang";
        reverse(s);
    }
}
