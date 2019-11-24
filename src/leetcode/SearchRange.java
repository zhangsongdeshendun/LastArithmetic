package leetcode;

/**
 * 这是正确答案
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 */
public class SearchRange {

    public int[] searchRange(int[] nums, int target) {
        int[] array = {-1, -1};

        if (nums == null || nums.length <= 0) {
            return array;
        }

        int left = 0;
        int right = nums.length - 1;
        int middle = 0;
        while (left <= right) {
            middle = (left + right) / 2;
            if (nums[middle] > target) {
                right = middle - 1;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                break;
            }
            if (left > right) {
                array[0] = -1;
                array[1] = -1;
                return array;
            }
        }

        for (int i = middle; i >= 0; i--) {
            if (nums[i] != target) {
                array[0] = i+1;
                break;
            }

            if(i==0&&nums[i] == target){
                array[0]=i;
            }

        }

        for (int i = middle; i <nums.length; i++) {
            if (nums[i] != target) {
                array[1] = i-1;
                break;
            }
            if(i==nums.length-1&&nums[i] == target){
                array[1]=i;
            }
        }



        return array;

    }


    public static void main(String[] args) {

    }
}
