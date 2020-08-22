package swordOffer;

/**
 * 剑指 Offer 59 - I. 滑动窗口的最大值
 * 这是正确答案
 */
public class MaxSlidingWindow {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        int i = 0;
        int j = k - 1;
        int length = nums.length;
        int[] result = new int[length - k + 1];
        while (j <= length - 1) {
            int max = nums[i];
            for (int index = i + 1; index <= j; index++) {
                max=Math.max(max, nums[index]);

            }
            result[i] = max;
            i++;
            j++;

        }
        return result;


    }

}
