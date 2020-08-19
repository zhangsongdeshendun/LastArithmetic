package leetcodeTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PermuteUniqueTest {
    List<List<Integer>> resultList = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums == null || nums.length == 0) {
            return resultList;
        }
        make(nums, 0);
        return resultList;


    }

    private void make(int[] nums, int index) {
        if (nums.length - 1 == index) {
            List<Integer> list = new ArrayList<>();
            for (int item : nums) {
                list.add(item);
            }
            resultList.add(list);
        } else {
            HashSet<Integer> hashSet = new HashSet<>();
            for (int i = index; i < nums.length; i++) {
                if (hashSet.contains(nums[i])) {
                    continue;
                }
                hashSet.add(nums[i]);
                swap(nums, i, index);
                make(nums, index + 1);
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
