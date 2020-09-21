package swordOfferTestPractice;

public class IsStraightTest {


    public boolean isStraight(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int count = 0;
        for (int item : nums) {
            if (item == 0) {
                count++;

            }

        }

        quickSort(nums, 0, nums.length - 1);


        int gap = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                continue;
            }
            if (nums[i + 1] == nums[i]) {
                return false;
            }

            if (nums[i + 1] - nums[i] == 1) {
                continue;
            } else {
                gap += nums[i + 1] - nums[i] - 1;
            }


        }
        return count >= gap;


    }

    public static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int i = left;
        int j = right;
        int target = array[left];
        while (i < j) {
            while (i < j && array[j] >= target) {
                j--;
            }
            while (i < j && array[i] <= target) {
                i++;
            }
            if (i < j) {
                int tem = array[i];
                array[i] = array[j];
                array[j] = tem;
            }
        }

        array[left] = array[i];
        array[i] = target;
        quickSort(array, left, i - 1);
        quickSort(array, i + 1, right);

    }


}
