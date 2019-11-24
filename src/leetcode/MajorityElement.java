package leetcode;

/**
 * 这是正确答案
 *
 * 169. 求众数
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {

        int count = 1;

        int index = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (index == nums[i]) {
                count++;
            } else {
                count--;
                if (count <= 0) {
                    index = nums[i];
                    count = 1;
                }
            }
        }

        if (count >= 1) {
            return index;
        }

        return 0;


    }
}
