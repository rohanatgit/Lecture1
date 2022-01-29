package Lecture2Pattern;

import java.util.Scanner;

public class PattenPrintZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int j = 1;
        while (i <= n) {
            j = n;
            while (j >= 1) {
                if (i == 1 || i == n || i == j)
                    System.out.print("*");
                else
                    System.out.print(" ");
                j--;
            }
            System.out.println();
            i++;
        }
    }
}