package SearchingAndSorting;

import java.util.Scanner;

public class Sorted0_1_2 {
    public static int  sorted012(int[] arr) {
        int nextZeor = 0;
        int i = 0;
        int nextTwo = arr.length;
        while (i <= nextZeor) {
            if (arr[i] == 0) {
                int temp = arr[nextZeor];
                arr[nextZeor] = arr[i];
                arr[i] = temp;
                nextZeor++;
                i++;
            } else if (arr[i] == 2) {
                int temp=arr[nextTwo];
                arr[nextTwo]=arr[i];
                arr[i]=temp;
                nextTwo--;
            }else{
                i++;
            }
        }
        return arr[i];
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       /* int T =sc.nextInt();
        for(int i=0;i<T;i++){*/
            int n =sc.nextInt();
            int arr[] =new int[n];
            for(int j =0;j< arr.length;j++){
                arr[j]=sc.nextInt();
            }
            System.out.println(sorted012(arr));
        }
    }
