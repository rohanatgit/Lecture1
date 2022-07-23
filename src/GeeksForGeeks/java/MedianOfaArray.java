package GeeksForGeeks.java;

public class MedianOfaArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        int n=arr.length;
        int i=0;
        int j=0,c=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]>nums2[j]){
                arr[c]=nums2[j];
                c++;
                j++;
            }
            else{
                arr[c]=nums1[i];
                c++;
                i++;
            }
        }
        while(i<nums1.length){
            arr[c]=nums1[i];
            c++;
            i++;
        }
        while(j<nums2.length){
            arr[c]=nums2[j];
            c++;
            j++;
        }
        if(n%2!=0){
            return (double)arr[n/2];
        }
        return (double)(arr[n/2]+arr[(n-1)/2])/2;
    }
}
