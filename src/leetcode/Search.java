package leetcode;

/**
 * 33. 搜索旋转排序数组
 * 这是正确答案
 * （这种解法是自己写的哦）
 */
public class Search {
    public int result = -1;

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int middle = (left + right) / 2;
            if (nums[middle] > nums[right]) {
                left = middle + 1;
            } else if (nums[middle] < nums[right]) {
                right = middle;

            } else {
                right--;
            }
        }
        check(nums, 0, left - 1, target);
        check(nums, left, nums.length - 1, target);

        return result;


    }

    private void check(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) {
                result = middle;
                return;
            } else if (nums[middle] > target) {
                right = middle - 1;

            } else {
                left = middle + 1;
            }

            if (left > right) {
                return;
            }


        }


    }


}
