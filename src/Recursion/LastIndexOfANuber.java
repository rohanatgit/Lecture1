package Recursion;

public class LastIndexOfANuber {
    public static int lastIndex(int input[],int x,int StartIndex){
        if(StartIndex==input.length){
            return -1;
        }
        int smallAns=lastIndex(input,x,StartIndex+1);
        if(smallAns!=-1){
            return smallAns;
        }
        if(input[StartIndex]==x){
            return StartIndex;
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        int input[]={1,5,8,2,5,6};
        System.out.println(lastIndex(input,5,0));
    }
}
