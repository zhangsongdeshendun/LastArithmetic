package leetcode;

/**
 * 27. 移除元素 正确答案
 */
public class RemoveElement {


    public static int removeElement(int[] nums, int val) {

        int appearCount = 0;
        for (int item : nums) {
            if (item == val) {
                appearCount++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                int j = nums.length - 1;
                while (j >= 0 && nums[j] == val) {
                    j--;
                }
                if (j > i) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }


            }

        }


        return nums.length - appearCount;

    }

    public static void main(String[] args) {
        int[] array = {1};
        removeElement(array, 1);
        for (int item : array) {
            System.out.println(item + "");
        }

    }


}
