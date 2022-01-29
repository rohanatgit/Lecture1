package SearchingAndSorting;

public class BubleSort {
    public static void bubleSort(int[] input){
        for(int i=0;i<input.length-i-1;i++){
            for(int j=0;j<input.length-1;j++){
                if(input[j]>input[j+1]){
                    int temp =input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int input[] ={5,6,9,8,-1,4,7,2};
          bubleSort(input);
          for(int i=0;i<input.length;i++){
              System.out.print(input[i]+" ");
          }
    }
}
