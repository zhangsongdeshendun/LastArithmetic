package leetcode;

/**
 * 153. 寻找旋转排序数组中的最小值
 * 这是正确答案
 */
public class FindMin {

    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int middle = (left + right) / 2;

            if (nums[middle] < nums[right]) {
                right = middle;
            } else if (nums[middle] > nums[right]) {
                left = middle + 1;
            } else {
                right--;
            }

        }

        return nums[left];

    }


}
