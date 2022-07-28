package GeeksForGeeks.java.Strings;

import java.util.Scanner;

public class SubSeq {
    static boolean isSunSeq(String s1,String s2,int n,int m){
        int j=0;
        for(int i=0;i<n && j<m ;i++){
            if (s1.charAt(i)==s2.charAt(j))
                j++;
        }
        return j==m;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int m= sc.nextInt();
        String s1=sc.next();
        String s2=sc.next();
        System.out.println(isSunSeq(s1,s2,n,m));
    }
}
