package app;

public class SearchRange {

    public static void main(String[] args) {
        int[] array = {1};

        int[] result = searchRange(array, 1);
        System.out.println("x1=" + result[0] + "x2=" + result[1]);
    }

    public static int[] searchRange(int[] nums, int target) {

        int[] result = {-1, -1};
        if (nums == null || nums.length <= 0) {
            return result;
        }

        int middle = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            middle = (left + right) / 2;
            if (nums[middle] == target) {
                break;
            } else if (nums[middle] > target) {

                right = middle - 1;
            } else if (nums[middle] < target) {
                left = middle + 1;
            }

            if (left > right) {
                return result;
            }
        }

        for (int i = middle; i >= 0; i--) {
            if (nums[i] != target) {
                result[0] = i + 1;
                break;
            }
            if (i == 0 && nums[i] == target) {
                result[0] = i;
            }
        }

        for (int i = middle; i < nums.length; i++) {
            if (nums[i] != target) {
                result[1] = i - 1;
                break;
            }
            if (i == nums.length - 1 && nums[i] == target) {
                result[1] = i;
            }
        }

        return result;


    }
}
