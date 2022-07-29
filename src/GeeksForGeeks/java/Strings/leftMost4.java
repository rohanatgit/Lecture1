package GeeksForGeeks.java.Strings;

import java.util.Arrays;

public class leftMost4 {
    static final int CHAR=256;
    static int leftMost(String str){
        int [] fIndex=new int[CHAR];
        Arrays.fill(fIndex,-1);
        int res=Integer.MAX_VALUE;
        for(int i=0;i<str.length();i++){
            int fi=fIndex[str.charAt(i)];
            if(fi==-1){
                fIndex[str.charAt(i)]=i;
            }
            else{
                res=Math.min(res,fi);
            }
        }
        return (res==Integer.MAX_VALUE)?-1:res;
    }
}
