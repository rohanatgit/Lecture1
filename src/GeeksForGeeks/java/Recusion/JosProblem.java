package GeeksForGeeks.java.Recusion;

public class JosProblem {
    static int jos(int n,int k){
        if(n==1){
            return 0;
        }
        else{
            return (jos(n-1,k)+k)%n;
        }

    }
    static int myjos(int n,int k){
        return jos(n,k)+1;
    }

    public static void main(String[] args) {
        System.out.println(myjos(5,3));
    }
}
