package leetcode;

/**
 * 74. 搜索二维矩阵
 * 这是正确答案
 */
public class SearchMatrix {


    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null) {
            return false;
        }
        int m = matrix.length-1;
        int n = 0;

        while (m >= 0 && n < matrix[0].length) {
            if (matrix[m][n] > target) {
                m--;

            } else if (matrix[m][n] < target) {
                n++;
            } else {
                return true;
            }

        }
        return false;


    }


}
