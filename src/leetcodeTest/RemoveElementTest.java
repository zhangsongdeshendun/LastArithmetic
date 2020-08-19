package leetcodeTest;

public class RemoveElementTest {

    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int count = 0;
        for (int item : nums) {
            if (item == val) {
                count++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                int j = nums.length - 1;
                while (j>=0&&nums[j] == val) {
                    j--;
                }
                if (i < j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }

            }
        }


        return nums.length - count;

    }


}
