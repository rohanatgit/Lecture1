package LeetCodeSolution;

public class ThreeSum {
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);

            int diff = Integer.MAX_VALUE;

            int result = 0;

            for (int i = 0; i < nums.length; ++i) {

                int number = nums[i];

                int low = i + 1;
                int high = nums.length - 1;

                while (low < high) {

                    int total = number + nums[low] + nums[high];

                    if (total == target) {

                        return target;

                    } else if (total > target) {

                        int thisDiff = total - target;

                        if (thisDiff < diff) {

                            result = total;

                            diff = thisDiff;
                        }

                        high--;

                        while (low < high && nums[high] == nums[high+1]) {
                            high--;
                        }

                    } else {

                        int thisDiff = target - total;

                        if (thisDiff < diff) {

                            result = total;

                            diff = thisDiff;
                        }

                        low++;

                        while (low < high && nums[low] == nums[low-1]) {
                            low++;
                        }

                    }
                }
            }

            return result;
        }
    }

}
