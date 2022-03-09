package Recursion;

public class FirstIndexOfANumber {
    public static int firstIndex(int input[],int x ,int StartIndex){
         if(StartIndex==input.length){
            return -1;
        }
        if(input[StartIndex]==x){
            return StartIndex;
        }

        return firstIndex(input,x,StartIndex+1);
    }

    public static void main(String[] args) {
        int input[]={1,6,3,4,5};
        System.out.println(firstIndex(input,100,0));
    }
}
