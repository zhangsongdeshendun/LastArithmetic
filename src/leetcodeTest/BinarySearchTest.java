package leetcodeTest;

public class BinarySearchTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        binarySerach(array, 9);


    }

    private static void binarySerach(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int middle;
        while (left <= right) {
            middle = (left + right) / 2;
            if (array[middle] == target) {
                System.out.println("找到了");
                return;
            } else if (array[middle] > target) {
                right = middle - 1;

            } else if (array[middle] < target) {
                left = middle + 1;
            }
            if (left > right) {
                System.out.println("没有找到");
                return;
            }
        }

    }


}
