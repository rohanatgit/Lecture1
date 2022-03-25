/* Quick Sort
This algorithm is based on divide and conquer algorithm (We take the bigger problem , break it down to the smaller problem, try to solve the solution to
smaller problem and then join the smaller solutions to get the final result
concept of quick sort algorithm
===============================
At each step it finds "pivot" (Means point of division)and then make sure that all the smaller elements are at left side of the pivot and all bigger
elements are at right side of pivot. This we will do multiple times(Recursively) so that we get the final answer
*/

public class QuickSortDemo {
    public static void quicksort(int arr[], int start, int end)
    {
        if (start < end) {
            int pivot = partition(arr, start, end);
            // recursively calling the method here
            // left side of array
            quicksort(arr, start, pivot-1 );
            // right side of array
            quicksort(arr, pivot + 1,end);
        }
    }
    // here in this partition method we are going to break down the array
    // main logic of quick sort
    public static int partition(int arr[], int p , int q )
    {
        int pivot= q;
        int i = p-1;
        for(int j =p; j<=q;j++)
        {
            if(arr[j]<=arr[pivot])
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        } // end of the loop
        return i;
    }
    public static void display(int arr[])
    {
        for(int i =0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {45, 6 ,89,2 ,30,50,2};
        quicksort(arr,0,arr.length-1);
        display(arr);
    }
}