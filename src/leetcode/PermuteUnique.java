package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PermuteUnique {
    private List<List<Integer>> resultList = new ArrayList<>();


    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums == null || nums.length == 0) {
            return resultList;
        }

        check(nums, 0);
        return resultList;


    }

    private void check(int[] nums, int index) {

        if (index == nums.length - 1) {
            List<Integer> tempList = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                tempList.add(nums[i]);
            }
            resultList.add(tempList);
        } else {
            HashSet<Integer> set = new HashSet<>();
            for (int i = index; i < nums.length; i++) {
                if (set.contains(nums[i])) {
                    continue;
                }
                set.add(nums[i]);
                swap(nums, i, index);
                check(nums, index + 1);
                swap(nums, i, index);
            }

        }


    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
