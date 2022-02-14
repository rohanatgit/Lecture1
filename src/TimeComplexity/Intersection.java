package TimeComplexity;
import java.util.Arrays;

public class Intersection {
    public static void intersection(int arr1[], int arr2[]) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int n = arr1.length;
        int m = arr2.length;
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (arr1[i] == arr2[j]) {
                System.out.println(arr1[i] + " ");
                i += 1;
                j += 1;

            } else if (arr1[i] < arr2[j]) {
                i = i + 1;
            } else {
                j += 1;
            }
        }
    }                                                // TIME COMPLEXITY =nlogn+mlogm
    public static void main(String[] args) {
        int[] a1 = {5, 6, 5, 8, 5, 6, 4, 1, 0};
        int[] a2 = {2, 5, 6, 2, 4, 5, 6, 6};
        intersection(a1,a2);

    }
}