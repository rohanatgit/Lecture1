package TotalSearching;

import GeeksForGeeks.Tree.PracticeQuetions.PreorderTree;

public class LInearSearching {
    public static int search(int arr[],int target){
        int n =arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,5,6};
        int target=1;
        int result=search(arr,target);
        if(result==-1){
            System.out.println("Elements is not present");
        }
        else{
            System.out.println("Element is present at index "+result);
        }
    }
}
