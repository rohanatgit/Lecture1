package TwoDimanstionArray;

import java.util.Scanner;

public class TwodArrayInput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows=sc.nextInt();
        System.out.println("Number of coloums");
        int cols=sc.nextInt();
        int input[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter element at"+i+"row"+j+"column");
                input[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            int rowSum=0;
            for(int j=0;j<cols;j++){
                rowSum+=input[i][j];
            }
            System.out.print(rowSum+" ");
        }
    }


}
