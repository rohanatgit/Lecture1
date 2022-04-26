package TotalSorting;

public class InsertionSort {
    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j - 1;
            while ((i > -1) && (arr[i] > key)) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
    }

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}