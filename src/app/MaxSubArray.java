package app;

public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (currentSum < 0) {
                currentSum = nums[i];
            } else {
                currentSum += nums[i];
            }
            if (maxSum < currentSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;


    }
}
