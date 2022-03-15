public class SumofKelement{
    public static int[] sum(int[] arr,int k){
        //String s=s.
        int sum=0;
        int size=(int)Math.pow(2,k)-1;
        int[] res=new int[size];
        for(int i=0;i<size;i++) {
            for(int j=i;j<=k+i && j<arr.length;j++){
                sum+=arr[j];
            }
            res[i]=sum;
            sum=0;

        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] res=sum(arr,3);
        for(int i=0;i<arr.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
