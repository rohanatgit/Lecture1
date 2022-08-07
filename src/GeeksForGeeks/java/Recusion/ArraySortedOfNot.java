package GeeksForGeeks.java.Recusion;

public class ArraySortedOfNot {
    static boolean isSorted1(int a[]){
        if(a.length==1){
            return true;
        }
        if(a[0]>a[1]){
            return false;
        }
        int sa[]=new int[a.length-1];
        for(int i=1;i<a.length;i++){
            sa[i-1]=a[i];
        }
        boolean ismallArray=isSorted1(sa);
        return ismallArray;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,6};
        System.out.println( isSorted1(a));
    }
}
