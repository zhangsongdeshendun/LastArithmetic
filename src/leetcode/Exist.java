package leetcode;

/**
 * 79. 单词搜索
 * 这是正确答案
 */
public class Exist {
    private String mWord;

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        mWord = word;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, i, j, 0)) {
                    return true;
                }

            }

        }
        return false;

    }

    private boolean dfs(char[][] board, int i, int j, int index) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != mWord.charAt(index)) {
            return false;
        }
        if (index == mWord.length() - 1) {
            return true;
        }
        char temp = board[i][j];
        board[i][j] = '.';

        boolean flag = dfs(board, i - 1, j, index + 1) || dfs(board, i + 1, j, index + 1) ||
                dfs(board, i, j - 1, index + 1) || dfs(board, i, j + 1, index + 1);
        board[i][j] = temp;
        return flag;


    }


}
