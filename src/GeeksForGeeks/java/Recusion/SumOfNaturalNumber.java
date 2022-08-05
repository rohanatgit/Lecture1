package GeeksForGeeks.java.Recusion;

public class SumOfNaturalNumber {
    static int sumNatural(int n){
        if(n==0 || n==1){
            return n;
        }
        return n+sumNatural(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sumNatural(5));
    }
}
