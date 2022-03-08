package Recursion;

public class Sum {
    public static int sum(int input[],int startIndex){
        if(startIndex==input.length){
            return 0;
        }
        return input[startIndex]+sum(input,startIndex+1);
    }
    public static int sum(int input[]){
        return sum(input,0);
    }

    public static void main(String[] args) {
        int input[]={1,5,4,7};
        System.out.println(sum(input));
    }
}
