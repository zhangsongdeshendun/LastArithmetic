package swordOffer;

/**
 * 这是正确答案 53-1
 */
public class Search {


    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        int index = 0;
        int count = 0;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (target == nums[middle]) {
                index = middle;
                break;

            } else if (target < nums[middle]) {
                right--;

            } else if (target > nums[middle]) {
                left++;
            }
            if (left > right) {
                return 0;
            }

        }

        for (int i = index; i >= 0; i--) {
            if (nums[i] == target) {
                count++;
            } else {
                break;
            }

        }

        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] == target) {
                count++;
            } else {
                break;
            }

        }
        return count;

    }

}
