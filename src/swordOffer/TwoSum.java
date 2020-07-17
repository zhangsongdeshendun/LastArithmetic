package swordOffer;
/**
 * 57 这是正确答案
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int temp = nums[left] + nums[right];
            if (temp == target) {
                result[0] = nums[left];
                result[1] = nums[right];
                break;
            } else if (temp < target) {
                left++;

            } else if (temp > target) {
                right--;

            }
            if (left >= right) {
                return new int[0];
            }
        }

        return result;

    }

}
