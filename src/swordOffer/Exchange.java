package swordOffer;

/**
 * 21题 这是正确答案
 */
public class Exchange {

    public int[] exchange(int[] nums) {
        if (nums == null) {
            return new int[0];
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {

            while (left < right && nums[left] % 2 == 1) {
                left++;
            }

            while (left < right && nums[right] % 2 == 0) {
                right--;
            }

            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }

        return nums;

    }


}
