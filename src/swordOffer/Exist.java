package swordOffer;

/**
 * 剑指 Offer 12. 矩阵中的路径
 * 这是正确
 */
public class Exist {


    public boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, chars, i, j, 0)) {
                    return true;
                }

            }

        }
        return false;


    }

    private boolean dfs(char[][] board, char[] chars, int i, int j, int index) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != chars[index]) {
            return false;
        }
        if (index == chars.length - 1) {
            return true;
        }
        char temp = board[i][j];
        //已经做了 标记
        board[i][j] = '.';

        boolean result = dfs(board, chars, i + 1, j, index + 1) || dfs(board, chars, i - 1, j, index + 1)
                || dfs(board, chars, i, j + 1, index + 1) || dfs(board, chars, i, j - 1, index + 1);

        //回朔
        board[i][j] = temp;
        return result;


    }


}
