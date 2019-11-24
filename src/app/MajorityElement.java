package app;

public class MajorityElement {


    public int majorityElement(int[] nums) {

        int index = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {

            if (index == nums[i]) {
                count++;
            } else {
                count--;
                if (count <= 0) {
                    count = 1;
                    index = nums[i];
                }
            }

        }
        if (count >= 1) {
            return index;
        }

        return -1;

    }
}
