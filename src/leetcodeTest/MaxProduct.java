package leetcodeTest;

public class MaxProduct {

    public int maxProduct(int[] nums) {

        int tempMax = 1, tempMin = 1, max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = tempMax;
                tempMax = tempMin;
                tempMin = temp;
            }
            tempMax = Math.max(nums[i], tempMax * nums[i]);
            tempMin = Math.min(nums[i], tempMin * nums[i]);
            max = Math.max(max, tempMax);
        }

        return max;
    }
}
