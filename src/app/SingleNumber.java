package app;

/**
 * 136. 只出现一次的数字
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count ^= nums[i];
        }

        return count;

    }


}
