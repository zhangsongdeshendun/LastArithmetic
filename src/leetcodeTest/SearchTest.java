package leetcodeTest;

public class SearchTest {
    private int index = -1;

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return index;
        }
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
        search(nums, 0, left - 1, target);
        search(nums, left, nums.length - 1, target);
        return index;


    }

    private void search(int[] nums, int left, int right, int target) {

        if (left > right) {
            return;
        }
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) {
                index = middle;
                return;
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else if (nums[middle] < target) {
                left = middle + 1;
            }
            if (left > right) {
                return;
            }
        }

    }


}
