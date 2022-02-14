package TwoDimanstionArray;

public class WavePrint {
    public static void print(int input[][]){
        int rows =input.length;
        int cols=input[0].length;
        for(int j=0;j<cols;j++){
            if(j%2==0){
                for(int i=0;i<rows;i++){
                    System.out.print(input[i][j]+" ");
                }
            }
            else{
                for(int i=rows-1;i>=0;i--){
                    System.out.print(input[i][j]+" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int input[][]={{1,2,3,4},{5,6,5,4},{5,2,4,8},{2,5,5,4}};
        print(input);
    }
}
