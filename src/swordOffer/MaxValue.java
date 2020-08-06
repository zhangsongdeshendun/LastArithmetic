package swordOffer;

/**
 * 剑指 Offer 47. 礼物的最大价值
 * 这是正确答案
 */
public class MaxValue {

    public int maxValue(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    continue;
                } else if (i == 0) {
                    grid[i][j] += grid[i][j - 1];
                } else if (j == 0) {
                    grid[i][j] += grid[i - 1][j];
                } else {
                    grid[i][j] += Math.max(grid[i][j - 1], grid[i - 1][j]);
                }

            }

        }
        return grid[m - 1][n - 1];


    }

}
