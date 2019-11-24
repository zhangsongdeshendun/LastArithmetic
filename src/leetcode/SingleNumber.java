package leetcode;
/**
 * 这是正确答案
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            index ^= nums[i];
        }

        return index;

    }
}
