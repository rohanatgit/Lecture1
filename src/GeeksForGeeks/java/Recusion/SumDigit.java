package GeeksForGeeks.java.Recusion;

public class SumDigit {
    public static int sumDigit(int n){
        if(n==0){
            return 0;
        }
        return sumDigit(n/10)+(n%10);
    }

    public static void main(String[] args) {
        System.out.println(sumDigit(123));
    }
}
