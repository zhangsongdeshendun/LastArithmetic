package leetcodeTest;

public class ExchangeTest {


    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (left < right && nums[right] % 2 == 0) {
                right--;
            }
            while (left < right && nums[left] % 2 != 0) {
                left++;
            }
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }

        }
        return nums;

    }


}
