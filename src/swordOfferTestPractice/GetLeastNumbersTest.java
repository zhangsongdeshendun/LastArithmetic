package swordOfferTestPractice;

public class GetLeastNumbersTest {


    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        quick(arr, 0, arr.length - 1);

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr[i];
        }
        return result;

    }

    private void quick(int[] array, int left, int right) {
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
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        array[left] = array[i];
        array[i] = target;
        quick(array, left, i - 1);
        quick(array, i + 1, right);
    }
}
