package ArrayWithKunal.LinearSearch;

public class program1 {

    public static  int linearSearch(int [] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,46,42,3,4};
        int target=46;
        System.out.println(linearSearch(arr,target));
    }
}
