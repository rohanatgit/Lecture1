package Recursion3;

public class Subsequence {
     public static String[] findSubSequence(String str){
         if(str.length()==0){
             String ans [] ={""};
             return ans;
         }
         String sa[]=findSubSequence(str.substring(1));
         String ans []=new String [2*sa.length];
         for(int i=0;i< sa.length;i++){
             ans[i]=sa[i];
         }
         for(int i=0;i<sa.length;i++){
             ans[i+sa.length]=str.charAt(0)+sa[i];
         }
         return ans;
     }

    public static void main(String[] args) {
        String str="xyz";
        String ans[]=findSubSequence(str);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
