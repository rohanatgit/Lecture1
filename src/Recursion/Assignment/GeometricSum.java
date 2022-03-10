package Recursion.Assignment;



public class GeometricSum {
    public static double Sum(int k){
        if(k==0){
            return 1;
        }
        double sa=Sum(k-1);
        return 1/Math.pow(2,k)+sa;
    }

    public static void main(String[] args) {
        System.out.println(Sum(3));
    }
}
