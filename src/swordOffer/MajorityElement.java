package swordOffer;
/**
 * 39 这是正确答案
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {

        int count = 1;
        int target = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (target == nums[i]) {
                count++;
            } else {
                count--;
                if (count <= 0) {
                    target = nums[i];
                    count++;
                }
            }

        }
        if (count >= 1) {
            return target;
        }

        return 0;

    }

}
