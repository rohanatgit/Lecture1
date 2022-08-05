package GeeksForGeeks.java.Recusion;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            System.out.println();
        }
        for (int m = arr.length - 1; m >= 0; m--) {
            System.out.print(arr[m] + " ");
        }

    }
}