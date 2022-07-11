package EEEEEEEEEE;

class Bubblesort {
    static int[] sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={3,2,4,5,7,1,9,4,33,2,22,33};
        int[] ans=sort(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}