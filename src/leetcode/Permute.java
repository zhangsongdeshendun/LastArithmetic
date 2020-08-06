package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * 46. 全排列
 * 这是正确答案
 */
public class Permute {
    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        check(nums, 0);
        return result;


    }

    private void check(int[] nums, int index) {
        if (index == nums.length - 1) {
            ArrayList<Integer> tempList = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                tempList.add(nums[i]);
            }
            result.add(tempList);


        } else {
            ArrayList noRepeatList = new ArrayList();
            for (int i = index; i < nums.length; i++) {
                if (noRepeatList.contains(nums[i])) {
                    continue;
                }
                noRepeatList.add(nums[i]);
                swap(nums, i, index);
                check(nums, index + 1);
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
