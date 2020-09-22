package swordOfferTestPractice;

public class MaxSlidingWindowTest {


    public int[] maxSlidingWindow(int[] nums, int k) {

        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        int[] result = new int[nums.length - k + 1];
        int i = 0;
        int j = k - 1;
        while (j <= nums.length - 1) {

            int max = nums[i];
            for (int index = i; index <= j; index++) {
                max = Math.max(max, nums[index]);

            }
            result[i] = max;
            i++;
            j++;

        }

        return result;


    }

}
