package leetcodeTest;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        binarySerach(array, 7);


    }

    public static void binarySerach(int[] array, int target) {
        if (array == null || array.length == 0) {
            return;
        }
        int left = 0;
        int right = array.length - 1;
        int middle;
        while (left <= right) {
            middle = (left + right) / 2;
            if (array[middle] == target) {
                System.out.println("找到了");
                return;
            } else if (array[middle] > target) {
                right--;
            } else if (array[middle] < target) {
                left++;
            }
            if (left > right) {
                System.out.println("找不到了");
                return;
            }
        }
    }
}
