package swordOffer;

/**
 * 这是正确答案
 * 剑指 Offer 29. 顺时针打印矩阵
 *
 */
public class SpiralOrder {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[m * n];
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        int index = 0;
        while (true) {
            // 上面行，从左往右打印（行不变，改变列的下标）
            for (int i = left; i <= right; i++) {
                result[index++] = matrix[top][i];
            }
            if (++top > bottom) {
                break;
            }
            // 右边列，从上往下打印（列不变，改变行的下标）
            for (int i = top; i <= bottom; i++) {
                result[index++] = matrix[i][right];
            }
            if (--right < left) {
                break;
            }
            // 下面行，从右往左打印（行不变，改变列的下标）
            for (int i = right; i >= left; i--) {
                result[index++] = matrix[bottom][i];
            }
            if (--bottom < top) {
                break;
            }
            // 左边列，从下往上打印（列不变，改变行的下标）
            for (int i = bottom; i >= top; i--) {
                result[index++] = matrix[i][left];
            }
            if (++left < right) {
                break;
            }


        }
        return result;


    }
}
