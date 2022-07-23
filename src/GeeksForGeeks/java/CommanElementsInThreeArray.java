package GeeksForGeeks.java;
import java.util.*;
public class CommanElementsInThreeArray {
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        ArrayList<Integer>resList=new ArrayList<>();
        int i=0,j=0,k=0;
        while(i<A.length && j<B.length && k<C.length){
            if(A[i]==B[j] && B[j]==C[k]){
                resList.add(A[i]);
                while(i<(A.length-1) && A[i]==A[i+1]){
                    i++;
                }
                while(j<(B.length-1)&& B[j]==B[j+1]){
                    j++;
                }
                while(k<(C.length-1) && C[k]==C[k+1]){
                    k++;
                }
                i++;
                j++;
                k++;
            }
            else if(A[i]<B[j])
                i++;
            else if(B[j]<C[k])
                j++;
            else
                k++;
        }
        return resList;
    }
}
