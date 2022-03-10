package Recursion.Assignment;

public class MUltipication {
    public static int mul(int x,int y){
        if(x==0 || y==0){
            return 0;
        }
        return x+mul(x,y-1);
    }

    public static void main(String[] args) {
        System.out.println(mul(5,6));
    }
}
