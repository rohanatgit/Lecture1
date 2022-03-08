package Recursion;

public class CheckArrayelementsPresentOrnot {
    public static boolean checkNumber(int input[],int x,int startIndex){
        if(startIndex==input.length){
            return false;
        }else if(input[startIndex]==x){
            return true;
        }
        return checkNumber(input,x,startIndex+1);
    }

    public static void main(String[] args) {
        int input[]={1,2,3,4,5,6};
        System.out.println(checkNumber(input,0,0));
    }
}
