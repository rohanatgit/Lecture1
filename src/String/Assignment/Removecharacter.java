package String.Assignment;

public class Removecharacter {
    public static String removeCharcter(String str,char ch){
        int n =str.length();
        String ans ="";
        for(int i=0;i<n;i++){
            if(str.charAt(i)!=ch){
                ans =ans +str.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str ="aaaaaaaaaaaaaabbbbbbbbbbbssssssssss";
        System.out.println(removeCharcter(str,'a'));
    }
}
