package TimeComplexity;

import java.util.Arrays;

public class pairSum {
    public static int pairSum(int arr[],int num){
        Arrays.sort(arr);
        int startIndex=0;
        int endIndex=(arr.length-1);
        int numPair=0;
        while(startIndex<endIndex){
            if(arr[startIndex]+arr[endIndex]<num){
                startIndex++;
            }
            else if(arr[startIndex]+arr[endIndex]>num){
                endIndex--;
            }
            else{
                int elementStart=arr[startIndex];
                int elementAtEnd=arr[endIndex];
                if(elementStart ==elementAtEnd){
                    int totalElementsFromStarttoend=(endIndex-startIndex)+1;
                    numPair+=(totalElementsFromStarttoend*(totalElementsFromStarttoend-1)/2);
                    return numPair;
                }
                int tempStartIndex=startIndex+1;
                int tempEndindex=endIndex-1;
                while(tempStartIndex<=tempEndindex && arr[tempStartIndex]==elementStart){
                    tempStartIndex+=1;
                }
                while(tempEndindex>=tempStartIndex && arr[tempEndindex]==elementAtEnd){
                    tempEndindex-=1;
                }
                int totalElementsFromStart=(tempStartIndex-startIndex);
                int totalElementsFromend=(endIndex-tempEndindex);
                numPair+=(totalElementsFromStart*totalElementsFromend);
                startIndex=tempStartIndex;
                endIndex=tempEndindex;
            }
        }
        return numPair;
    }

    public static void main(String[] args) {

        int arr[]={1,3,6,2,5,4,3,2,4};
        System.out.println(pairSum(arr,7));
    }
}
