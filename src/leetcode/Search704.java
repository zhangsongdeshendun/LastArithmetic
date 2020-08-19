package leetcode;

/**
 * 704. 二分查找
 * 这是正确答案
 */
public class Search704 {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                right = middle - 1;

            } else if (nums[middle] < target) {
                left = middle + 1;
            }
            if (left > right) {
                return -1;
            }
        }
        return -1;

    }
}
