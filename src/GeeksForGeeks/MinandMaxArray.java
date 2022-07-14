package GeeksForGeeks;

public class MinandMaxArray {
        static int  pairgetMinMax(long a[], long n)
        {
            //Write your code here
            long max=a[0];
            long min=a[0];
            for(int i=0;i<a.length;i++){
                if(a[i]>max){
                    max=a[i];
                }
                else if(a[i]<min){
                    min=a[i];
                }
            }
            return new pairgetMinMax(min,max);
        }}