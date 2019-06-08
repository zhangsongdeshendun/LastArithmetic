package algorithm;

/**
 * 二分搜索
 */
public class BinarySearch {

    public static void binarySearch(int[] array, int index) {
        int high = array.length - 1;
        int low = 0;
        int mid;

        while (high >= low) {
            mid = (high + low) / 2;
            if (index == array[mid]) {
                System.out.println("已经找到了");
                break;
            } else if (index > array[mid]) {
                low = mid + 1;
            } else if (index < array[mid]) {
                high = mid - 1;
            } else if (high < low) {
                System.out.println("这里没有哦");
                break;
            }
        }

    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19, 20, 21};
        binarySearch(arr, 21);

    }


}
