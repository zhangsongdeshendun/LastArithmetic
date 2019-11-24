package leetcode;

/**
 * 这是正确答案
 */
public class SearchInsert {

    public static int searchInsert(int[] nums, int target) {

        if (nums == null || nums.length == 0)
            return -1;

        int left = 0;
        int right = nums.length - 1;
        int middle;
        while (left <= right) {
            middle = (left + right) / 2;

            if (nums[middle] > target) {
                right--;
            }
            if (nums[middle] < target) {
                left++;
            }
            if (nums[middle] == target) {
                return middle;
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

    public static void main(String[] args) {
        System.out.println("ok");
        int[] num = {0, 1, 2, 3, 5, 6, 7, 8, 9};
        System.out.println(searchInsert(num, -2) + "");
    }
}
