package swordOffer;

/**
 * 剑指 Offer 40. 最小的k个数
 * 这是正确答案
 */
public class GetLeastNumbers {


    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr == null || k > arr.length) {
            return new int[0];
        }
        sort(arr, 0, arr.length - 1);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr[i];
        }
        return result;

    }

    private void sort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int i = left;
        int j = right;
        int target = array[i];
        while (i < j) {
            while (i < j && target <= array[j]) {
                j--;
            }
            while (i < j && target >= array[i]) {
                i++;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        array[left] = array[i];
        array[i] = target;
        sort(array, left, i - 1);
        sort(array, i + 1, right);

    }


}
