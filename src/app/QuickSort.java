package app;

public class QuickSort {

    public static void main(String[] args) {
        int[] num = {3, 45, 78, 64, 52, 11, 64, 55, 99, 11, 18};
        System.out.println(arrayToString(num, "未排序"));
        quickSort(num, 0, num.length - 1);
        System.out.println(arrayToString(num, "已排序"));
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

    private static String arrayToString(int[] arr, String flag) {
        String str = "数组为(" + flag + ")：";
        for (int a : arr) {
            str += a + "\t";
        }
        return str;
    }

}
