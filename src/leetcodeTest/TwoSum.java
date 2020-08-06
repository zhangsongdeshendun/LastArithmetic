package leetcodeTest;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        if (nums == null || nums.length <= 1) {
            return null;
        }
        int[] array = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                array[0] = hashMap.get(nums[i]);
                array[1] = i;

            } else {
                hashMap.put(target - nums[i], i);
            }
        }

        return array;


    }

    public static void main(String[] args) {
        int[] num = {2, 7, 11, 15};
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(num, 9);
        System.out.println("x1=" + result[0] + "    x2=" + result[1]);
    }


}
