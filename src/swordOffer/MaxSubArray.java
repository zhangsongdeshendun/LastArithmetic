package swordOffer;

/**
 * 42 这是正确答案
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int currentMax = nums[0];
        int sumMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (currentMax >= 0) {
                currentMax += nums[i];
            } else {
                currentMax = nums[i];
            }
            if (sumMax < currentMax) {
                sumMax = currentMax;
            }

        }

        return sumMax;


    }
}
