package swordOffer;

import java.util.HashMap;

/**
 * 这是正确答案 03
 */
public class FindRepeatNumber {


    public int findRepeatNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>(nums.length);

        for (int item : nums) {
            if (!hashMap.containsKey(item)) {
                hashMap.put(item, 1);
            } else {
                int count = hashMap.get(item);
                hashMap.put(item, count + 1);
            }

        }
        for (int item : nums) {
            if (hashMap.get(item) > 1) {

                return item;
            }
        }

        return -1;

    }

}
