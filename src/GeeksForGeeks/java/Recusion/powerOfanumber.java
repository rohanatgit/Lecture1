package GeeksForGeeks.java.Recusion;

public class powerOfanumber {
    public static int power(int x, int n) {
        if(n==0){
            return 1;
        }
        int sa=power(x,n-1);
        return sa*x;
    }
}
