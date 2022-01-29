public class PushZeroes {
    public static int pushZeroes(int arr[]){
        int nonzeroes=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp =arr[i];
                 arr[i]=arr[nonzeroes];
                 arr[nonzeroes]=temp;
                 nonzeroes++;
            }
        }
        return nonzeroes;
    }

    public static void main(String[] args) {
        int arr[] ={0,1,2,4,0,0,2,5,3};
        pushZeroes(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
