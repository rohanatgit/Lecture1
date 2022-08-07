package GeeksForGeeks.java.Recusion;

public class lastIndexfindInArray {
    public static int lastIndex(int a[], int x) {
        if(a.length==0){
            return -1;
        }
        if(a[a.length-1]==x){
            return a.length-1;
        }
        int smallArray[]=new int[a.length-1];
        for(int i=1;i<a.length;i++){
            smallArray[i-1]=a[i];
        }
        int li=lastIndex(smallArray,x);
        if(li==-1){
            return -1;
        }
        else{
            return li;
        }
    }
}
