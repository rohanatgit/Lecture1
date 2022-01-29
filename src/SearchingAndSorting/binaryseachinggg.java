package SearchingAndSorting;

public class binaryseachinggg {
    public static int binarysearching(int[] input ,int element){
        int start =0;
        int end=input.length-1;
        while(start<=end){
            int mid =(start+end)/2;
            if(element==input[mid]){
                return mid;
            }else if(element>input[mid]){
                start =mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] input={1,2,5,41,25};
        int binarysearching=binarysearching(input,255);
        System.out.println(binarysearching);
    }
}
