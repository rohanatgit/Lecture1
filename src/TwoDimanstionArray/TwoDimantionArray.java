package TwoDimanstionArray;

import java.util.Scanner;

public class TwoDimantionArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of rows ");
        int rows =sc.nextInt();
        System.out.println("Number of coloum ");
        int cols=sc.nextInt();
        int input[][]=new int[rows][cols];
        for(int i=0;i<rows-1;i++){
            for(int j=0;j<cols;j++){
                System.out.println("enter elements "+i+"row"+j+"colum");
                input[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(input[i][j]+" ");
            }
            System.out.println();
        }
    }

}
