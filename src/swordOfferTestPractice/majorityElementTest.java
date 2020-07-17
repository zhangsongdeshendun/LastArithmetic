package swordOfferTestPractice;

public class majorityElementTest {

    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int count = 1;
        int index = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (index == nums[i]) {
                count++;
            } else {
                count--;
                if (count <= 0) {
                    index = nums[i];
                    count++;
                }
            }

        }
        if (count > 1) {
            return index;
        }
        return -1;

    }

}
