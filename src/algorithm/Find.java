package algorithm;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Find {

    public boolean fun(int target, int[][] array) {

        int x = array.length - 1;
        int y = 0;

        while (x >= 0 && x <= array.length - 1 && y >= 0 && y <= array[0].length - 1) {
            if (array[x][y] > target) {
                x--;
            } else if (array[x][y] < target) {
                y++;
            } else {
                return true;
            }

        }

        return false;

    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        Find find = new Find();
        System.out.println(find.fun(30, arr));

    }
}
