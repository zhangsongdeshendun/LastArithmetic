package leetcode;

/**
 * 215. 数组中的第K个最大元素
 * 这是正确答案
 */
public class FindKthLargest {


    public int findKthLargest(int[] nums, int k) {
        quickSort(nums, 0, nums.length - 1);
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - k) {
                return nums[i];
            }

        }
        return -1;


    }


    private void quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int i = left;
        int j = right;
        int target = nums[i];
        while (i < j) {
            while (i < j && target <= nums[j]) {
                j--;
            }

            while (i < j && target >= nums[i]) {
                i++;
            }
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

        }
        nums[left] = nums[i];
        nums[i] = target;
        quickSort(nums, left, i - 1);
        quickSort(nums, i + 1, right);
    }

   public static void main(String[] args){
       FindKthLargest findKthLargest=new FindKthLargest();
       int[] array={3,2,1,5,6,4};
       System.out.println(findKthLargest.findKthLargest(array,6)+"");
   }
}
