package swordOfferTestPractice;

public class SearchTest {

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        int position = 0;
        int count = 0;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) {
                position = middle;
                count++;
                break;
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }

            if (left > right) {
                return 0;
            }

        }

        for (int i = position - 1; i >= 0; i--) {
            if (i < 0 || i >= nums.length) {
                continue;
            }
            if (nums[i] == target) {
                count++;
            }

        }
        for (int i = position + 1; i < nums.length; i++) {
            if (i < 0 || i >= nums.length) {
                continue;
            }
            if (nums[i] == target) {
                count++;
            }

        }
        return count;


    }

}
