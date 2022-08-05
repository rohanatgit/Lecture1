package GeeksForGeeks.java.Recusion;

public class Print1toN {
    static int print(int n){
        if(n==0){
            return 0;
        }
        System.out.print(n);
        return print(n-1);
    }

    public static void main(String[] args) {
        print(5);
    }
}
