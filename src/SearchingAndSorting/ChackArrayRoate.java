package SearchingAndSorting;

    import java.util.Scanner;

    public class ChackArrayRoate {
        public static int checkIndexrotation(int[] arr){
            int min=arr[0], c=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]<min){
                    min=arr[i];
                    c=i;
                }
            }
            return c;
        }
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            for (int i = 0; i < T; i++) {
                int n = s.nextInt();
                int[] arr=new int[n];
                for (int j = 0; j <n;j++){
                    arr[j]=s.nextInt();
                }
                System.out.println(checkIndexrotation(arr));
            }

        }
    }
