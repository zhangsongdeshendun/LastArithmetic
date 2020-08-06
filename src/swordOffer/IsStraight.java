package swordOffer;

/**
 * 剑指 Offer 61. 扑克牌中的顺子
 *
 *这是正确答案
 */
public class IsStraight {
    public boolean isStraight(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        qucikSort(nums, 0, nums.length - 1);
        int zeroNum = 0;

        for (int item : nums) {
            if (item == 0) {
                zeroNum++;
            }

        }

        int gap = 0;
        for (int i = zeroNum + 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return false;
            }
            gap += nums[i] - nums[i - 1] - 1;
        }

        return zeroNum >= gap;


    }

    private void qucikSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int i = left;
        int j = right;
        int target = nums[i];
        while (i < j) {
            while (i < j && target <= nums[j]) {
                j--;
            }
            while (i < j && target >= nums[i]) {
                i++;
            }
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

            }
        }
        nums[left] = nums[i];
        nums[i] = target;
        qucikSort(nums, left, i - 1);
        qucikSort(nums, i + 1, right);

    }
}
