import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        int arr1[] =new int[n];
        int arr2[] =new int[m];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int j=0;j<m;j++){
            arr2[j]=sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println("Yes");
                    break;
                }
            }
        }

                    System.out.println("No");
    }}
