package leetcodeTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PermuteTest {
    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) {
            return result;
        }
        makeNum(nums, 0);

        return result;


    }

    private void makeNum(int[] nums, int index) {
        if (index == nums.length - 1) {
            List<Integer> tempList = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                tempList.add(nums[i]);
            }
            result.add(tempList);
        } else {
            HashSet<Integer> hashSet = new HashSet<>();
            for (int i = index; i < nums.length; i++) {
                if (hashSet.contains(nums[i])) {
                    continue;
                }
                hashSet.add(nums[i]);
                swap(nums, i, index);
                makeNum(nums, index + 1);
                swap(nums, i, index);
            }

        }

    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
