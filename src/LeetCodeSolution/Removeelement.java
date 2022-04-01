package LeetCodeSolution;

public class Removeelement {
    public int removeElement(int[] nums, int val) {
        int validsize=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[validsize]=nums[i];
                validsize++;
            }
        }
        return validsize;
    }
}
