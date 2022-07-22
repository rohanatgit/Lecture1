package GeeksForGeeks.java;

import java.util.Scanner;

public class ReverseanArray {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            for (int k = n - 1; k >= 0; k--) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }
}
