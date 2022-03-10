package Recursion.Assignment;

//import static sun.security.util.Debug.args;

public class CountZeroes {
    public static int countZeroes(int x) {
        if (x < 10) {
            if (x == 0) {
                return 1;
            } else {
                return 0;
            }
            if (x % 10 == 0) {
                return countZeroes(x / 10) + 1;
            } else {
                return countZeroes(x / 10);
            }
        }
        //  public static void main(String args[]){

    }
}