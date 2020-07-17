package swordOffer;
/**
 * 4题 这是正确答案
 */
public class FindNumberIn2DArray {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int x = matrix.length - 1;
        int y = 0;

        while (x >= 0 && y < matrix[0].length) {
            if (matrix[x][y] == target) {
                return true;
            } else if (matrix[x][y] > target) {
                x--;

            } else if (matrix[x][y] < target) {
                y++;
            }

        }

        return false;

    }


}
