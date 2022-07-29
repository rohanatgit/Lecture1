package GeeksForGeeks.java.Strings;

public class PatternSearching {
    static void patSearching(String txt,String pat){
        int m=pat.length();
        int n=txt.length();
        for(int i=0;i<(n-m);i++){
            for(int j=0;j<m;j++){
                if(pat.charAt(j)!=txt.charAt(i+j))
                    break;
                if(j==m)
                    System.out.println(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        String txt="ABCABCD"; String pat="ABCD";
        System.out.print("All index numbers where pattern found: ");
        patSearching(txt,pat);
    }


}
