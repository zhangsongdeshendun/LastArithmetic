package algorithm;


/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Sword1 {

    public static void find(int target, int[][] array) {

        for (int i = 0; i < array.length; i++) {

            int low = 0;
            int high = array[i].length-1;
            int mid;
            while (high >= low) {
                mid = (low + high) / 2;
                if (target == array[i][mid]) {
                    System.out.println("已经找到了");
                    return;
                } else if (target > array[i][mid]) {
                    low = mid + 1;
                } else if (target < array[i][mid]) {
                    high = mid - 1;
                } else if (low > high) {
                    break;
                }

            }


        }


    }


    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        find(80, arr);

    }
}
