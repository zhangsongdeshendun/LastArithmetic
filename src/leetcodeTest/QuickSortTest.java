package leetcodeTest;

public class QuickSortTest {

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
