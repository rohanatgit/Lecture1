public class MOveZero {
    public static boolean moveZeroes(int[] nums) {
        int l = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[l] = 0;
                l--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[]={1,2,5,0,2,50,1,2,0,5,0,0,5,2,0};
        System.out.println(moveZeroes(nums));
    }
}
