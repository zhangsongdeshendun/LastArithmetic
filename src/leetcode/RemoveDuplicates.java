package leetcode;

/**
 * 26. 删除排序数组中的重复项
 * 这是正确答案
 * 快慢指针，j是快指针
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }

        }
        return i + 1;

    }

    public static void main(String[] args){
        RemoveDuplicates removeDuplicates=new RemoveDuplicates();
        removeDuplicates.removeDuplicates(new int[]{1,2,3});
    }

}
