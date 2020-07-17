package swordOfferTestPractice;

public class TwoSumTest {

    public static int[] twoSum(int[] nums, int target) {

        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[2];
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                result[0] = nums[left];
                result[1] = nums[right];
                return result;
            } else if (nums[left] + nums[right] > target) {
                right--;

            } else if (nums[left] + nums[right] < target) {
                left++;
            }
            if (left >= right) {
                return new int[0];
            }

        }
        return new int[0];


    }

//    public static void main(String[] args) {
//        int[] array = {2, 7, 11, 15};
//        twoSum(array, 9);
//    }
}
