package app;

public class SearchInsert {

    public int searchInsert(int[] nums, int target) {

        if (nums == null || nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        int middle;
        while (left <= right) {
            middle = (left + right) / 2;

            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                right--;
            } else if (nums[middle] < target) {
                left ++;
            }
            if (left > right) {
                if (target > nums[nums.length - 1]) {
                    return middle + 1;
                } else {
                    return middle;
                }
            }
        }

        return -1;

    }

}
